package eggervezoli.dominio;

import java.time.LocalDateTime;
import java.util.Date;

public class Evaluacion {

    private Usuario usuario;
    private int calificacion;
    private String comentario;
    private final Date fecha;

    public Evaluacion(int calificacion, String comentario, Usuario usuario, Date fecha) throws InvalidCalificationException {
        validarCalificacion(calificacion);
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Setea la calificacion al valor dado
     *
     * @param calificacion a setear
     * @throws InvalidCalificationException si la calificacion esta fuera del
     * rango 1..5
     */
    public void setCalificacion(int calificacion) throws InvalidCalificationException {
        validarCalificacion(calificacion);
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }
    
    private void validarCalificacion(int calificacion) throws InvalidCalificationException {
        if (calificacion < 1 || calificacion > 5) {
            throw new InvalidCalificationException();
        }
    }
}
