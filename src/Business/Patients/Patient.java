/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;
import Business.Payers.Payer;
import Business.Providers.Provider;
/**
 *
 * @author architnigam
 */

public class Patient {
    private int patientMRN;
    private String patientName;
    private String patientAddress;
    private String patientCity;
    private String patientState;
    private String patientZipCode;
    private String patientCountry;
    private String patientContactNumber;
    private String patientEmailID;
    Provider registeredProvider;
    Payer registeredPayer;
    private double balanceAllocatedToPatient;
    private String terminalIllnessAssociated;

    public int getPatientMRN() {
        return patientMRN;
    }

    public void setPatientMRN(int patientMRN) {
        this.patientMRN = patientMRN;
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
}
