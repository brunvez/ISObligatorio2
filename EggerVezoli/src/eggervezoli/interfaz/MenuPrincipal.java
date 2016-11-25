/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.interfaz;

import eggervezoli.dominio.Sistema;
import javax.swing.JPanel;

public class MenuPrincipal extends javax.swing.JPanel {

    private Sistema sistema;
    private JPanel contenedor;

    public MenuPrincipal(JPanel padre, Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.contenedor = padre;
        this.labelNombre.setText(sistema.getRestaurante().getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonModificarRestaurante = new javax.swing.JButton();
        botonAgregarSorteo = new javax.swing.JButton();
        botonEvaluarRestaurante = new javax.swing.JButton();
        botonRealizarSorteo = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(null);

        botonModificarRestaurante.setBackground(new java.awt.Color(0, 153, 153));
        botonModificarRestaurante.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        botonModificarRestaurante.setForeground(new java.awt.Color(0, 102, 102));
        botonModificarRestaurante.setText("Modificar Restaurante");
        botonModificarRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarRestauranteMouseClicked(evt);
            }
        });
        botonModificarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarRestauranteActionPerformed(evt);
            }
        });
        add(botonModificarRestaurante);
        botonModificarRestaurante.setBounds(10, 10, 210, 60);

        botonAgregarSorteo.setBackground(new java.awt.Color(0, 153, 153));
        botonAgregarSorteo.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        botonAgregarSorteo.setForeground(new java.awt.Color(0, 102, 102));
        botonAgregarSorteo.setText("Agregar Sorteo");
        botonAgregarSorteo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarSorteoMouseClicked(evt);
            }
        });
        add(botonAgregarSorteo);
        botonAgregarSorteo.setBounds(420, 10, 190, 60);

        botonEvaluarRestaurante.setBackground(new java.awt.Color(0, 102, 102));
        botonEvaluarRestaurante.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        botonEvaluarRestaurante.setForeground(new java.awt.Color(0, 102, 102));
        botonEvaluarRestaurante.setText("Evaluar Restaurante");
        botonEvaluarRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEvaluarRestauranteMouseClicked(evt);
            }
        });
        add(botonEvaluarRestaurante);
        botonEvaluarRestaurante.setBounds(220, 10, 200, 60);

        botonRealizarSorteo.setBackground(new java.awt.Color(0, 102, 102));
        botonRealizarSorteo.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        botonRealizarSorteo.setForeground(new java.awt.Color(0, 102, 102));
        botonRealizarSorteo.setText("Realizar Sorteo");
        botonRealizarSorteo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRealizarSorteoMouseClicked(evt);
            }
        });
        botonRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarSorteoActionPerformed(evt);
            }
        });
        add(botonRealizarSorteo);
        botonRealizarSorteo.setBounds(610, 10, 190, 60);

        labelNombre.setFont(new java.awt.Font("MS Gothic", 0, 48)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(226, 210, 195));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("RESTAURANT");
        add(labelNombre);
        labelNombre.setBounds(-40, 70, 840, 530);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eggervezoli/interfaz/FondoMenuPrincipal.PNG"))); // NOI18N
        add(fondo);
        fondo.setBounds(0, 0, 890, 670);
    }// </editor-fold>//GEN-END:initComponents

    private void botonModificarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarRestauranteActionPerformed

    private void botonModificarRestauranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarRestauranteMouseClicked
        contenedor.removeAll();
        contenedor.add(new ModificarRestaurant(contenedor, sistema));
        contenedor.updateUI();
    }//GEN-LAST:event_botonModificarRestauranteMouseClicked

    private void botonEvaluarRestauranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEvaluarRestauranteMouseClicked
        contenedor.removeAll();
        contenedor.add(new EvaluarRestaurante(contenedor, sistema));
        contenedor.updateUI();
    }//GEN-LAST:event_botonEvaluarRestauranteMouseClicked

    private void botonAgregarSorteoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarSorteoMouseClicked
        contenedor.removeAll();
        contenedor.add(new AgregarSorteo(contenedor, sistema));
        contenedor.updateUI();
    }//GEN-LAST:event_botonAgregarSorteoMouseClicked

    private void botonRealizarSorteoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRealizarSorteoMouseClicked
        contenedor.removeAll();
        contenedor.add(new RealizarSorteo(contenedor, sistema));
        contenedor.updateUI();
    }//GEN-LAST:event_botonRealizarSorteoMouseClicked

    private void botonRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarSorteoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRealizarSorteoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarSorteo;
    private javax.swing.JButton botonEvaluarRestaurante;
    private javax.swing.JButton botonModificarRestaurante;
    private javax.swing.JButton botonRealizarSorteo;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
