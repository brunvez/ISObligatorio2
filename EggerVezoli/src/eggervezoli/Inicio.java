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
        // datos para probar la aplicacion
        sistema.getRestaurante().setNombre("El club de la papa frita");
        sistema.getRestaurante().setDireccion("Av Brasil equina Brito Del Pino");
        sistema.getRestaurante().setHorario("De 11:00 a.m. a 3:30 p.m. y de 7:00 p.m. a 11:30 p.m.");
        sistema.getRestaurante().setTipoDeComida("Minutas y papas fritas");
        
        VentanaPrincipal ventana = new VentanaPrincipal(sistema);
        ventana.setVisible(true);
    }
}
