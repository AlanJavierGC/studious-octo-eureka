/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.util.ArrayList;
import javax.swing.JTextField;
/**
 *
 * @author jajas
 */
public class Cocinero extends javax.swing.JPanel {
    String ans1;
    String ans2;
    String ans3;
    String ans4;
    String ans5;
    int ans6;
    
    /**
     * Creates new form Cocinero
     */
    public Cocinero() {
        initComponents();
        
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
        Id_cocinero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombre_cocinero = new javax.swing.JTextField();
        Fec_nac_cocinero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jor_cocinero = new javax.swing.JComboBox<>();
        GuardarArray = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Titulo_cocinero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Espec_cocinero = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID: ");

        Id_cocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_cocineroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre: ");

        Nombre_cocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_cocineroActionPerformed(evt);
            }
        });

        Fec_nac_cocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fec_nac_cocineroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Fech. Nac");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Jornada: ");

<<<<<<< HEAD
        Jor_cocinero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8" }));
        Jor_cocinero.addActionListener(new java.awt.event.ActionListener() {
=======
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "", "3", "4", "5", "6" }));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> f41ebc0d02d3c0023ce764ef872f00e5ad99a6c4
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jor_cocineroActionPerformed(evt);
            }
        });

        GuardarArray.setText("Guardar");
        GuardarArray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarArrayMouseClicked(evt);
            }
        });
        GuardarArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarArrayActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Titulo:");

        Titulo_cocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titulo_cocineroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Especialidad:");

        Espec_cocinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espec_cocineroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GuardarArray)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nombre_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fec_nac_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Jor_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Titulo_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Espec_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Nombre_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Fec_nac_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Titulo_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Espec_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Id_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jor_cocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarArray)
                    .addComponent(jButton2))
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Id_cocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_cocineroActionPerformed
        // TODO add your handling code here:
        ans1 = this.Id_cocinero.getText();
    }//GEN-LAST:event_Id_cocineroActionPerformed

    private void Nombre_cocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_cocineroActionPerformed
        // TODO add your handling code here:
        ans2 = this.Nombre_cocinero.getText();
    }//GEN-LAST:event_Nombre_cocineroActionPerformed

    private void Fec_nac_cocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fec_nac_cocineroActionPerformed
        // TODO add your handling code here:
        ans3 = this.Fec_nac_cocinero.getText();
    }//GEN-LAST:event_Fec_nac_cocineroActionPerformed

    private void GuardarArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarArrayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarArrayActionPerformed

    private void Titulo_cocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titulo_cocineroActionPerformed
        // TODO add your handling code here:
        ans4 = this.Titulo_cocinero.getText();
    }//GEN-LAST:event_Titulo_cocineroActionPerformed

    private void Espec_cocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espec_cocineroActionPerformed
        // TODO add your handling code here:
        ans5 = this.Espec_cocinero.getText();
    }//GEN-LAST:event_Espec_cocineroActionPerformed

    private void GuardarArrayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarArrayMouseClicked
        // TODO add your handling code here:
        ArrayList<com.mycompany.trabajo.Cocinero> Miembros = new ArrayList<com.mycompany.trabajo.Cocinero>();
        
        com.mycompany.trabajo.Cocinero Miembro = new com.mycompany.trabajo.Cocinero ("a","b","c","d",5);
        Miembros.add(Miembro);
        
    }//GEN-LAST:event_GuardarArrayMouseClicked

    private void Jor_cocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jor_cocineroActionPerformed
        // TODO add your handling code here:
        String Alt = this.Jor_cocinero.getSelectedItem().toString();
        ans6 = Integer.parseInt(Alt);
    }//GEN-LAST:event_Jor_cocineroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Espec_cocinero;
    private javax.swing.JTextField Fec_nac_cocinero;
    private javax.swing.JButton GuardarArray;
    private javax.swing.JTextField Id_cocinero;
    private javax.swing.JComboBox<String> Jor_cocinero;
    private javax.swing.JTextField Nombre_cocinero;
    private javax.swing.JTextField Titulo_cocinero;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
