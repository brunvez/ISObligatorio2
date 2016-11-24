
package eggervezoli.interfaz;


import eggervezoli.dominio.Restaurante;
import eggervezoli.dominio.Sistema;
import javax.swing.JPanel;

public class ModificarRestaurant extends javax.swing.JPanel {

    private Sistema sistema;
    private JPanel contenedor;
    
    public ModificarRestaurant(JPanel padre ,Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.contenedor = padre;
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

        ventanaModificarRestaurante.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ventanaModificarRestaurante.setText("Modificar Restaurante");

        nombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nombre.setText("Nombre:");
        nombre.setPreferredSize(new java.awt.Dimension(150, 48));

        direccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        direccion.setText("Dirección:");

        horario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        horario.setText("Horario:");

        TipoDeComida.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TipoDeComida.setText("Tipo de comida:");

        modificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarNombreActionPerformed(evt);
            }
        });

        modificarTipoDeComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTipoDeComidaActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(ventanaModificarRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(507, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ventanaModificarRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarTipoDeComida, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
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
        
        resto.setNombre(nombre);
        resto.setDireccion(direccion);
        resto.setHorario(horario);
        resto.setTipoDeComida(tipoComida);
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
    private javax.swing.JTextField modificarDireccion;
    private javax.swing.JTextField modificarHorario;
    private javax.swing.JTextField modificarNombre;
    private javax.swing.JTextField modificarTipoDeComida;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel ventanaModificarRestaurante;
    // End of variables declaration//GEN-END:variables
}
