/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;

import java.awt.BorderLayout;

/**
 *
 * @author jajas
 */
public class Registrar extends javax.swing.JPanel {

    /**
     * Creates new form Registrar
     */
    public Registrar() {
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        content = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registro empleados");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Selecciona una opcion:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocinero", "Mucama", "Recepcionista", "Portero", "Botones" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(228, Short.MAX_VALUE))
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int indice = jComboBox1.getSelectedIndex(); // Devuelve en que posicion de la lista esta el elemento seleccionado
        String elemento = jComboBox1.getSelectedItem().toString(); // convierte a cadena lo que devuelve el getSelectedIndex

        // instancias
        Cocinero cociPage = new Cocinero();
        Mucama mucaPage = new Mucama();
        Recepcionista recePage = new Recepcionista();
        Portero portPage = new Portero();
        Botones botoPage = new Botones();

        // Cocinero
        if (indice == 0){
            cociPage.setSize(550, 328);
            cociPage.setLocation(0, 0);

            content.removeAll();
            content.add(cociPage, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        // Mucama
        else if (indice == 1){
            mucaPage.setSize(550, 328);
            mucaPage.setLocation(0, 0);

            content.removeAll();
            content.add(mucaPage, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        // Recepcionista
        else if (indice == 2){
            recePage.setSize(550, 328);
            recePage.setLocation(0, 0);

            content.removeAll();
            content.add(recePage, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        // Portero
        else if(indice == 3){
            portPage.setSize(550, 328);
            portPage.setLocation(0, 0);

            content.removeAll();
            content.add(portPage, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        // Botones
        else if(indice == 4){
            botoPage.setSize(550, 328);
            botoPage.setLocation(0, 0);

            content.removeAll();
            content.add(botoPage, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
