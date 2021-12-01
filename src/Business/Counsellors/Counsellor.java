/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Counsellors;

import Business.Patients.Patient;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Counsellor {
    private String counsellorID;
    private String counsellorName;
    private String counsellorAddress;
    private String counsellorCity;
    private String counsellorState;
    private String counsellorZipCode;
    private String counsellorCountry;
    private ArrayList<Patient> patientsAssignedToCounsellor;

    public String getCounsellorID() {
        return counsellorID;
    }

    public void setCounsellorID(String counsellorID) {
        this.counsellorID = counsellorID;
    }

    public String getCounsellorName() {
        return counsellorName;
    }

    public void setCounsellorName(String counsellorName) {
        this.counsellorName = counsellorName;
    }

    public String getCounsellorAddress() {
        return counsellorAddress;
    }

    public void setCounsellorAddress(String counsellorAddress) {
        this.counsellorAddress = counsellorAddress;
    }

    public String getCounsellorCity() {
        return counsellorCity;
    }

    public void setCounsellorCity(String counsellorCity) {
        this.counsellorCity = counsellorCity;
    }

    public String getCounsellorState() {
        return counsellorState;
    }

    public void setCounsellorState(String counsellorState) {
        this.counsellorState = counsellorState;
    }

    public String getCounsellorZipCode() {
        return counsellorZipCode;
    }

    public void setCounsellorZipCode(String counsellorZipCode) {
        this.counsellorZipCode = counsellorZipCode;
    }

    public String getCounsellorCountry() {
        return counsellorCountry;
    }

    public void setCounsellorCountry(String counsellorCountry) {
        this.counsellorCountry = counsellorCountry;
    }

    public ArrayList<Patient> getPatientsAssignedToCounsellor() {
        return patientsAssignedToCounsellor;
    }

    public void setPatientsAssignedToCounsellor(ArrayList<Patient> patientsAssignedToCounsellor) {
        this.patientsAssignedToCounsellor = patientsAssignedToCounsellor;
    }
    
    
    
}
