/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import Business.Donors.Donor;
import Business.Hospice.Hospice;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class DonationDirectory {
    private ArrayList<Donation> listOfDonations;
    
    public DonationDirectory()
    {
        listOfDonations = new ArrayList<Donation>();
    }

    public ArrayList<Donation> getDonationList() {
        return listOfDonations;
    }

    public void setDiagnosisList(ArrayList<Donation> listOfDonations) {
        this.listOfDonations = listOfDonations;
    }
    
     public Donation createNewDonation(String donationID, Donor donor, 
             double donationAmount, Hospice donationHospice)
    {
        Donation newDonation = new Donation();
        newDonation.setDonationID(donationID);
        newDonation.setDonor(donor);
        newDonation.setDonationAmount(donationAmount);
        newDonation.setHospiceToWhichAmountIsDonated(donationHospice);
        newDonation.setDateOfDonation(new Date());
        listOfDonations.add(newDonation);
        
        return newDonation;
    }
     
}
