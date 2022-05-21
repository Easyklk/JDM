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
public class PanelModificacion extends javax.swing.JPanel {
    
    private VentanaPrincipal vp;

    /**
     * Creates new form PanelModificacion
     */
    public PanelModificacion(VentanaPrincipal vp) {
        this.vp = vp;
        initComponents();
        jbModificar.setEnabled(false);
    }
    
    public void vaciarCampos() {
        jtfCv.setText("");
        jtfID.setText("");
        jtfMarca.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jtfCv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbListado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaListado = new javax.swing.JTextArea();
        jbBuscar = new javax.swing.JButton();
        jcbTurbo = new javax.swing.JCheckBox();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Panel de Modificacion");

        jLabel3.setText("Marca:");

        jLabel4.setText("CV:");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbListado.setText("Listado");
        jbListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListadoActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jtaListado.setColumns(20);
        jtaListado.setRows(5);
        jScrollPane1.setViewportView(jtaListado);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jcbTurbo.setText("Turbo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(64, 64, 64)
                                .addComponent(jbListado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTurbo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfCv)
                                        .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbTurbo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbListado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:

        if (!jtfID.getText().trim().isEmpty()) {
            int id;
            try {
                id = Integer.parseInt(jtfID.getText());
            } catch (Exception e) {
                id = 0;
            }
            Coche coche = vp.getConexion().getCoche(id);
            if (coche != null) {
                String cv;
                try {
                    cv = String.valueOf(coche.getCaballos());
                } catch (Exception e) {
                    cv = "";
                }
                jtfMarca.setText(coche.getMarca());
                jtfCv.setText(cv);
                jcbTurbo.setSelected(coche.isTurbo());
                jbModificar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(vp, "El ID no coincide con ningun vehiculo.");
                
            }
        } else {
            JOptionPane.showMessageDialog(vp, "Campo ID vacio.");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        String marca = "";
        int cv = 0;
        boolean turbo = false;
        if (!jtfMarca.getText().trim().isEmpty() || !jtfID.getText().trim().isEmpty() || !jtfCv.getText().trim().isEmpty()) {
            int id;
            try {
                id = Integer.parseInt(jtfID.getText());
            } catch (Exception e) {
                id = 0;
            }
            int cvPlain;
            try {
                cvPlain = Integer.valueOf(jtfCv.getText());
            } catch (Exception e) {
                cvPlain = 0;
            }
            if (vp.getConexion().actualizarCoche(id, jtfMarca.getText(), jcbTurbo.isSelected(), cvPlain)) {
                JOptionPane.showMessageDialog(vp, "El vehiculo se ha modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(vp, "¡El vehiculo no se ha modificado correctamente!");
                
            }
        } else {
            JOptionPane.showMessageDialog(vp, "¡No se pueden haber campos vacios!");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbListado;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcbTurbo;
    private javax.swing.JTextArea jtaListado;
    private javax.swing.JTextField jtfCv;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfMarca;
    // End of variables declaration//GEN-END:variables
}