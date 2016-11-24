package eggervezoli.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Sistema {

    private Restaurante restaurante;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Sorteo> sorteos;

    public Sistema() {
        restaurante = new Restaurante(null, null, null, null);
        usuarios = new ArrayList<>();
        sorteos = new ArrayList<>();
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void agregarSorteo(Sorteo sorteo) {
        sorteos.add(sorteo);
    }

    public boolean eliminarSorteo(Sorteo sorteo) {
        return sorteos.remove(sorteo);
    }

    public ArrayList<Sorteo> getSorteos() {
        return sorteos;
    }
}
