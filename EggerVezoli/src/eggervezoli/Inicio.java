package eggervezoli;

import eggervezoli.dominio.Sistema;
import eggervezoli.interfaz.VentanaPrincipal;

public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        VentanaPrincipal ventana = new VentanaPrincipal(null);
        ventana.setVisible(true);
    }
}
