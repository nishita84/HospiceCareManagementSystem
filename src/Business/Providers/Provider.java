/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Providers;

import Business.Hospice.Hospice;
import java.util.ArrayList;
import Business.Patients.Patient;
import Business.Services.Service;

/**
 *
 * @author architnigam
 */
public class Provider {
    private String providerNPI;
    private String providerName;
    private String providerAddress;
    private String providerState;
    private String providerCity;
    private String providerCountry;
    private String zipCode;
    private String providerEmailID;
    private String providerContactNumber;
    private Hospice operatingProvider;
    private ArrayList<Patient> patientsRegisteredWithProvider;
    private ArrayList<Service> listOfServicesProvided;

    public String getProviderNPI() {
        return providerNPI;
    }

    public void setProviderNPI(String providerNPI) {
        this.providerNPI = providerNPI;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderState() {
        return providerState;
    }

    public void setProviderState(String providerState) {
        this.providerState = providerState;
    }

    public String getProviderCity() {
        return providerCity;
    }

    public void setProviderCity(String providerCity) {
        this.providerCity = providerCity;
    }

    public String getProviderCountry() {
        return providerCountry;
    }

    public void setProviderCountry(String providerCountry) {
        this.providerCountry = providerCountry;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getProviderEmailID() {
        return providerEmailID;
    }

    public void setProviderEmailID(String providerEmailID) {
        this.providerEmailID = providerEmailID;
    }

    public String getProviderContactNumber() {
        return providerContactNumber;
    }

    public void setProviderContactNumber(String providerContactNumber) {
        this.providerContactNumber = providerContactNumber;
    }

    public ArrayList<Patient> getPatientsRegisteredWithProvider() {
        return patientsRegisteredWithProvider;
    }

    public void setPatientsRegisteredWithProvider(ArrayList<Patient> patientsRegisteredWithProvider) {
        this.patientsRegisteredWithProvider = patientsRegisteredWithProvider;
    }

    public ArrayList<Service> getListOfServicesProvided() {
        return listOfServicesProvided;
    }

    public void setListOfServicesProvided(ArrayList<Service> listOfServicesProvided) {
        this.listOfServicesProvided = listOfServicesProvided;
    }

    public Hospice getOperatingProvider() {
        return operatingProvider;
    }

    public void setOperatingProvider(Hospice operatingProvider) {
        this.operatingProvider = operatingProvider;
    }
    
}
