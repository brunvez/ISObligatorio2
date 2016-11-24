/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggervezoli.interfaz;

import eggervezoli.dominio.Evaluacion;
import eggervezoli.dominio.InvalidCalificationException;
import eggervezoli.dominio.InvalidDateRangeException;
import eggervezoli.dominio.NotEnoughParticipantsException;
import eggervezoli.dominio.Sistema;
import eggervezoli.dominio.Sorteo;
import eggervezoli.dominio.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RealizarSorteo extends javax.swing.JPanel {

    private Sistema sistema;
    private JPanel padre;
    private Sorteo sorteoSeleccionado;

    public RealizarSorteo(JPanel padre, Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.padre = padre;
        try {
            sistema.agregarSorteo(new Sorteo("p1", 2, new Date(), new Date()));
            sistema.agregarSorteo(new Sorteo("p2", 2, new Date(), new Date()));
            sistema.agregarSorteo(new Sorteo("p3", 2, new Date(), new Date()));
            sistema.agregarSorteo(new Sorteo("p4", 2, new Date(), new Date()));
            Evaluacion ev = new Evaluacion(3, "na", new Usuario("a", "b"), new Date());
            sistema.getRestaurante().addEvaluacion(ev);
        } catch (InvalidDateRangeException | InvalidCalificationException ex) {
            Logger.getLogger(RealizarSorteo.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetearDatos();
    }

    /**
     * Da formato d/m/Y a la fecha dada
     *
     * @param fecha a dar formato
     * @return un string con el formato descripto de la fecha
     */
    private String darFormatoAFecha(Date fecha) {
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fecha);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);
        return dia + "/" + mes + "/" + ano;
    }

    private void borrarSorteo() {
        sistema.eliminarSorteo(sorteoSeleccionado);
        sorteoSeleccionado = null;
    }

    /**
     * Vacia las labels y los textboxes
     */
    private void resetearDatos() {
        jListSorteos.setListData(sistema.getSorteos().toArray());
        jLabelFechaFin.setText("");
        jLabelFechaInicio.setText("");
        jLabelNumeroDeGanadores.setText("");
    }

    private void mostrarGanadores(ArrayList<Usuario> ganadores) {
        JFrame frame = new JFrame();
        frame.setTitle("Ganadores del sorteo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MostrarGanadores panelMostrarGanadores = new MostrarGanadores(ganadores);
        frame.add(panelMostrarGanadores);
        frame.pack();
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListSorteos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcionPrecio = new javax.swing.JTextArea();
        jLabelFechaInicio = new javax.swing.JLabel();
        jLabelFechaFin = new javax.swing.JLabel();
        jLabelNumeroDeGanadores = new javax.swing.JLabel();
        jButtonRealizarSorteo = new javax.swing.JButton();
        jButtonCancelarSorteo = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jListSorteos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListSorteosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListSorteos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Sorteos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Realizar sorteo");

        jLabel3.setText("Fecha inicio:");

        jLabel4.setText("Fecha finalización:");

        jLabel5.setText("Numero de ganadores:");

        jLabel6.setText("Descripción del premio:");

        jTextAreaDescripcionPrecio.setEditable(false);
        jTextAreaDescripcionPrecio.setColumns(20);
        jTextAreaDescripcionPrecio.setRows(5);
        jTextAreaDescripcionPrecio.setEnabled(false);
        jScrollPane2.setViewportView(jTextAreaDescripcionPrecio);

        jLabelFechaInicio.setText("jLabel7");

        jLabelFechaFin.setText("jLabel8");
        jLabelFechaFin.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabelNumeroDeGanadores.setText("jLabel9");

        jButtonRealizarSorteo.setBackground(new java.awt.Color(97, 216, 114));
        jButtonRealizarSorteo.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRealizarSorteo.setText("Realizar sorteo");
        jButtonRealizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarSorteoActionPerformed(evt);
            }
        });

        jButtonCancelarSorteo.setBackground(new java.awt.Color(255, 90, 62));
        jButtonCancelarSorteo.setForeground(new java.awt.Color(51, 51, 51));
        jButtonCancelarSorteo.setText("Cancelar sorteo");
        jButtonCancelarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarSorteoActionPerformed(evt);
            }
        });

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNumeroDeGanadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRealizarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelFechaInicio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelNumeroDeGanadores))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRealizarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelarSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarSorteoActionPerformed
        if (sorteoSeleccionado != null) {
            Date fechaInicio = sorteoSeleccionado.getFechaIncio();
            Date fechaFin = sorteoSeleccionado.getFechaFin();
            try {
                ArrayList<Usuario> participantes = sistema.getRestaurante().usuariosQueEvaluaron(fechaInicio, fechaFin);
                ArrayList<Usuario> ganadores = sorteoSeleccionado.sortear(participantes);
                mostrarGanadores(ganadores);
                borrarSorteo();
                resetearDatos();
            } catch (NotEnoughParticipantsException ex) {
                JOptionPane.showMessageDialog(this, "No hay suficientes participantes para realizar el sorteo");
            } catch (InvalidDateRangeException ex) {
                JOptionPane.showMessageDialog(this, "El rango de fechas de este sorteo no es correcto");
            }
        }
    }//GEN-LAST:event_jButtonRealizarSorteoActionPerformed

    private void jButtonCancelarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarSorteoActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Seguro que desea cancelar este sorteo?", "Warning", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            borrarSorteo();
            resetearDatos();
        }
    }//GEN-LAST:event_jButtonCancelarSorteoActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        padre.removeAll();
        padre.add(new MenuPrincipal(padre, sistema));
        padre.updateUI();
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jListSorteosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListSorteosValueChanged
        if (jListSorteos.getSelectedIndex() != -1) {
            sorteoSeleccionado = (Sorteo) jListSorteos.getSelectedValue();
            jLabelFechaInicio.setText(darFormatoAFecha(sorteoSeleccionado.getFechaIncio()));
            jLabelFechaFin.setText(darFormatoAFecha(sorteoSeleccionado.getFechaFin()));
            jLabelNumeroDeGanadores.setText("" + sorteoSeleccionado.getNumeroDeGanadores());
            jTextAreaDescripcionPrecio.setText(sorteoSeleccionado.getPremio());
        }
    }//GEN-LAST:event_jListSorteosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarSorteo;
    private javax.swing.JButton jButtonRealizarSorteo;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelFechaFin;
    private javax.swing.JLabel jLabelFechaInicio;
    private javax.swing.JLabel jLabelNumeroDeGanadores;
    private javax.swing.JList jListSorteos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescripcionPrecio;
    // End of variables declaration//GEN-END:variables
}
