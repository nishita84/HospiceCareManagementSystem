/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Workflows.ChatBotSymptomsJPanel;
import userinterface.Alerts.CreateAnAlertJPanel;
import userinterface.Appointments.ScheduleAppointmentJPanel;
import userinterface.Forms.SelfDiagnosisFormJPanel;

/**
 *
 * @author raunak
 */
public class PatientAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem system;
    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PatientAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        
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
        btnViewPatientDetails = new javax.swing.JButton();
        btnSelfDiagnosisForm = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        btnAlert = new javax.swing.JButton();
        btnSymptomCatcher = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        btnViewPatientDetails.setText("View My Details");
        btnViewPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientDetailsActionPerformed(evt);
            }
        });

        btnSelfDiagnosisForm.setText("Fill Self Diagnosis Form");
        btnSelfDiagnosisForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelfDiagnosisFormActionPerformed(evt);
            }
        });

        btnAppointment.setText("Schedule an Appointment");
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });

        btnAlert.setText("Create an Alert");
        btnAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertActionPerformed(evt);
            }
        });

        btnSymptomCatcher.setText("Chat with SymptomCatcher!");
        btnSymptomCatcher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSymptomCatcherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAppointment)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSelfDiagnosisForm))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnViewPatientDetails))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSymptomCatcher))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnViewPatientDetails)
                .addGap(34, 34, 34)
                .addComponent(btnSelfDiagnosisForm)
                .addGap(35, 35, 35)
                .addComponent(btnAppointment)
                .addGap(33, 33, 33)
                .addComponent(btnAlert)
                .addGap(48, 48, 48)
                .addComponent(btnSymptomCatcher)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSymptomCatcherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSymptomCatcherActionPerformed
        // TODO add your handling code here:
        ChatBotSymptomsJPanel chatBotSymptomsPanel = new ChatBotSymptomsJPanel();
        jSplitPane1.setRightComponent(chatBotSymptomsPanel);
    }//GEN-LAST:event_btnSymptomCatcherActionPerformed

    private void btnSelfDiagnosisFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelfDiagnosisFormActionPerformed
        // TODO add your handling code here:
        SelfDiagnosisFormJPanel selfDiagnosisFormJPanel = new SelfDiagnosisFormJPanel();
        jSplitPane1.setRightComponent(selfDiagnosisFormJPanel);
    }//GEN-LAST:event_btnSelfDiagnosisFormActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        // TODO add your handling code here:
        ScheduleAppointmentJPanel scheduleAppointmentJPanel = new ScheduleAppointmentJPanel(system, userAccount);
        jSplitPane1.setRightComponent(scheduleAppointmentJPanel);
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnAlertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertActionPerformed
        // TODO add your handling code here:
        CreateAnAlertJPanel createAnAlertJPanel = new CreateAnAlertJPanel(userAccount,system );
        jSplitPane1.setRightComponent(createAnAlertJPanel);
    }//GEN-LAST:event_btnAlertActionPerformed

    private void btnViewPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewPatientDetailsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlert;
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnSelfDiagnosisForm;
    private javax.swing.JButton btnSymptomCatcher;
    private javax.swing.JButton btnViewPatientDetails;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
