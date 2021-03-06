/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Coche;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaac-PC
 */
public class PanelAlta extends javax.swing.JPanel {

    private VentanaPrincipal vp;
    private boolean turbo;

    /**
     * Creates new form PanelAlta
     */
    public PanelAlta(VentanaPrincipal vp) {
        this.vp = vp;
        initComponents();
    }

    private void vaciarComponentes() {
        jtfMarca.setText("");
        jtfMarca.setText("");
        jcbTurbo.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfCV = new javax.swing.JTextField();
        jcbTurbo = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jbListado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaListado = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Panel de Alta");

        jLabel2.setText("Marca:");

        jLabel4.setText("CV:");

        jcbTurbo.setText("Turbo");
        jcbTurbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTurboActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbListado.setText("Listado");
        jbListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListadoActionPerformed(evt);
            }
        });

        jtaListado.setColumns(20);
        jtaListado.setRows(5);
        jScrollPane1.setViewportView(jtaListado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jcbTurbo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbListado)))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(194, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jcbTurbo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbListado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbTurboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTurboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTurboActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        if (!jtfMarca.getText().trim().isEmpty() || !jtfCV.getText().trim().isEmpty()) {
            Coche coche = new Coche();
            coche.setId(vp.getConexion().getId() + 1);
            coche.setMarca(jtfMarca.getText());
            int cv;
            try {
                cv = Integer.parseInt(jtfCV.getText());
            } catch (Exception e) {
                cv = 0;
            }
            coche.setCaballos(cv);
            if (jcbTurbo.isSelected() == true) {
                turbo = true;
            } else {
                turbo = false;
            }
            coche.setTurbo(turbo);
            if (vp.getConexion().addCoche(coche)) {
                JOptionPane.showMessageDialog(vp, "Vehiculo a??adido correctamente.");
                vaciarComponentes();
            } else {
                JOptionPane.showMessageDialog(vp, "El vehiculo no se ha podido a??adir. Intentelo de nuevo.");
            }
        } else {
            JOptionPane.showMessageDialog(vp, "No se pueden dejar campos vacios.");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListadoActionPerformed
        // TODO add your handling code here:
        jtaListado.setText("");
        jtaListado.setText("ID \t Marca \t Turbo \t CV \n");
        for (Coche coche : vp.getConexion().getCoches()) {
            String cadena = coche.getId() + "\t" + coche.getMarca() + "\t" + coche.turboPlain() + "\t" + coche.getCaballos();
            jtaListado.append(" " + cadena + "\n");
        }
    }//GEN-LAST:event_jbListadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbListado;
    private javax.swing.JCheckBox jcbTurbo;
    private javax.swing.JTextArea jtaListado;
    private javax.swing.JTextField jtfCV;
    private javax.swing.JTextField jtfMarca;
    // End of variables declaration//GEN-END:variables
}
