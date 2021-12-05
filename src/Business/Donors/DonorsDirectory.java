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

    
    public Donor createNewDonor(String donorID, String donorName, String donatorEmailID)
    {
        SetIDsForEnterprises setIDForEnterprises = new SetIDsForEnterprises();
        Donor newDonor = new Donor();
        newDonor.setDonorID(donorID);
        newDonor.setDonorName(donorName);
        newDonor.setDonorEmailID(donatorEmailID);
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
    
    public Donor findDonorByID(String donorID, ArrayList<Donor> listOfDonors)
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
    
    public Donor findDonorByEmailID(String emailID, ArrayList<Donor> listOfDonors)
    {
        for(Donor donor: listOfDonors)
        {
            if(donor.getDonorEmailID().equals(emailID))
            {
                return donor;
            }
        }
        return null;
    }
    
    public Donor findDonorByName(String nameOfDonor, ArrayList<Donor> listOfDonors)
    {
        for(Donor donor: listOfDonors)
        {
            if(donor.getDonorName().equals(nameOfDonor))
            {
                return donor;
            }
        }
        return null;
    }
}
