package eggervezoli.interfaz;

import eggervezoli.dominio.Restaurante;
import eggervezoli.dominio.Sistema;
import javax.swing.JPanel;

public class ModificarRestaurant extends javax.swing.JPanel {

    private Sistema sistema;
    private JPanel contenedor;

    public ModificarRestaurant(JPanel padre, Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.contenedor = padre;
        modificarDireccion.setText(sistema.getRestaurante().getDireccion());
        modificarHorario.setText(sistema.getRestaurante().getHorario());
        modificarNombre.setText(sistema.getRestaurante().getNombre());
        modificarTipoDeComida.setText(sistema.getRestaurante().getTipoDeComida());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaModificarRestaurante = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        horario = new javax.swing.JLabel();
        TipoDeComida = new javax.swing.JLabel();
        modificarNombre = new javax.swing.JTextField();
        modificarDireccion = new javax.swing.JTextField();
        modificarHorario = new javax.swing.JTextField();
        modificarTipoDeComida = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabelError = new javax.swing.JLabel();

        setLayout(null);

        ventanaModificarRestaurante.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ventanaModificarRestaurante.setText("Modificar Restaurante");
        add(ventanaModificarRestaurante);
        ventanaModificarRestaurante.setBounds(20, 10, 1448, 65);

        nombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre.setText("Nombre:");
        nombre.setPreferredSize(new java.awt.Dimension(150, 48));
        add(nombre);
        nombre.setBounds(110, 100, 256, 48);

        direccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        direccion.setText("Dirección:");
        add(direccion);
        direccion.setBounds(110, 180, 256, 48);

        horario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        horario.setText("Horario:");
        add(horario);
        horario.setBounds(110, 270, 256, 48);

        TipoDeComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TipoDeComida.setText("Tipo de comida:");
        add(TipoDeComida);
        TipoDeComida.setBounds(110, 350, 256, 48);

        modificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNombreActionPerformed(evt);
            }
        });
        add(modificarNombre);
        modificarNombre.setBounds(360, 100, 350, 48);
        add(modificarDireccion);
        modificarDireccion.setBounds(360, 180, 350, 48);
        add(modificarHorario);
        modificarHorario.setBounds(360, 270, 350, 48);

        modificarTipoDeComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTipoDeComidaActionPerformed(evt);
            }
        });
        add(modificarTipoDeComida);
        modificarTipoDeComida.setBounds(360, 350, 350, 48);

        guardar.setBackground(new java.awt.Color(97, 216, 114));
        guardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        add(guardar);
        guardar.setBounds(360, 470, 150, 50);

        cancelar.setBackground(new java.awt.Color(255, 90, 62));
        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        add(cancelar);
        cancelar.setBounds(560, 470, 150, 50);

        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabelError);
        jLabelError.setBounds(330, 420, 420, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void modificarTipoDeComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTipoDeComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarTipoDeComidaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        contenedor.removeAll();
        contenedor.add(new MenuPrincipal(contenedor, sistema));
        contenedor.updateUI();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Restaurante resto = sistema.getRestaurante();
        String nombre, direccion, horario, tipoComida;
        nombre = modificarNombre.getText();
        direccion = modificarDireccion.getText();
        horario = modificarHorario.getText();
        tipoComida = modificarTipoDeComida.getText();
        if (!nombre.isEmpty() && !direccion.isEmpty() && !horario.isEmpty() && !tipoComida.isEmpty()) {
            resto.setNombre(nombre);
            resto.setDireccion(direccion);
            resto.setHorario(horario);
            resto.setTipoDeComida(tipoComida);
        }else{
            jLabelError.setText("Ninguno de los campos puede ser vacío");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void modificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TipoDeComida;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel direccion;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel horario;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JTextField modificarDireccion;
    private javax.swing.JTextField modificarHorario;
    private javax.swing.JTextField modificarNombre;
    private javax.swing.JTextField modificarTipoDeComida;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel ventanaModificarRestaurante;
    // End of variables declaration//GEN-END:variables
}
