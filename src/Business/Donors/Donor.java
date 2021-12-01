/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donors;
//import Business.Hospice;
/**
 *
 * @author architnigam
 */
public class Donor {
    private String donorID;
    private String donorName;
    private double donorAmount;
    //Hospice hospiceToWhichAmountDonated;

    public String getDonorID() {
        return donorID;
    }

    public void setDonorID(String donorID) {
        this.donorID = donorID;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public Double getDonorAmount() {
        return donorAmount;
    }

    public void setDonorAmount(double donorAmount) {
        this.donorAmount = donorAmount;
    }
    
    
}
