package eggervezoli.dominio;

import java.util.ArrayList;

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

    public void addSorteo(Sorteo sorteo) {
        sorteos.add(sorteo);
    }

    public ArrayList<Sorteo> getSorteos() {
        return sorteos;
    }
}
