/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import objects.Sport;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author marco
 */
public class SecretaryPanel extends javax.swing.JFrame {

    /**
     * Creates new form SecretaryPanel
     */
    public SecretaryPanel() {
        initComponents();
        closeAllExcept(jPanelMenu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButtonInsertNewArticle = new javax.swing.JButton();
        jButtonMovements = new javax.swing.JButton();
        jPanelShowAllMovement = new javax.swing.JPanel();
        jPanelInesertNewArticle = new javax.swing.JPanel();
        jLabelInfoCode = new javax.swing.JLabel();
        jComboBoxCategoryArticle = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Materiali = new javax.swing.JLabel();
        jTextFieldMaterials = new javax.swing.JTextField();
        jButtonAddItems = new javax.swing.JButton();
        jButtonEnd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCost = new javax.swing.JTextField();
        jButtonBackEntryArticle = new javax.swing.JButton();
        jTextFieldNewArticleType = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenu.setBackground(new java.awt.Color(93, 93, 93));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInsertNewArticle.setText("Inserisci nuovo articolo");
        jButtonInsertNewArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertNewArticleActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInsertNewArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 220, 48));

        jButtonMovements.setText("Storico movimenti");
        jButtonMovements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMovementsActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonMovements, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 220, 48));

        jPanelShowAllMovement.setBackground(new java.awt.Color(93, 93, 93));
        jPanelShowAllMovement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInesertNewArticle.setBackground(new java.awt.Color(93, 93, 93));
        jPanelInesertNewArticle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInfoCode.setForeground(new java.awt.Color(254, 254, 254));
        jLabelInfoCode.setText("Inserimento nuovo articolo");
        jPanelInesertNewArticle.add(jLabelInfoCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 23, 412, -1));

        jComboBoxCategoryArticle.setModel(new DefaultComboBoxModel<>(Sport.values()));
        jComboBoxCategoryArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoryArticleActionPerformed(evt);
            }
        });
        jPanelInesertNewArticle.add(jComboBoxCategoryArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 88, 350, -1));

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Categoria articolo");
        jPanelInesertNewArticle.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Descrizione");
        jPanelInesertNewArticle.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jTextFieldDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescriptionActionPerformed(evt);
            }
        });
        jPanelInesertNewArticle.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 350, 90));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Tipo di articolo");
        jPanelInesertNewArticle.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Materiali.setForeground(new java.awt.Color(254, 254, 254));
        Materiali.setText("Materiali");
        jPanelInesertNewArticle.add(Materiali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jTextFieldMaterials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaterialsActionPerformed(evt);
            }
        });
        jPanelInesertNewArticle.add(jTextFieldMaterials, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 350, -1));

        jButtonAddItems.setText("Aggiungi altri articoli");
        jButtonAddItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddItemsActionPerformed(evt);
            }
        });
        jPanelInesertNewArticle.add(jButtonAddItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, -1, -1));

        jButtonEnd.setText("FINE");
        jButtonEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndActionPerformed(evt);
            }
        });
        jPanelInesertNewArticle.add(jButtonEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Prezzo");
        jPanelInesertNewArticle.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, -1));

        jTextFieldCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostActionPerformed(evt);
            }
        });
        jPanelInesertNewArticle.add(jTextFieldCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 30, -1));

        jButtonBackEntryArticle.setText("INDIETRO");
        jButtonBackEntryArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackEntryArticleActionPerformed(evt);
            }
        });
        jPanelInesertNewArticle.add(jButtonBackEntryArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));
        jPanelInesertNewArticle.add(jTextFieldNewArticleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelShowAllMovement, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelInesertNewArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelShowAllMovement, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelInesertNewArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertNewArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertNewArticleActionPerformed
        
        //Rende visibile il pannello Inserisci nuovo articolo
        closeAllExcept(jPanelInesertNewArticle);
    }//GEN-LAST:event_jButtonInsertNewArticleActionPerformed

    private void jButtonMovementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMovementsActionPerformed
        
        //Rende visibile il pannello visualizza movimenti articolo
        closeAllExcept(jPanelShowAllMovement);
    }//GEN-LAST:event_jButtonMovementsActionPerformed

    private void jComboBoxCategoryArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoryArticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoryArticleActionPerformed

    private void jTextFieldDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescriptionActionPerformed

    private void jTextFieldMaterialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaterialsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaterialsActionPerformed

    private void jButtonAddItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddItemsActionPerformed

        saveInformationEntry();

        //controllare correttezza info

        //refresh del pannello

    }//GEN-LAST:event_jButtonAddItemsActionPerformed

    private void jButtonEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEndActionPerformed
        saveInformationEntry();

        //controllare correttezza info

        //apre il pannello menu
        closeAllExcept(jPanelMenu);
    }//GEN-LAST:event_jButtonEndActionPerformed

    private void jTextFieldCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCostActionPerformed

    private void jButtonBackEntryArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackEntryArticleActionPerformed

        //pulsante indietro: torna alla schermata principale del magazzino
        closeAllExcept(jPanelMenu);
    }//GEN-LAST:event_jButtonBackEntryArticleActionPerformed

     //rende visibile un pannello
    public void closeAllExcept(JPanel p){
        jPanelMenu.setVisible(false);
        jPanelInesertNewArticle.setVisible(false);
        jPanelShowAllMovement.setVisible(false);
        p.setVisible(true);
    }
    
    public void saveInformationEntry(){
        
        //salvataggio delle info dell'articolo in entrata
        String categoryArticle = jComboBoxCategoryArticle.getSelectedItem().toString();
        System.out.println("Categoria articolo: " + categoryArticle);
        
        //salvataggio del tipo di articolo
        String typeArticle = jTextFieldNewArticleType.getText();
        System.out.println("Tipo di articolo: " + typeArticle);
        
        //salvataggio della descrizione
        String description = jTextFieldDescription.getText();
         System.out.println("Descrizione: " + description);
         
         //salvataggio dei materiali
        String material = jTextFieldMaterials.getText();
        System.out.println("materiali: " + material);
         
        //salvataggio del prezzo
        String cost = jTextFieldCost.getText();
        System.out.println("Prezzo: " + cost);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Materiali;
    private javax.swing.JButton jButtonAddItems;
    private javax.swing.JButton jButtonBackEntryArticle;
    private javax.swing.JButton jButtonEnd;
    private javax.swing.JButton jButtonInsertNewArticle;
    private javax.swing.JButton jButtonMovements;
    private javax.swing.JComboBox<Sport> jComboBoxCategoryArticle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelInfoCode;
    private javax.swing.JPanel jPanelInesertNewArticle;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelShowAllMovement;
    private javax.swing.JTextField jTextFieldCost;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldMaterials;
    private javax.swing.JTextField jTextFieldNewArticleType;
    // End of variables declaration//GEN-END:variables

 
}