/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Linkage;

import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class LinkageDirectory {
    private ArrayList<Linkage> listOfLinkageIDs;
    
    public LinkageDirectory()
    {
        listOfLinkageIDs = new ArrayList<Linkage>();
    }

    public ArrayList<Linkage> getListOfLinkageIDs() {
        return listOfLinkageIDs;
    }

    public void setListOfLinkageIDs(ArrayList<Linkage> listOfLinkageIDs) {
        this.listOfLinkageIDs = listOfLinkageIDs;
    }
    
    public Linkage createNewLinkage(String linkageID, Patient patient, Provider provider)
    {
        Linkage newLinkage = new Linkage();
        newLinkage.setLinkageID(linkageID);
        newLinkage.setPatient(patient);
        newLinkage.setProvider(provider);
        listOfLinkageIDs.add(newLinkage);
        return newLinkage;
    }
}
