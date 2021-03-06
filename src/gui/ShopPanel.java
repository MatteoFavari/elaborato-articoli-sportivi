/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
/**
 *
 * @author marco
 */
public class ShopPanel extends javax.swing.JFrame {

    /**
     * Creates new form ShopPanel
     */
    public ShopPanel() {
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

        jPanelMenu = new javax.swing.JPanel();
        jButtonNewOrder = new javax.swing.JButton();
        jButtonHistoricalOrders = new javax.swing.JButton();
        jPanelAllOrders = new javax.swing.JPanel();
        jButtonBackAllOrders = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanelNewOrder = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTypeArticle = new javax.swing.JComboBox<>();
        jButtonEnd = new javax.swing.JButton();
        jButtonAddItems = new javax.swing.JButton();
        jComboBoxCategoryArticle = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButtonBackShopPanel = new javax.swing.JButton();
        jLabelCost = new javax.swing.JLabel();
        jComboBoxCost = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenu.setBackground(new java.awt.Color(93, 93, 93));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonNewOrder.setText("NUOVO ORDINE");
        jButtonNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewOrderActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonNewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, 100));

        jButtonHistoricalOrders.setText("STORICO ORDINI");
        jButtonHistoricalOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistoricalOrdersActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonHistoricalOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 190, 100));

        jPanelAllOrders.setBackground(new java.awt.Color(93, 93, 93));
        jPanelAllOrders.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelAllOrders.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelAllOrders.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBackAllOrders.setText("Indietro");
        jButtonBackAllOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackAllOrdersActionPerformed(evt);
            }
        });
        jPanelAllOrders.add(jButtonBackAllOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        jPanelAllOrders.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jPanelNewOrder.setBackground(new java.awt.Color(93, 93, 93));
        jPanelNewOrder.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelNewOrder.setMinimumSize(new java.awt.Dimension(600, 600));
        jPanelNewOrder.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanelNewOrder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Categoria articolo");
        jPanelNewOrder.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 150, -1));

        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Quantità");
        jPanelNewOrder.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jTextFieldQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityActionPerformed(evt);
            }
        });
        jPanelNewOrder.add(jTextFieldQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 34, -1));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Tipo di articolo");
        jPanelNewOrder.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jComboBoxTypeArticle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxTypeArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeArticleActionPerformed(evt);
            }
        });
        jPanelNewOrder.add(jComboBoxTypeArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, -1));

        jButtonEnd.setText("Fine");
        jButtonEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEndActionPerformed(evt);
            }
        });
        jPanelNewOrder.add(jButtonEnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jButtonAddItems.setText("Aggiungi altri articoli");
        jButtonAddItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddItemsActionPerformed(evt);
            }
        });
        jPanelNewOrder.add(jButtonAddItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        jComboBoxCategoryArticle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelNewOrder.add(jComboBoxCategoryArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 120, -1));

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("NUOVO ORDINE");
        jPanelNewOrder.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jButtonBackShopPanel.setText("Indietro");
        jButtonBackShopPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackShopPanelActionPerformed(evt);
            }
        });
        jPanelNewOrder.add(jButtonBackShopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jLabelCost.setForeground(new java.awt.Color(254, 254, 254));
        jLabelCost.setText("Prezzo");
        jPanelNewOrder.add(jLabelCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jComboBoxCost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelNewOrder.add(jComboBoxCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAllOrders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelAllOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelNewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewOrderActionPerformed
        
        //apre il pannello nuovi ordini
        setVisibleNewOrders();
    }//GEN-LAST:event_jButtonNewOrderActionPerformed

    private void jTextFieldQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantityActionPerformed

    private void jComboBoxTypeArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeArticleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTypeArticleActionPerformed

    private void jButtonEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEndActionPerformed
        saveInformation();

        //controllare correttezza info

        setVisibleMenu();
    }//GEN-LAST:event_jButtonEndActionPerformed

    private void jButtonAddItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddItemsActionPerformed

        saveInformation();

        //controllare correttezza info

        //refresh del pannello

    }//GEN-LAST:event_jButtonAddItemsActionPerformed

    private void jButtonHistoricalOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistoricalOrdersActionPerformed
        
        //apre il pannello dello storico degli ordini
        setVisibleAllOrders();
    }//GEN-LAST:event_jButtonHistoricalOrdersActionPerformed

    private void jButtonBackShopPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackShopPanelActionPerformed
        
        //pulsante indietro: ritorna al menu
        setVisibleMenu();
    }//GEN-LAST:event_jButtonBackShopPanelActionPerformed

    private void jButtonBackAllOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackAllOrdersActionPerformed
        //pulsante indietro: ritorna al menu
        setVisibleMenu();
    }//GEN-LAST:event_jButtonBackAllOrdersActionPerformed

    //salva le informazioni inserite dall'utente
    public void saveInformation(){
        
        //salvataggio delle info dell'articolo in entrata
        String categoryArticle = jComboBoxCategoryArticle.getSelectedItem().toString();
        System.out.println("Categoria articolo: " + categoryArticle);
        
        //salvataggio del tipo di articolo
        String typeArticle = jComboBoxTypeArticle.getSelectedItem().toString();
        System.out.println("Tipo di articolo: " + typeArticle);
        
        //salvataggio del prezzo
        String cost = jComboBoxCost.getSelectedItem().toString();
        System.out.println("costo: " + cost);    
         
         //salvataggio della quantità di articoli
        String quantity = jTextFieldQuantity.getText();
        System.out.println("quantità: " + quantity);      
    }
    
    //rende visibile il pannello menu
    public void setVisibleMenu(){
        jPanelMenu.setVisible(true);
        jPanelNewOrder.setVisible(false);
        jPanelAllOrders.setVisible(false);
    }
    
    //rende visibile il pannello nuovi ordini
    public void setVisibleNewOrders(){
        jPanelNewOrder.setVisible(true);
        jPanelAllOrders.setVisible(false);
        jPanelMenu.setVisible(false);
    }
    
    //rende visibile il pannello storico ordini
    public void setVisibleAllOrders(){
        jPanelAllOrders.setVisible(true);
        jPanelNewOrder.setVisible(false);
        jPanelMenu.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddItems;
    private javax.swing.JButton jButtonBackAllOrders;
    private javax.swing.JButton jButtonBackShopPanel;
    private javax.swing.JButton jButtonEnd;
    private javax.swing.JButton jButtonHistoricalOrders;
    private javax.swing.JButton jButtonNewOrder;
    private javax.swing.JComboBox<String> jComboBoxCategoryArticle;
    private javax.swing.JComboBox<String> jComboBoxCost;
    private javax.swing.JComboBox<String> jComboBoxTypeArticle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCost;
    private javax.swing.JPanel jPanelAllOrders;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelNewOrder;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
