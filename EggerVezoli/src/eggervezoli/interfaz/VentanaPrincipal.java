/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.interfaz;

import eggervezoli.dominio.Sistema;


public class VentanaPrincipal extends javax.swing.JFrame {

    private Sistema sistema;

    public VentanaPrincipal(Sistema sistema) {
        initComponents();
        this.setSize(800, 600);
        this.setResizable(false);
        this.sistema = sistema;
        MenuPrincipal menuPrincipal = new MenuPrincipal(panelCartas, sistema);
        panelCartas.removeAll();
        panelCartas.add(menuPrincipal);
        jPanel1.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCartas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        panelCartas.setLayout(new java.awt.CardLayout());
        jPanel1.add(panelCartas);
        panelCartas.setBounds(0, 3, 780, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelCartas;
    // End of variables declaration//GEN-END:variables
}
