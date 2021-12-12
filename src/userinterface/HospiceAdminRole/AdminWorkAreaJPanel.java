

package userinterface.HospiceAdminRole;


import Business.EcoSystem;
import Business.Hospice.Hospice;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rohannayak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        Hospice hospice = system.getHospiceDirectory().findHospiceByEmailID(userAccount.getUsername(), 
                system.getHospiceDirectory().getListOfHospice());
        jTextField1.setText(String.valueOf(hospice.getTotalHospiceBalance()));
       jTextField1.setEditable(false);

    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageNurse = new javax.swing.JButton();
        btnManagePatients = new javax.swing.JButton();
        btnManageProvider = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnAddProvider = new javax.swing.JButton();
        btnAddPatient = new javax.swing.JButton();
        btnAddNurse = new javax.swing.JButton();
        btnAddCounsellor = new javax.swing.JButton();
        btnManageCounsellors = new javax.swing.JButton();
        btnViewDonations = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageNurse.setText("Manage Nurses");
        btnManageNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNurseActionPerformed(evt);
            }
        });
        add(btnManageNurse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, 30));

        btnManagePatients.setText("Manage Patients");
        btnManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientsActionPerformed(evt);
            }
        });
        add(btnManagePatients, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 150, -1));

        btnManageProvider.setText("Manage Providers");
        btnManageProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProviderActionPerformed(evt);
            }
        });
        add(btnManageProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Hospice:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, -1));

        jLabel1.setText("Total Hospice Balance: $ ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 120, 30));

        btnAddProvider.setText("Add Provider");
        btnAddProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProviderActionPerformed(evt);
            }
        });
        add(btnAddProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });
        add(btnAddPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        btnAddNurse.setText("Add Nurse");
        btnAddNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNurseActionPerformed(evt);
            }
        });
        add(btnAddNurse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 179, 120, 30));

        btnAddCounsellor.setText("Add Counsellor");
        btnAddCounsellor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCounsellorActionPerformed(evt);
            }
        });
        add(btnAddCounsellor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        btnManageCounsellors.setText("Manage Counsellors");
        btnManageCounsellors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCounsellorsActionPerformed(evt);
            }
        });
        add(btnManageCounsellors, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        btnViewDonations.setText("View Donations");
        add(btnViewDonations, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNurseActionPerformed
        // TODO add your handling code here:
        ManageNurseJPanel manageNurseJPanel = new ManageNurseJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Manage Nurse", manageNurseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageNurseActionPerformed

    private void btnManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientsActionPerformed
        ManagePatientJPanel managePatientJPanel = new ManagePatientJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Manage Patient", managePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
    }//GEN-LAST:event_btnManagePatientsActionPerformed

    private void btnManageProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProviderActionPerformed
        ManageProviderJPanel manageProviderJPanel = new ManageProviderJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Manage Provider", manageProviderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProviderActionPerformed

    private void btnAddProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProviderActionPerformed
        // TODO add your handling code here:
        AddProviderJPanel addProviderJPanel = new AddProviderJPanel(userProcessContainer,userAccount,system);
        userProcessContainer.add("Add Counsellor", addProviderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnAddProviderActionPerformed

    private void btnAddCounsellorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCounsellorActionPerformed
        // TODO add your handling code here:
        AddCounsellorJPanel addCounsellorJPanel = new AddCounsellorJPanel(userProcessContainer, userAccount, system);
        userProcessContainer.add("Add Counsellor", addCounsellorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddCounsellorActionPerformed

    private void btnManageCounsellorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCounsellorsActionPerformed
        // TODO add your handling code here:
        ManageCounsellorJPanel manageCounsellorJPanel = new ManageCounsellorJPanel(userProcessContainer,userAccount,system);
        userProcessContainer.add("Manage Counsellor", manageCounsellorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCounsellorsActionPerformed

    private void btnAddNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNurseActionPerformed
        // TODO add your handling code here:
        AddNurseJPanel addNurseJPanel = new AddNurseJPanel(userProcessContainer,userAccount,system);
        userProcessContainer.add("Add Nurse", addNurseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddNurseActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        AddPatientJPanel addPatientJPanel = new AddPatientJPanel(userProcessContainer,userAccount, system);
        userProcessContainer.add("Add Patient", addPatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPatientActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCounsellor;
    private javax.swing.JButton btnAddNurse;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnAddProvider;
    private javax.swing.JButton btnManageCounsellors;
    private javax.swing.JButton btnManageNurse;
    private javax.swing.JButton btnManagePatients;
    private javax.swing.JButton btnManageProvider;
    private javax.swing.JButton btnViewDonations;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
