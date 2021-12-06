/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import Business.Hospice.Hospice;
import Business.Providers.Provider;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class VitalSignsDirectory {
    private ArrayList <VitalSigns> listOfVitalSigns;
    
    public VitalSignsDirectory()
    {
        this.listOfVitalSigns = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getListOfVitalSigns() {
        return listOfVitalSigns;
    }

    public void setListOfVitalSigns(ArrayList<VitalSigns> listOfVitalSigns) {
        this.listOfVitalSigns = listOfVitalSigns;
    }
    
     public VitalSigns createVitalSignsRecord() {

            VitalSigns newVitalSignsRecord = new VitalSigns();
            
            listOfVitalSigns.add(newVitalSignsRecord);
            return newVitalSignsRecord;
    }
}
