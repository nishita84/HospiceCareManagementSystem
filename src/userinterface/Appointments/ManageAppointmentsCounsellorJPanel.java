/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Appointments;

import Business.Appointments.Appointment;
import Business.Counsellors.Counsellor;
import Business.EcoSystem;
import Business.LookUpMapping;
import Business.Providers.Provider;
import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author architnigam
 */

public class ManageAppointmentsCounsellorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAppointmentsCounsellorJPanel
     */
    UserAccount userAccount;
    EcoSystem system;
    public ManageAppointmentsCounsellorJPanel(UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.system = system;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        cbAppointmentCompleted = new javax.swing.JCheckBox();
        txtComments = new javax.swing.JTextField();
        lblComments = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 20)); // NOI18N
        jLabel1.setText("Appointments Scheduled");
        add(jLabel1);
        jLabel1.setBounds(100, 80, 380, 100);

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Patient Name", "Status", "Reason", "Appointment Time", "Appointment"
            }
        ));
        jScrollPane1.setViewportView(tblAppointments);

        add(jScrollPane1);
        jScrollPane1.setBounds(70, 160, 860, 166);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(630, 350, 120, 60);

        cbAppointmentCompleted.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        cbAppointmentCompleted.setText("Appointment completed?");
        add(cbAppointmentCompleted);
        cbAppointmentCompleted.setBounds(300, 470, 212, 36);
        add(txtComments);
        txtComments.setBounds(270, 540, 278, 40);

        lblComments.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        lblComments.setText("Comments:");
        add(lblComments);
        lblComments.setBounds(180, 540, 100, 50);

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(310, 610, 140, 50);

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel);
        btnCancel.setBounds(800, 350, 120, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ManageAppointmentCounselling.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = tblAppointments.getSelectedRow();
        LookUpMapping lookups = new LookUpMapping();
        DefaultTableModel model = (DefaultTableModel) tblAppointments.getModel();
        Appointment selectedAppointment = (Appointment) model.getValueAt(selectedIndex, 5);
        if(selectedAppointment.getAppointmentStatus() == 0)
        {
            btnSave.setVisible(true);
            txtComments.setVisible(true);
            lblComments.setVisible(true);
            cbAppointmentCompleted.setVisible(true);
        
        }
        else{
            String appointmentStatusValue = lookups.mapAppointmentStatus(selectedAppointment.getAppointmentStatus());
            JOptionPane.showMessageDialog(this, "An appointment with status '"+appointmentStatusValue+"' cannot be updated");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblAppointments.getSelectedRow();
        if(selectedIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Please select an appointment before proceding!");
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tblAppointments.getModel();
            Appointment selectedAppointment = (Appointment) model.getValueAt(selectedIndex, 5);
            Appointment updatedAppointment = system.getAppointmentDirectory().updateAppointment(selectedAppointment);
            if(cbAppointmentCompleted.isSelected())
            {
                updatedAppointment.setAppointmentStatus(1);
                updatedAppointment.setAppointmentClosingComments(txtComments.getText());
            }
            cbAppointmentCompleted.setVisible(false);
            btnSave.setVisible(false);
            txtComments.setVisible(false);
            lblComments.setVisible(false);
            JOptionPane.showMessageDialog(this, "Appointment successfully closed!");
            populateTable();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblAppointments.getSelectedRow();
        LookUpMapping lookups = new LookUpMapping();
        DefaultTableModel model = (DefaultTableModel) tblAppointments.getModel();
        Appointment selectedAppointment = (Appointment) model.getValueAt(selectedIndex, 5);
        if(selectedAppointment.getAppointmentStatus() == 0)
        {
            Appointment updatedAppointment = system.getAppointmentDirectory().updateAppointment(selectedAppointment);
            updatedAppointment.setAppointmentStatus(2);
            updatedAppointment.setAppointmentClosingComments("Canceled");
        }
        else{
            String appointmentStatusValue = lookups.mapAppointmentStatus(selectedAppointment.getAppointmentStatus());
            JOptionPane.showMessageDialog(this, "An appointment with status '"+appointmentStatusValue+"' cannot be canceled");
        }
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox cbAppointmentCompleted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComments;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JTextField txtComments;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        try{
            DefaultTableModel model1 = (DefaultTableModel) tblAppointments.getModel();
        LookUpMapping lookups = new LookUpMapping();
        Counsellor counsellor = system.getCounsellorDirectory().findCounsellorByEmailID(userAccount.getUsername(), 
                 system.getCounsellorDirectory().getListOfCounsellors());
        model1.setRowCount(0);
        for(int index = 0; index < system.getAppointmentDirectory().getListOfAppointments().size(); index++)
        {
            Object[] row = new Object[6];
            Appointment currentAppointment = system.getAppointmentDirectory().getListOfAppointments().get(index);
            if(currentAppointment.getAppointmentCounsellor().getCounsellorID().equals(
            counsellor.getCounsellorID()))
            {
                row[0] = currentAppointment.getAppointmentID();
                row[1] = currentAppointment.getAppointmentPatient().getPatientName();
                row[2] = lookups.mapAppointmentStatus(currentAppointment.getAppointmentStatus());
                row[3] = currentAppointment.getAppointmentReason();
                DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                String dateToString = df.format(currentAppointment.getAppointmentDate()).substring(0, 10); 
                row[4] = dateToString + " " + currentAppointment.getAppointmentTime();
                row[5] = currentAppointment;
            }
            model1.addRow(row);
        }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
