/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Linkage;

import Business.Patients.Patient;
import Business.Providers.Provider;

/**
 *
 * @author architnigam
 */
public class Linkage {
    private String linkageID;
    Patient patient;
    Provider provider;

    public String getLinkageID() {
        return linkageID;
    }

    public void setLinkageID(String linkageID) {
        this.linkageID = linkageID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
