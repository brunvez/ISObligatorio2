/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.dominio;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Bruno
 */
public class EvaluacionTest {

    private Evaluacion instance;

    @Before
    public void setUp() {
        try {
            instance = new Evaluacion(2, "Muy rico", new Usuario("usuario", "john@doe.com"), new Date());
        } catch (InvalidCalificationException ex) {
            System.err.println("No se pudo crear la instancia");
        }
    }

    @Test
    public void testSetCalificacionCambiaLaCalificacion() throws InvalidCalificationException {
        int calificacion = 3;

        instance.setCalificacion(calificacion);

        assertEquals(calificacion, instance.getCalificacion());
    }

    @Test(expected = InvalidCalificationException.class)
    public void testSetCalificacionLanzaExcepcionSiLaCalificacionEsMenorQue0() throws InvalidCalificationException {
        int calificacion = 0;

        instance.setCalificacion(calificacion);
    }

    @Test(expected = InvalidCalificationException.class)
    public void testSetCalificacionLanzaExcepcionSiLaCalificacionEsMenorQue5() throws InvalidCalificationException {
        int calificacion = 6;

        instance.setCalificacion(calificacion);
    }
}
