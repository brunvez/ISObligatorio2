/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.dominio;

import java.util.ArrayList;

public class Restaurante {

    private String nombre;
    private String direccion;
    private String horario;
    private String tipoDeComida;
    private ArrayList<String> evaluaciones;

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

    public ArrayList<String> getEvaluacion() {
        return evaluaciones;
    }

    public void setEvaluacion(ArrayList<String> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

}
