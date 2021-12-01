/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donors;

import Business.Providers.Provider;
import Business.SetIDsForEnterprises;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class DonorsDirectory {
    private ArrayList<Donor> listOfDonors;
    
    public DonorsDirectory()
    {
        listOfDonors = new ArrayList<Donor>();
    }

    public ArrayList<Donor> getListOfDonors() {
        return listOfDonors;
    }

    public void setListOfDonors(ArrayList<Donor> listOfDonors) {
        this.listOfDonors = listOfDonors;
    }

    
    public Donor createNewDonor(String donorName, double donorAmount)
    {
        SetIDsForEnterprises setIDForEnterprises = new SetIDsForEnterprises();
        Donor newDonor = new Donor();
        newDonor.setDonorID(setIDForEnterprises.SetIDForDonors());
        newDonor.setDonorName(donorName);
        newDonor.setDonorAmount(donorAmount);
        listOfDonors.add(newDonor);
        return newDonor;
    }
    
    public Donor updateCounsellor(Donor selectedDonor)
    {
        listOfDonors.set(listOfDonors.indexOf(selectedDonor), selectedDonor);
        return selectedDonor;
    }
    
    public void deleteCounsellor(int indexOfSelectedRecord)
    {
        listOfDonors.remove(indexOfSelectedRecord);
    }
    
    public Donor findDonorByID(String donorID, ArrayList<Provider> listOfProviders)
    {
        for(Donor donor: listOfDonors)
        {
            if(donor.getDonorID().equals(donorID))
            {
                return donor;
            }
        }
        return null;
    }
}
