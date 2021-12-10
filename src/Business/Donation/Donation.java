/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import Business.Donors.Donor;
import Business.Hospice.Hospice;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class Donation {
    private String donationID;
    private Donor donor;
    private double donationAmount;
    private Hospice hospiceToWhichAmountIsDonated;
    private Date dateOfDonation;

    public Donor getDonor() {
        return donor;
    }

    public String getDonationID() {
        return donationID;
    }

    public void setDonationID(String donationID) {
        this.donationID = donationID;
    }
    

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public Hospice getHospiceToWhichAmountIsDonated() {
        return hospiceToWhichAmountIsDonated;
    }

    public void setHospiceToWhichAmountIsDonated(Hospice hospiceToWhichAmountIsDonated) {
        this.hospiceToWhichAmountIsDonated = hospiceToWhichAmountIsDonated;
    }

    public Date getDateOfDonation() {
        return dateOfDonation;
    }

    public void setDateOfDonation(Date dateOfDonation) {
        this.dateOfDonation = dateOfDonation;
    }

}
