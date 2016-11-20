/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Restaurante {

    private String nombre;
    private String direccion;
    private String horario;
    private String tipoDeComida;
    private ArrayList<Evaluacion> evaluaciones;

    public Restaurante(String nombre, String direccion, String horario, String tipoDeComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horario = horario;
        this.tipoDeComida = tipoDeComida;
        this.evaluaciones = new ArrayList<>();
    }

    /**
     * Retorna una lista con todos los participantes que realizaron una
     * evaluacion en en rango de fechas dado. Si un usuario realiza mas de una
     * evaluacion estara mas de una vez en la lista
     *
     * @param inicio del rango de fecha
     * @param fin del rango de fecha
     * @return la lista de los usuarios que han ralizado evaluaciones
     * @throws InvalidDateRangeException cuando el inicio es menor que el fin
     */
    public ArrayList<Usuario> usuariosQueEvaluaron(Date inicio, Date fin) throws InvalidDateRangeException {
        if (inicio.compareTo(fin) > 0) {
            throw new InvalidDateRangeException();
        }
        ArrayList<Usuario> evaluaron = evaluaciones.stream().
                filter((evaluacion) -> (evaluacion.getUsuario() != null
                        && evaluacion.getFecha().compareTo(inicio) >= 0
                        && evaluacion.getFecha().compareTo(fin) <= 0)).
                map((evaluacion) -> (evaluacion.getUsuario())).
                collect(toArrayList());
        return evaluaron;
    }

    private static <T> Collector<T, ?, ArrayList<T>> toArrayList() {
        return Collectors.toCollection(ArrayList::new);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public ArrayList<Evaluacion> getEvaluacion() {
        return evaluaciones;
    }

    public void setEvaluacion(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public void addEvaluacion(Evaluacion evaluacion) {
        this.evaluaciones.add(evaluacion);
    }
}
