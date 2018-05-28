/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import objects.*;

/**
 *
 * @author marco
 */
public class LoginPanel extends javax.swing.JFrame {
    private Warehouse warehouse;
    
    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
    }
    
    public LoginPanel(Warehouse warehouse) {
        this();
        this.warehouse = warehouse;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneUser = new javax.swing.JTextPane();
        jPasswordFieldPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionale Beta v 0.2");

        jPanelLogin.setBackground(new java.awt.Color(93, 93, 93));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(400, 400));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPaneUser);

        jPasswordFieldPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(117, 117, 117)
                .addComponent(loginButton)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String userName = jTextPaneUser.getText();
        String password = jPasswordFieldPassword.getText();
        
        if(warehouse.getUsers().containsKey(userName) &&
                warehouse.getUsers().get(userName).getPassword().equals(password)) {
            if(warehouse.getUsers().get(userName) instanceof AdministrativeSecretary) {
                new SecretaryPanel().setVisible(true);
                this.setVisible(false);
            }

            if(warehouse.getUsers().get(userName) instanceof Shop) {
               new ShopPanel().setVisible(false);
               this.setVisible(false);
            }
                
            if(warehouse.getUsers().get(userName) instanceof WarehouseWorker) {
                new WarehousePanel().setVisible(true);
                this.setVisible(false);
            }
            
        }
            
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPaneUser;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {
        new LoginPanel(new Warehouse()).setVisible(true);
        
        System.out.println("prova");
    }
}
