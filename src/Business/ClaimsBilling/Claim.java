/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClaimsBilling;

import Business.Diagnosis.Diagnosis;
import Business.Hospice.Hospice;
import Business.Patients.Patient;
import Business.Payers.Payer;
import Business.Providers.Provider;
import Business.Services.Service;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class Claim {
    private String claimID;
    private String claimType;
    private String linkageID;
    private Date claimSubmissionTime;
    private Date claimAdjudicationTime;
    private int claimStatus;
    private Patient patient;
    private Provider provider;
    private Hospice hospice;
    private String claimDiagnosis;
    private Payer payerForClaim;
    private Date claimStartDate;
    private Date claimEndDate;
    private Service serviceUsed;
    private String claimBatchNumber;
    private int units;
    private double claimAmount;
    private double adjudicatedAmount;
    private String placeOfService;

    public String getClaimID() {
        return claimID;
    }

    public void setClaimID(String claimID) {
        this.claimID = claimID;
    }

    public String getLinkageID() {
        return linkageID;
    }

    public void setLinkageID(String linkageID) {
        this.linkageID = linkageID;
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

    public Date getClaimAdjudicationTime() {
        return claimAdjudicationTime;
    }

    public void setClaimAdjudicationTime(Date claimAdjudicationTime) {
        this.claimAdjudicationTime = claimAdjudicationTime;
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

    public String getPlaceOfService() {
        return placeOfService;
    }

    public void setPlaceOfService(String placeOfService) {
        this.placeOfService = placeOfService;
    }

    public String getDiagnosis() {
        return claimDiagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.claimDiagnosis = diagnosis;
    }

    public Payer getPayerForClaim() {
        return payerForClaim;
    }

    public void setPayerForClaim(Payer payerForClaim) {
        this.payerForClaim = payerForClaim;
    } 

    public Service getServiceUsed() {
        return serviceUsed;
    }

    public void setServiceUsed(Service serviceUsed) {
        this.serviceUsed = serviceUsed;
    }

    public String getClaimBatchNumber() {
        return claimBatchNumber;
    }

    public void setClaimBatchNumber(String claimBatchNumber) {
        this.claimBatchNumber = claimBatchNumber;
    }
    
    
}
