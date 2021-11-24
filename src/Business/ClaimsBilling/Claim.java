/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClaimsBilling;

import Business.Hospice.Hospice;
import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class Claim {
    private int claimID;
    private String claimType;
    private Date claimSubmissionTime;
    private Date claimApprovalTime;
    private int claimStatus;
    private Patient patient;
    private Provider provider;
    private Hospice hospice;
    // Add diagnosis
    // Add Payer
    private Date claimStartDate;
    private Date claimEndDate;
    private int units;
    private double claimAmount;
    private double adjudicatedAmount;
    private int placeOfService;

    public int getClaimID() {
        return claimID;
    }

    public void setClaimID(int claimID) {
        this.claimID = claimID;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Date getClaimSubmissionTime() {
        return claimSubmissionTime;
    }

    public void setClaimSubmissionTime(Date claimSubmissionTime) {
        this.claimSubmissionTime = claimSubmissionTime;
    }

    public Date getClaimApprovalTime() {
        return claimApprovalTime;
    }

    public void setClaimApprovalTime(Date claimApprovalTime) {
        this.claimApprovalTime = claimApprovalTime;
    }

    public int getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(int claimStatus) {
        this.claimStatus = claimStatus;
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

    public Hospice getHospice() {
        return hospice;
    }

    public void setHospice(Hospice hospice) {
        this.hospice = hospice;
    }

    public Date getClaimStartDate() {
        return claimStartDate;
    }

    public void setClaimStartDate(Date claimStartDate) {
        this.claimStartDate = claimStartDate;
    }

    public Date getClaimEndDate() {
        return claimEndDate;
    }

    public void setClaimEndDate(Date claimEndDate) {
        this.claimEndDate = claimEndDate;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public double getAdjudicatedAmount() {
        return adjudicatedAmount;
    }

    public void setAdjudicatedAmount(double adjudicatedAmount) {
        this.adjudicatedAmount = adjudicatedAmount;
    }

    public int getPlaceOfService() {
        return placeOfService;
    }

    public void setPlaceOfService(int placeOfService) {
        this.placeOfService = placeOfService;
    }
    
    
    
}
