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
    Patient linkedPatient;
    Provider linkedProvider;

    public String getLinkageID() {
        return linkageID;
    }

    public void setLinkageID(String linkageID) {
        this.linkageID = linkageID;
    }

    public Patient getLinkedPatient() {
        return linkedPatient;
    }

    public void setLinkedPatient(Patient linkedPatient) {
        this.linkedPatient = linkedPatient;
    }

    public Provider getLinkedProvider() {
        return linkedProvider;
    }

    public void setLinkedProvider(Provider linkedProvider) {
        this.linkedProvider = linkedProvider;
    }
    
    
}
