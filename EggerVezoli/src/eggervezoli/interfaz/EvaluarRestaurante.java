package eggervezoli.interfaz;

import eggervezoli.dominio.Evaluacion;
import eggervezoli.dominio.InvalidCalificationException;
import eggervezoli.dominio.Restaurante;
import eggervezoli.dominio.Sistema;
import eggervezoli.dominio.Usuario;
import java.awt.HeadlessException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EvaluarRestaurante extends javax.swing.JPanel {

    private Sistema sistema;
    private JPanel contenedor;

    public EvaluarRestaurante(JPanel padre, Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.contenedor = padre;
        jRadioButtonCincoEstrellas.setSelected(true);
    }

    private int obtenerCalificacion() {
        if (jRadioButtonUnaEstrella.isSelected()) {
            return 1;
        } else if (jRadioButtonDosEstrellas.isSelected()) {
            return 2;
        } else if (jRadioButtonTresEstrellas.isSelected()) {
            return 3;
        } else if (jRadioButtonCuatroEstrellas.isSelected()) {
            return 4;
        } else {
            return 5;
        }
    }
    
    private void resetearCampos(){
        nombreUsuario.setText("");
        mailUsuario.setText("");
        comentariosEvaluacion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCalificacion = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nombreUsuario = new javax.swing.JTextField();
        comentariosEvaluacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mailUsuario = new javax.swing.JTextField();
        jLabelError = new javax.swing.JLabel();
        jRadioButtonUnaEstrella = new javax.swing.JRadioButton();
        jRadioButtonCincoEstrellas = new javax.swing.JRadioButton();
        jRadioButtonDosEstrellas = new javax.swing.JRadioButton();
        jRadioButtonCuatroEstrellas = new javax.swing.JRadioButton();
        jRadioButtonTresEstrellas = new javax.swing.JRadioButton();
        jCheckBoxEvaluarAnonimo = new javax.swing.JCheckBox();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Evaluar Restaurante");
        add(jLabel1);
        jLabel1.setBounds(28, 23, 915, 65);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nombre");
        add(jLabel2);
        jLabel2.setBounds(40, 110, 256, 48);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Comentarios:");
        add(jLabel3);
        jLabel3.setBounds(40, 250, 256, 48);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Calificación:");
        add(jLabel5);
        jLabel5.setBounds(40, 320, 256, 48);

        guardar.setBackground(new java.awt.Color(97, 216, 114));
        guardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        guardar.setText("Evaluar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        add(guardar);
        guardar.setBounds(190, 440, 150, 50);

        cancelar.setBackground(new java.awt.Color(255, 90, 62));
        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        add(cancelar);
        cancelar.setBounds(530, 440, 150, 50);

        nombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });
        add(nombreUsuario);
        nombreUsuario.setBounds(350, 110, 350, 48);

        comentariosEvaluacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(comentariosEvaluacion);
        comentariosEvaluacion.setBounds(350, 250, 350, 48);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Mail:");
        add(jLabel6);
        jLabel6.setBounds(40, 180, 256, 48);

        mailUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mailUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailUsuarioActionPerformed(evt);
            }
        });
        add(mailUsuario);
        mailUsuario.setBounds(350, 180, 350, 48);

        jLabelError.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        add(jLabelError);
        jLabelError.setBounds(110, 370, 631, 39);

        buttonGroupCalificacion.add(jRadioButtonUnaEstrella);
        jRadioButtonUnaEstrella.setText("1 Estrella");
        add(jRadioButtonUnaEstrella);
        jRadioButtonUnaEstrella.setBounds(200, 330, 81, 25);

        buttonGroupCalificacion.add(jRadioButtonCincoEstrellas);
        jRadioButtonCincoEstrellas.setText("5 Estrellas");
        add(jRadioButtonCincoEstrellas);
        jRadioButtonCincoEstrellas.setBounds(620, 330, 87, 25);

        buttonGroupCalificacion.add(jRadioButtonDosEstrellas);
        jRadioButtonDosEstrellas.setText("2 Estrellas");
        add(jRadioButtonDosEstrellas);
        jRadioButtonDosEstrellas.setBounds(300, 330, 87, 25);

        buttonGroupCalificacion.add(jRadioButtonCuatroEstrellas);
        jRadioButtonCuatroEstrellas.setText("4 Estrellas");
        jRadioButtonCuatroEstrellas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCuatroEstrellasActionPerformed(evt);
            }
        });
        add(jRadioButtonCuatroEstrellas);
        jRadioButtonCuatroEstrellas.setBounds(510, 330, 87, 25);

        buttonGroupCalificacion.add(jRadioButtonTresEstrellas);
        jRadioButtonTresEstrellas.setText("3 Estrellas");
        add(jRadioButtonTresEstrellas);
        jRadioButtonTresEstrellas.setBounds(410, 330, 87, 25);

        jCheckBoxEvaluarAnonimo.setText("Anónimo");
        jCheckBoxEvaluarAnonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEvaluarAnonimoActionPerformed(evt);
            }
        });
        add(jCheckBoxEvaluarAnonimo);
        jCheckBoxEvaluarAnonimo.setBounds(220, 120, 100, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (jCheckBoxEvaluarAnonimo.isSelected() || (!nombreUsuario.getText().isEmpty() && !mailUsuario.getText().isEmpty())) {
            Restaurante resto = sistema.getRestaurante();
            Usuario usuario;
            if (jCheckBoxEvaluarAnonimo.isSelected()) {
                usuario = null;
            } else {
                usuario = new Usuario(nombreUsuario.getText(), mailUsuario.getText());
            }
            String comentario;
            comentario = comentariosEvaluacion.getText();
            Date fecha = new Date();
            int calificacion = obtenerCalificacion();
            try {
                Evaluacion evaluacion = new Evaluacion(calificacion, comentario, usuario, fecha);
                resto.addEvaluacion(evaluacion);
                jLabelError.setText("");
                resetearCampos();
                JOptionPane.showMessageDialog(this, "Agradecemos su evaluación");
            } catch (InvalidCalificationException ex) {
                jLabelError.setText("Tiene que calificar el restaurante");
            }
        } else if (nombreUsuario.getText().isEmpty() && mailUsuario.getText().isEmpty()) {
            jLabelError.setText("Debe ingresar su nombre y email o clickear anónimo");
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        contenedor.removeAll();
        contenedor.add(new MenuPrincipal(contenedor, sistema));
        contenedor.updateUI();
    }//GEN-LAST:event_cancelarActionPerformed

    private void mailUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailUsuarioActionPerformed

    private void jRadioButtonCuatroEstrellasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCuatroEstrellasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCuatroEstrellasActionPerformed

    private void jCheckBoxEvaluarAnonimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEvaluarAnonimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxEvaluarAnonimoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCalificacion;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField comentariosEvaluacion;
    private javax.swing.JButton guardar;
    private javax.swing.JCheckBox jCheckBoxEvaluarAnonimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JRadioButton jRadioButtonCincoEstrellas;
    private javax.swing.JRadioButton jRadioButtonCuatroEstrellas;
    private javax.swing.JRadioButton jRadioButtonDosEstrellas;
    private javax.swing.JRadioButton jRadioButtonTresEstrellas;
    private javax.swing.JRadioButton jRadioButtonUnaEstrella;
    private javax.swing.JTextField mailUsuario;
    private javax.swing.JTextField nombreUsuario;
    // End of variables declaration//GEN-END:variables

}
