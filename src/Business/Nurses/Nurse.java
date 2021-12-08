/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurses;

import Business.Hospice.Hospice;
import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.ArrayList;
import java.util.Date;

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
    private Date dateOfBirth;
    private Hospice hospiceNurseWorksIn;
    Provider reportingProvider;
    private boolean isNurseOnDuty;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Hospice getHospiceNurseWorksIn() {
        return hospiceNurseWorksIn;
    }

    public void setHospiceNurseWorksIn(Hospice hospiceNurseWorksIn) {
        this.hospiceNurseWorksIn = hospiceNurseWorksIn;
    }

    public boolean isIsNurseOnDuty() {
        return isNurseOnDuty;
    }

    public void setIsNurseOnDuty(boolean isNurseOnDuty) {
        this.isNurseOnDuty = isNurseOnDuty;
    }
    
}
