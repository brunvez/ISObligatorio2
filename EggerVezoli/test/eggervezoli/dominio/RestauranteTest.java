/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {

    private final int UN_DIA = 60 * 60 * 24;

    @Test
    public void testUsuariosQueEvaluaronDevuelveLosUsuariosDeLasEvaluaciones() throws InvalidDateRangeException {
        Restaurante instance = new Restaurante("restaurante de prueba", "direccion de prueba", "horario de prueba", "tipo de comida de prueba");
        ArrayList<Usuario> users = new ArrayList<>();
        int numeroDeUsuariosEsperados = 4;

        for (int i = 0; i < 4; i++) {
            users.add(new Usuario("usuario" + i, "a@example.com"));
        }
        users.stream().forEach((u) -> {
            try {
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date()));
            } catch (InvalidCalificationException ex) {
                System.err.println("La calificacion no pudo ser creada");
            }
        });
        int numeroDeUsuariosObtenidos = instance.usuariosQueEvaluaron(new Date(), new Date()).size();

        assertEquals(numeroDeUsuariosEsperados, numeroDeUsuariosObtenidos);
    }

    @Test
    public void testUsuariosQueEvaluaronDevuelveLosUsuariosNoNulosDeLasEvaluaciones() throws InvalidDateRangeException {
        Restaurante instance = new Restaurante("restaurante de prueba", "direccion de prueba", "horario de prueba", "tipo de comida de prueba");
        ArrayList<Usuario> users = new ArrayList<>();
        int numeroDeUsuariosEsperados = 5;

        for (int i = 0; i < 5; i++) {
            users.add(new Usuario("usuario" + i, "a@example.com"));
        }
        users.stream().forEach((u) -> {
            try {
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date()));
            } catch (InvalidCalificationException ex) {
                System.err.println("La calificacion no pudo ser creada");
            }
        });
        int numeroDeUsuariosObtenidos = instance.usuariosQueEvaluaron(new Date(), new Date()).size();

        assertEquals(numeroDeUsuariosEsperados, numeroDeUsuariosObtenidos);
    }

    @Test
    public void testUsuariosQueEvaluaronDevuelveUnaListaVaciaSiTodosLosUsuariosSonNulos() throws InvalidDateRangeException {
        Restaurante instance = new Restaurante("restaurante de prueba", "direccion de prueba", "horario de prueba", "tipo de comida de prueba");
        ArrayList<Usuario> listaEsperada = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            try {
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", null, new Date()));
            } catch (InvalidCalificationException ex) {
                System.err.println("La calificacion no pudo ser creada");
            }
        }
        ArrayList<Usuario> listaObtenida = instance.usuariosQueEvaluaron(new Date(), new Date());

        assertEquals(listaEsperada, listaObtenida);
    }

    @Test
    public void testUsuariosQueEvaluaronDevuelveLosUsuariosEnElRangoDeFechaDado() throws InvalidDateRangeException {
        Restaurante instance = new Restaurante("restaurante de prueba", "direccion de prueba", "horario de prueba", "tipo de comida de prueba");
        ArrayList<Usuario> users = new ArrayList<>();
        int numeroDeUsuariosEsperados = 12;
        long tiempoActual = System.currentTimeMillis();

        for (int i = 0; i < 4; i++) {
            users.add(new Usuario("usuario" + i, "a@example.com"));
        }
        users.stream().forEach((u) -> {
            try {
                // agregar hace dos dias
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date(tiempoActual - 2 * UN_DIA)));
                // agregar ayer
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date(tiempoActual - UN_DIA)));
                // agregar hoy
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date(tiempoActual)));
                // agregar mañana
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date(tiempoActual + UN_DIA)));
                // agregar en dos dias
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date(tiempoActual + 2 * UN_DIA)));
            } catch (InvalidCalificationException ex) {
                System.err.println("La calificacion no pudo ser creada");
            }
        });
        // usuarios que realizaron evaluaciones entre ayer y mañana
        int numeroDeUsuariosObtenidos = instance.usuariosQueEvaluaron(new Date(tiempoActual - UN_DIA), new Date(tiempoActual + UN_DIA)).size();

        assertEquals(numeroDeUsuariosEsperados, numeroDeUsuariosObtenidos);
    }

    @Test
    public void testUsuariosQueEvaluaronDevuelveUnaListaVaciaSiNoHayEvaluacionesEnElRangoDeFechaDado() throws InvalidDateRangeException {
        Restaurante instance = new Restaurante("restaurante de prueba", "direccion de prueba", "horario de prueba", "tipo de comida de prueba");
        ArrayList<Usuario> users = new ArrayList<>();
        ArrayList<Usuario> listaEsperada = new ArrayList<>();
        long tiempoActual = System.currentTimeMillis();

        for (int i = 0; i < 4; i++) {
            users.add(new Usuario("usuario" + i, "a@example.com"));
        }
        users.stream().forEach((u) -> {
            try {
                // agregar hace dos dias
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date(tiempoActual - 2 * UN_DIA)));
                // agregar en dos dias
                instance.addEvaluacion(new Evaluacion(5, "Muy rico", u, new Date(tiempoActual + 2 * UN_DIA)));
            } catch (InvalidCalificationException ex) {
                System.err.println("La calificacion no pudo ser creada");
            }
        });
        // usuarios que realizaron evaluaciones entre ayer y mañana
        ArrayList<Usuario> listaObtenida = instance.usuariosQueEvaluaron(new Date(tiempoActual - UN_DIA), new Date(tiempoActual + UN_DIA));

        assertEquals(listaEsperada, listaObtenida);
    }

    @Test(expected = InvalidDateRangeException.class)
    public void testUsuariosQueEvaluaronLanzaUnaExcepcionSiElRangoDeFechasEsInvalido() throws InvalidDateRangeException {
        Restaurante instance = new Restaurante("restaurante de prueba", "direccion de prueba", "horario de prueba", "tipo de comida de prueba");
        long tiempoActual = System.currentTimeMillis();

        instance.usuariosQueEvaluaron(new Date(tiempoActual + UN_DIA), new Date(tiempoActual - UN_DIA));
    }
}
