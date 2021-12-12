/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Alerts.ManageAlertsNurseJPanel;
import userinterface.Alerts.ManageAlertsProviderJPanel;
import userinterface.Workflows.LogVitalSignsJPanel;
import userinterface.Workflows.ViewPatientInformationJPanel;
import userinterface.Workflows.VitalSignsReportsJPanel;

/**
 *
 * @author architnigam
 */
public class NurseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseWorkAreaJPanel
     */
    EcoSystem system;
    UserAccount account;
    public NurseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        populateTable();
        initComponents();
        this.system = system;
        this.account = account;
    }
    
    void populateTable(){
        // Made some changes
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnReports = new javax.swing.JButton();
        btnAlerts = new javax.swing.JButton();
        btnPatientHealthData = new javax.swing.JButton();
        btnLogVitalSigns = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(928, 766));

        btnReports.setText("View Reports and Charts");
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        btnAlerts.setText("Manage Alerts");
        btnAlerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertsActionPerformed(evt);
            }
        });

        btnPatientHealthData.setText("View Patient Health Data");
        btnPatientHealthData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientHealthDataActionPerformed(evt);
            }
        });

        btnLogVitalSigns.setText("Log Vital Signs");
        btnLogVitalSigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogVitalSignsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPatientHealthData)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLogVitalSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReports, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnPatientHealthData)
                .addGap(47, 47, 47)
                .addComponent(btnLogVitalSigns)
                .addGap(40, 40, 40)
                .addComponent(btnReports)
                .addGap(39, 39, 39)
                .addComponent(btnAlerts)
                .addContainerGap(581, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(928, 766));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1651, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        VitalSignsReportsJPanel vitalSignsJPanel = new VitalSignsReportsJPanel(system, account);
        jSplitPane1.setRightComponent(vitalSignsJPanel);
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnPatientHealthDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientHealthDataActionPerformed
        // TODO add your handling code here:
        ViewPatientInformationJPanel viewPatientInformationPanel = new ViewPatientInformationJPanel();
        jSplitPane1.setRightComponent(viewPatientInformationPanel);
    }//GEN-LAST:event_btnPatientHealthDataActionPerformed

    private void btnAlertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertsActionPerformed
        // TODO add your handling code here:
        ManageAlertsNurseJPanel manageAlertsPanel = new ManageAlertsNurseJPanel(system, account);
        jSplitPane1.setRightComponent(manageAlertsPanel);
    }//GEN-LAST:event_btnAlertsActionPerformed

    private void btnLogVitalSignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogVitalSignsActionPerformed
        // TODO add your handling code here:
        LogVitalSignsJPanel logVitalSignsJPanel = new LogVitalSignsJPanel(system, account);
        jSplitPane1.setRightComponent(logVitalSignsJPanel);
    }//GEN-LAST:event_btnLogVitalSignsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlerts;
    private javax.swing.JButton btnLogVitalSigns;
    private javax.swing.JButton btnPatientHealthData;
    private javax.swing.JButton btnReports;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
