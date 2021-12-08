/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Alerts.AlertsDirectory;
import Business.Counsellors.CounsellorDirectory;
import Business.Diagnosis.DiagnosisDirectory;
import Business.Donation.DonationDirectory;
import Business.Donors.DonorsDirectory;
import Business.Hospice.HospiceDirectory;
import Business.Nurses.NursesDirectory;
import Business.Patients.PatientsDirectory;
import Business.Payers.PayersDirectory;
import Business.Providers.ProviderDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Services.ServicesDirectory;
import Business.VitalSigns.VitalSignsDirectory;
import Business.Volunteers.VolunteerDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    HospiceDirectory hospiceDirectory;
    ProviderDirectory providerDirectory;
    NursesDirectory nurseDirectory;
    PatientsDirectory patientDirectory;
    PayersDirectory payerDirectory;
    CounsellorDirectory counsellorDirectory;
    DonorsDirectory donorDirectory;
    VolunteerDirectory volunteerDirectory;
    ServicesDirectory serviceDirectory;
    DiagnosisDirectory diagnosisDirectory;
    DonationDirectory donationDirectory;
    VitalSignsDirectory vitalSignsDirectory;
    AlertsDirectory alertsDirectory;

    public EcoSystem(HospiceDirectory hospiceDirectory, ProviderDirectory providerDirectory, NursesDirectory nurseDirectory, PatientsDirectory patientDirectory
                     , PayersDirectory payerDirectory, CounsellorDirectory counsellorDirectory, DonorsDirectory donorDirectory, 
                       VolunteerDirectory volunteerDirectory, ServicesDirectory serviceDirectory, 
                       DiagnosisDirectory diagnosisDirectory, DonationDirectory donationDirectory, VitalSignsDirectory vitalSignsDirectory, 
                       AlertsDirectory alertsDirectory)  
    {
        this.hospiceDirectory = hospiceDirectory;
        this.nurseDirectory = nurseDirectory;
        this.patientDirectory = patientDirectory;
        this.providerDirectory = providerDirectory;
        this.payerDirectory = payerDirectory;
        this.counsellorDirectory = counsellorDirectory;
        this.donorDirectory = donorDirectory;
        this.volunteerDirectory = volunteerDirectory;
        this.serviceDirectory = serviceDirectory;
        this.diagnosisDirectory = diagnosisDirectory;
        this.donationDirectory = donationDirectory;
        this.vitalSignsDirectory = vitalSignsDirectory;
        this.alertsDirectory = alertsDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
         hospiceDirectory = new HospiceDirectory();
         nurseDirectory = new NursesDirectory();
         patientDirectory = new PatientsDirectory();
         providerDirectory = new ProviderDirectory();
         payerDirectory = new PayersDirectory();
         counsellorDirectory = new CounsellorDirectory();
         donorDirectory = new DonorsDirectory();
         volunteerDirectory = new VolunteerDirectory();
         serviceDirectory = new ServicesDirectory();
         diagnosisDirectory = new DiagnosisDirectory();
         donationDirectory = new DonationDirectory();
         vitalSignsDirectory = new VitalSignsDirectory();
         alertsDirectory = new AlertsDirectory();
    }

    public ProviderDirectory getProviderDirectory() {
        return providerDirectory;
    }

    public void setProviderDirectory(ProviderDirectory providerDirectory) {
        this.providerDirectory = providerDirectory;
    }
    

    public NursesDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NursesDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public PatientsDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientsDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public HospiceDirectory getHospiceDirectory() {
        return hospiceDirectory;
    }

    public void setHospiceDirectory(HospiceDirectory hospiceDirectory) {
        this.hospiceDirectory = hospiceDirectory;
    }

    public PayersDirectory getPayerDirectory() {
        return payerDirectory;
    }

    public void setPayerDirectory(PayersDirectory payerDirectory) {
        this.payerDirectory = payerDirectory;
    }

    public CounsellorDirectory getCounsellorDirectory() {
        return counsellorDirectory;
    }

    public void setCounsellorDirectory(CounsellorDirectory counsellorDirectory) {
        this.counsellorDirectory = counsellorDirectory;
    }

    public DonorsDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorsDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public VolunteerDirectory getVolunteerDirectory() {
        return volunteerDirectory;
    }

    public void setVolunteerDirectory(VolunteerDirectory volunteerDirectory) {
        this.volunteerDirectory = volunteerDirectory;
    }

    public ServicesDirectory getServiceDirectory() {
        return serviceDirectory;
    }

    public void setServiceDirectory(ServicesDirectory serviceDirectory) {
        this.serviceDirectory = serviceDirectory;
    }

    public DiagnosisDirectory getDiagnosisDirectory() {
        return diagnosisDirectory;
    }

    public void setDiagnosisDirectory(DiagnosisDirectory diagnosisDirectory) {
        this.diagnosisDirectory = diagnosisDirectory;
    }

    public DonationDirectory getDonationDirectory() {
        return donationDirectory;
    }

    public void setDonationDirectory(DonationDirectory donationDirectory) {
        this.donationDirectory = donationDirectory;
    }

    public VitalSignsDirectory getVitalSignsDirectory() {
        return vitalSignsDirectory;
    }

    public void setVitalSignsDirectory(VitalSignsDirectory vitalSignsDirectory) {
        this.vitalSignsDirectory = vitalSignsDirectory;
    }

    public AlertsDirectory getAlertsDirectory() {
        return alertsDirectory;
    }

    public void setAlertsDirectory(AlertsDirectory alertsDirectory) {
        this.alertsDirectory = alertsDirectory;
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }  
}
