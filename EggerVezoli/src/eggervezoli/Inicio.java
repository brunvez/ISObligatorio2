package eggervezoli;

import eggervezoli.dominio.Sistema;
import eggervezoli.interfaz.VentanaPrincipal;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Inicio {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException e) {
            System.err.println("Hubo un error al cargar la interfaz");
        }
        Sistema sistema = new Sistema();
        VentanaPrincipal ventana = new VentanaPrincipal(sistema);
        ventana.setVisible(true);
    }
}
