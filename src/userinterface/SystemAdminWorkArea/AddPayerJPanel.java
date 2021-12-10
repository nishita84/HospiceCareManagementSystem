/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Payers.Payer;
import Business.SetIDsForEnterprises;
import Business.UserAccount.UserAccount;
import Business.ValidationLogic;
import javax.swing.JOptionPane;

/**
 *
 * @author nishitasheelendraupadhyay
 */
public class AddPayerJPanel extends javax.swing.JPanel {
    UserAccount userAccount;
    EcoSystem system;

    /** Creates new form AddPayerJPanel */
    
    public AddPayerJPanel() {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        lbAmount = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        lbAmount1 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtBillingAddress = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        lbTitle.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Add Payer");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lbName.setText("Name:");

        lbAmount.setText("Billing Address:");

        lblimage.setIcon(new javax.swing.ImageIcon("/Users/nishitasheelendraupadhyay/Desktop/HospiceCareManagementSystem/src/Images/PayerImg.png")); // NOI18N

        lbAmount1.setText("Email ID:");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtBillingAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillingAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbName)
                            .addComponent(lbAmount)
                            .addComponent(lbAmount1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailID)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave)
                            .addComponent(txtBillingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAmount)
                            .addComponent(txtBillingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAmount1))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)))
                .addContainerGap(675, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         ValidationLogic validationLogic = new ValidationLogic();
         if(validationLogic.validateIfAllFieldsAreFilled_3(txtName, txtBillingAddress, txtEmailID))
         {
             String PayerName = txtName.getText();
             String PayerBillingAddress = txtBillingAddress.getText();
             String PayerEmailID = txtEmailID.getText();
             SetIDsForEnterprises setIDForEnterprises = new SetIDsForEnterprises();
             String PayerID = setIDForEnterprises.SetIDForDonors();
             Payer NewPayer = system.getPayerDirectory().createPayer(PayerID, PayerName, PayerID, PayerEmailID);
             if(NewPayer!= null)
             {
                 JOptionPane.showMessageDialog(this, "Payer details are saved successfully!!");
             }
             else
             {
                 JOptionPane.showMessageDialog(this, "Payer details not saved successfully!");
             }
         }
         else
         {
                  JOptionPane.showMessageDialog(this, "Please ensure that all fields are filled!!");
         }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBillingAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillingAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillingAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbAmount1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField txtBillingAddress;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
