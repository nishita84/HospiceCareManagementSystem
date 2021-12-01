/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurses;

import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Nurse {
    private String nurseID;
    private String nurseName;
    private String nurseAddress;
    private String nurseCity;
    private String nurseState;
    private String nurseZipCode;
    private String nurseCountry;
    private String nurseContactNumber;
    private String nurseEmailID;
    ArrayList<Patient> patientsAssigned;
    Provider reportingProvider;

    public String getNurseID() {
        return nurseID;
    }

    public void setNurseID(String nurseID) {
        this.nurseID = nurseID;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getNurseAddress() {
        return nurseAddress;
    }

    public void setNurseAddress(String nurseAddress) {
        this.nurseAddress = nurseAddress;
    }

    public String getNurseCity() {
        return nurseCity;
    }

    public void setNurseCity(String nurseCity) {
        this.nurseCity = nurseCity;
    }

    public String getNurseState() {
        return nurseState;
    }

    public void setNurseState(String nurseState) {
        this.nurseState = nurseState;
    }

    public String getNurseZipCode() {
        return nurseZipCode;
    }

    public void setNurseZipCode(String nurseZipCode) {
        this.nurseZipCode = nurseZipCode;
    }

    public String getNurseCountry() {
        return nurseCountry;
    }

    public void setNurseCountry(String nurseCountry) {
        this.nurseCountry = nurseCountry;
    }

    public String getNurseContactNumber() {
        return nurseContactNumber;
    }

    public void setNurseContactNumber(String nurseContactNumber) {
        this.nurseContactNumber = nurseContactNumber;
    }

    public ArrayList<Patient> getPatientsAssigned() {
        return patientsAssigned;
    }

    public void setPatientsAssigned(ArrayList<Patient> patientsAssigned) {
        this.patientsAssigned = patientsAssigned;
    }

    public Provider getReportingProvider() {
        return reportingProvider;
    }

    public void setReportingProvider(Provider reportingProvider) {
        this.reportingProvider = reportingProvider;
    }

    public String getNurseEmailID() {
        return nurseEmailID;
    }

    public void setNurseEmailID(String nurseEmailID) {
        this.nurseEmailID = nurseEmailID;
    }
    
}
