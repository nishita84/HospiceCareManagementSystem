/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;
import Business.Hospice.Hospice;
import Business.Payers.Payer;
import Business.Providers.Provider;
import java.util.Date;
/**
 *
 * @author architnigam
 */

public class Patient {
    private String patientMRN;
    private String patientName;
    private String patientAddress;
    private String patientCity;
    private String gender;
    private String ethincity;
    private String patientState;
    private String patientZipCode;
    private String patientCountry;
    private String patientContactNumber;
    private String patientEmailID;
    private Date dateOfBirth;
    Provider registeredProvider; // dropdown
    Payer registeredPayer; //dropdown
    private boolean isPatientAnInPatient; // Checkbox
    private Date admissionDatetime; 
    private Date admissionDischargeTime;
    private double balanceAllocatedToPatient;
    private String terminalIllnessAssociated; // Dropdown
    private Hospice operatingHospice;
    private String emergencyContactName;
    private String emergencyEmailID;
    private int covidExposureLevels;

    public String getPatientMRN() {
        return patientMRN;
    }

    public void setPatientMRN(String patientMRN) {
        this.patientMRN = patientMRN;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public String getPatientState() {
        return patientState;
    }

    public void setPatientState(String patientState) {
        this.patientState = patientState;
    }

    public String getPatientZipCode() {
        return patientZipCode;
    }

    public void setPatientZipCode(String patientZipCode) {
        this.patientZipCode = patientZipCode;
    }

    public String getPatientCountry() {
        return patientCountry;
    }

    public void setPatientCountry(String patientCountry) {
        this.patientCountry = patientCountry;
    }

    public String getPatientContactNumber() {
        return patientContactNumber;
    }

    public void setPatientContactNumber(String patientContactNumber) {
        this.patientContactNumber = patientContactNumber;
    }

    public String getPatientEmailID() {
        return patientEmailID;
    }

    public void setPatientEmailID(String patientEmailID) {
        this.patientEmailID = patientEmailID;
    }

    public Provider getRegisteredProvider() {
        return registeredProvider;
    }

    public void setRegisteredProvider(Provider registeredProvider) {
        this.registeredProvider = registeredProvider;
    }

    public Payer getRegisteredPayer() {
        return registeredPayer;
    }

    public void setRegisteredPayer(Payer registeredPayer) {
        this.registeredPayer = registeredPayer;
    }

    public double getBalanceAllocatedToPatient() {
        return balanceAllocatedToPatient;
    }

    public void setBalanceAllocatedToPatient(double balanceAllocatedToPatient) {
        this.balanceAllocatedToPatient = balanceAllocatedToPatient;
    }

    public String getTermonalIllnessAssociated() {
        return terminalIllnessAssociated;
    }

    public void setTerminalIllnessAssociated(String terminalIllnessAssociated) {
        this.terminalIllnessAssociated = terminalIllnessAssociated;
    }  

    public boolean isIsPatientAnInPatient() {
        return isPatientAnInPatient;
    }

    public void setIsPatientAnInPatient(boolean isPatientAnInPatient) {
        this.isPatientAnInPatient = isPatientAnInPatient;
    }

    public Date getAdmissionDatetime() {
        return admissionDatetime;
    }

    public void setAdmissionDatetime(Date admissionDatetime) {
        this.admissionDatetime = admissionDatetime;
    }

    public Date getAdmissionDischargeTime() {
        return admissionDischargeTime;
    }

    public void setAdmissionDischargeTime(Date admissionDischargeTime) {
        this.admissionDischargeTime = admissionDischargeTime;
    }

    public Hospice getOperatingHospice() {
        return operatingHospice;
    }

    public void setOperatingHospice(Hospice operatingHospice) {
        this.operatingHospice = operatingHospice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthincity() {
        return ethincity;
    }

    public void setEthincity(String ethincity) {
        this.ethincity = ethincity;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyEmailID() {
        return emergencyEmailID;
    }

    public void setEmergencyEmailID(String emergencyEmailIDs) {
        this.emergencyEmailID = emergencyEmailIDs;
    }

    public int getCovidExposureLevels() {
        return covidExposureLevels;
    }

    public void setCovidExposureLevels(int covidExposureLevels) {
        this.covidExposureLevels = covidExposureLevels;
    }
    
    
}
