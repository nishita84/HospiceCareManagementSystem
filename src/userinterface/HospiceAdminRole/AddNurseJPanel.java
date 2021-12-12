/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospiceAdminRole;

import Business.EcoSystem;
import Business.Hospice.Hospice;
import Business.Nurses.Nurse;
import Business.Organization;
import Business.Providers.Provider;
import Business.SetIDsForEnterprises;
import Business.UserAccount.UserAccount;
import Business.ValidationLogic;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author rohannayak
 */
public class AddNurseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNurseJPanel
     */
    UserAccount userAccount;
    EcoSystem system;
    JPanel userProcessContainer;
    Organization customerOrg;
    Nurse Nurse;
    
    public AddNurseJPanel(JPanel userProcessContainer,UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        Hospice hospice = system.getHospiceDirectory().findHospiceByEmailID(userAccount.getUsername(),
                system.getHospiceDirectory().getListOfHospice());
        HospiceDropdown.setSelectedItem(hospice.getHospiceName());
        populateProviderDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbAddress = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lbState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lbZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        lbCountry = new javax.swing.JLabel();
        lbContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lbEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lbReportingProvider = new javax.swing.JLabel();
        ReportingProviderDropDown = new javax.swing.JComboBox();
        btnAddNurse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HospiceDropdown = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        CountryDropDown = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lbTitle.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("ADD NURSE");

        lbName.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbName.setText("Name :");

        lbAddress.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbAddress.setText("Address :");

        lbCity.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbCity.setText("City :");

        lbState.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbState.setText("State :");

        lbZipCode.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbZipCode.setText("Zip Code :");

        lbCountry.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbCountry.setText("Country :");

        lbContactNumber.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbContactNumber.setText("Contact Number :");

        lbEmailID.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbEmailID.setText("Email ID :");

        lbReportingProvider.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        lbReportingProvider.setText("Reporting Provider :");

        ReportingProviderDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        btnAddNurse.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        btnAddNurse.setText("Add Nurse");
        btnAddNurse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNurseActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Nurse_Image2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel2.setText("Hospice :");

        HospiceDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jLabel4.setText("Date Of  Birth :");

        jDateChooser2.setBackground(new java.awt.Color(204, 204, 255));

        CountryDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAddress)
                            .addComponent(lbCity)
                            .addComponent(lbState)
                            .addComponent(lbZipCode)
                            .addComponent(lbCountry)
                            .addComponent(lbContactNumber)
                            .addComponent(lbEmailID)
                            .addComponent(lbReportingProvider)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(lbName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(txtCity)
                            .addComponent(txtState)
                            .addComponent(txtZipCode)
                            .addComponent(txtContactNumber)
                            .addComponent(txtEmailID)
                            .addComponent(txtAddress)
                            .addComponent(HospiceDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ReportingProviderDropDown, 0, 244, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnAddNurse))
                            .addComponent(CountryDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(29, 29, 29)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbAddress))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbCity))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbState))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbZipCode))
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lbCountry)
                                            .addComponent(CountryDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbContactNumber)))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbEmailID)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ReportingProviderDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbReportingProvider))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HospiceDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))))
                .addGap(26, 26, 26)
                .addComponent(btnAddNurse)
                .addContainerGap(476, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNurseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNurseActionPerformed
        // TODO add your handling code here:
        ValidationLogic validationLogic = new ValidationLogic();
        if(validationLogic.validateIfAllFieldsAreFilled_7(txtName, txtAddress, txtCity, txtState, txtZipCode,
                txtContactNumber, txtEmailID) && validationLogic.validateIfContactNumberIsCorrect(txtContactNumber) && validationLogic.validateIfEmailIDIsCorrect(txtEmailID) && validationLogic.validateIfZipCodeIsValid(txtZipCode) && validationLogic.validateIfFieldIsNumeric(txtZipCode)){
            String nurseName = txtName.getText();
            String nurseAddress = txtAddress.getText();
            String nurseCity = txtCity.getText();
            String nurseState = txtState.getText();
            String nurseZipcode = txtZipCode.getText();
            String nurseCountry = CountryDropDown.getSelectedItem().toString();
            String nurseContactNumber = txtContactNumber.getText();
            String nurseEmailID = txtEmailID.getText();
            SetIDsForEnterprises setIDForEnterprises = new SetIDsForEnterprises();
            String nurseID = setIDForEnterprises.SetIDForNurse();
            String providerNPIChosen = ReportingProviderDropDown.getSelectedItem().toString();
            Date dateOfBirth = jDateChooser2.getDate();
            Provider providerWhoNurseWorksFor = system.getProviderDirectory().findProviderByNPI(providerNPIChosen, 
                    system.getProviderDirectory().getProviderList());
            Nurse newNurse = system.getNurseDirectory().createNurse(nurseID, nurseName, nurseAddress, nurseCity, nurseState, nurseZipcode, nurseCountry, nurseContactNumber, nurseEmailID, 
                    providerWhoNurseWorksFor, dateOfBirth, providerWhoNurseWorksFor.getOperatingHospice(), true);
            if(newNurse != null)
            {
                JOptionPane.showMessageDialog(this, "Nurse added successfully!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Nurse details are not saved successfully!!");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please ensure that all fields are filled!!");
        }
    }//GEN-LAST:event_btnAddNurseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        AdminWorkAreaJPanel a = new AdminWorkAreaJPanel(userProcessContainer, userAccount, system);
        userProcessContainer.add(a);
        Layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CountryDropDown;
    private javax.swing.JComboBox<String> HospiceDropdown;
    private javax.swing.JComboBox<String> ReportingProviderDropDown;
    private javax.swing.JButton btnAddNurse;
    private javax.swing.JButton btnBack;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbContactNumber;
    private javax.swing.JLabel lbCountry;
    private javax.swing.JLabel lbEmailID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbReportingProvider;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbZipCode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables

    private void populateProviderDropdown() {
        Hospice hospice = system.getHospiceDirectory().findHospiceByEmailID(userAccount.getUsername(),
                system.getHospiceDirectory().getListOfHospice());
        for(Provider provider : system.getProviderDirectory().getProviderList())
        {
            if(provider.getOperatingHospice().getHospiceID().equals(hospice.getHospiceID()))
            {
                ReportingProviderDropDown.addItem(provider.getProviderNPI());
            }
        }
    }
}
