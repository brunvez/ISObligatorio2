package eggervezoli;

import eggervezoli.dominio.Sistema;
import eggervezoli.interfaz.VentanaPrincipal;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;

public class Inicio {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        try {
            UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Sistema sistema = new Sistema();
        VentanaPrincipal ventana = new VentanaPrincipal(null);
        ventana.setVisible(true);
    }
}
