/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospice;

import Business.Counsellors.Counsellor;
import Business.Donors.Donor;
import Business.Nurses.Nurse;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.Volunteers.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Hospice {
    private String hospiceID;
    private String hospiceUsername;
    private String hospiceName;
    private String hospiceAddress;
    private String hospiceCity;
    private String hospiceState;
    private String hospiceZipCode;
    private String hospiceCountry;
    private String hospiceContactNumber;
    private String hospiceEmailID;
    private double totalHospiceBalance;
    ArrayList<Patient> registeredPatientsInHospice;
    ArrayList<Provider> registeredProvidersInHospice;
    ArrayList<Nurse> registeredNursesInHospice;
    ArrayList<Counsellor> registeredCounsellorsInHospice;
    ArrayList<Volunteer> registeredVolunteersInHospice;
    ArrayList<Donor> registeredDonorsInHospice;

    public String getHospiceID() {
        return hospiceID;
    }

    public String getHospiceUsername() {
        return hospiceUsername;
    }

    public void setHospiceUsername(String hospiceUsername) {
        this.hospiceUsername = hospiceUsername;
    }
    
    public void setHospiceID(String hospiceID) {
        this.hospiceID = hospiceID;
    }
    
    public String getHospiceName() {
        return hospiceName;
    }

    public void setHospiceName(String hospiceName) {
        this.hospiceName = hospiceName;
    }

    public String getHospiceAddress() {
        return hospiceAddress;
    }

    public void setHospiceAddress(String hospiceAddress) {
        this.hospiceAddress = hospiceAddress;
    }

    public String getHospiceCity() {
        return hospiceCity;
    }

    public void setHospiceCity(String hospiceCity) {
        this.hospiceCity = hospiceCity;
    }

    public String getHospiceState() {
        return hospiceState;
    }

    public void setHospiceState(String hospiceState) {
        this.hospiceState = hospiceState;
    }

    public String getHospiceZipCode() {
        return hospiceZipCode;
    }

    public void setHospiceZipCode(String hospiceZipCode) {
        this.hospiceZipCode = hospiceZipCode;
    }

    public String getHospiceCountry() {
        return hospiceCountry;
    }

    public void setHospiceCountry(String hospiceCountry) {
        this.hospiceCountry = hospiceCountry;
    }

    public String getHospiceContactNumber() {
        return hospiceContactNumber;
    }

    public void setHospiceContactNumber(String hospiceContactNumber) {
        this.hospiceContactNumber = hospiceContactNumber;
    }

    public String getHospiceEmailID() {
        return hospiceEmailID;
    }

    public void setHospiceEmailID(String hospiceEmailID) {
        this.hospiceEmailID = hospiceEmailID;
    }

    public double getTotalHospiceBalance() {
        return totalHospiceBalance;
    }

    public void setTotalHospiceBalance(double totalHospiceBalance) {
        this.totalHospiceBalance = totalHospiceBalance;
    }

    public ArrayList<Patient> getRegisteredPatientsInHospice() {
        return registeredPatientsInHospice;
    }

    public void setRegisteredPatientsInHospice(ArrayList<Patient> registeredPatientsInHospice) {
        this.registeredPatientsInHospice = registeredPatientsInHospice;
    }

    public ArrayList<Provider> getRegisteredProvidersInHospice() {
        return registeredProvidersInHospice;
    }

    public void setRegisteredProvidersInHospice(ArrayList<Provider> registeredProvidersInHospice) {
        this.registeredProvidersInHospice = registeredProvidersInHospice;
    }

    public ArrayList<Nurse> getRegisteredNursesInHospice() {
        return registeredNursesInHospice;
    }

    public void setRegisteredNursesInHospice(ArrayList<Nurse> registeredNursesInHospice) {
        this.registeredNursesInHospice = registeredNursesInHospice;
    }

    public ArrayList<Counsellor> getRegisteredCounsellorsInHospice() {
        return registeredCounsellorsInHospice;
    }

    public void setRegisteredCounsellorsInHospice(ArrayList<Counsellor> registeredCounsellorsInHospice) {
        this.registeredCounsellorsInHospice = registeredCounsellorsInHospice;
    }

    public ArrayList<Volunteer> getRegisteredVolunteersInHospice() {
        return registeredVolunteersInHospice;
    }

    public void setRegisteredVolunteersInHospice(ArrayList<Volunteer> registeredVolunteersInHospice) {
        this.registeredVolunteersInHospice = registeredVolunteersInHospice;
    }

    public ArrayList<Donor> getRegisteredDonorsInHospice() {
        return registeredDonorsInHospice;
    }

    public void setRegisteredDonorsInHospice(ArrayList<Donor> registeredDonorsInHospice) {
        this.registeredDonorsInHospice = registeredDonorsInHospice;
    }
    
    
    
}
