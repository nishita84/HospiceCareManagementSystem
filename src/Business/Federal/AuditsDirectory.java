/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Federal;

import Business.ClaimsBilling.Claim;
import Business.Donation.Donation;
import Business.SetIDsForWorkflows;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class AuditsDirectory {
    private ArrayList<Audit> listOfAudits;
    
    public AuditsDirectory()
    {
       listOfAudits = new ArrayList<Audit>();
    }

    public ArrayList<Audit> getListOfAudits() {
        return listOfAudits;
    }

    public void setListOfAudits(ArrayList<Audit> listOfAudits) {
        this.listOfAudits = listOfAudits;
    }
    
    public Audit createNewAuditEntryForClaimCreation(Claim createdClaim)
    {
        SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
        Audit newAuditEntry = new Audit();
        newAuditEntry.setAuditID(setIDForWorkflows.SetIDForAudits());
        newAuditEntry.setTransactionType("C");
        newAuditEntry.setPatient(createdClaim.getPatient());
        newAuditEntry.setPayer(createdClaim.getPayerForClaim());
        newAuditEntry.setProvider(createdClaim.getProvider());
        newAuditEntry.setHospice(createdClaim.getHospice());
        newAuditEntry.setTimeOfTransaction(createdClaim.getClaimSubmissionTime());
        newAuditEntry.setBeforeBalance(0.00);
        newAuditEntry.setAfterBalance(createdClaim.getClaimAmount());
        newAuditEntry.setComments("Claim created for patient with claim amount :$ "+createdClaim.getClaimAmount());
        listOfAudits.add(newAuditEntry);
        return newAuditEntry;
    }
    
    public Audit createNewAuditEntryForAdjudication(Claim adjudicatedClaim)
    {
        SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
        Audit newAuditEntry = new Audit();
        newAuditEntry.setAuditID(setIDForWorkflows.SetIDForAudits());
        newAuditEntry.setTransactionType("A");
        newAuditEntry.setPatient(adjudicatedClaim.getPatient());
        newAuditEntry.setPayer(adjudicatedClaim.getPayerForClaim());
        newAuditEntry.setProvider(adjudicatedClaim.getProvider());
        newAuditEntry.setHospice(adjudicatedClaim.getHospice());
        newAuditEntry.setTimeOfTransaction(adjudicatedClaim.getClaimAdjudicationTime());
        newAuditEntry.setBeforeBalance(adjudicatedClaim.getClaimAmount());
        newAuditEntry.setAfterBalance(adjudicatedClaim.getAdjudicatedAmount());
        newAuditEntry.setComments("Claim adjudicated for patient with adjudication amount :$ "+adjudicatedClaim.getAdjudicatedAmount());
        listOfAudits.add(newAuditEntry);
        return newAuditEntry;
    }
    
    public Audit createNewAuditEntryForExternalDonation(Donation donation, double beforeBalance, double afterBalance)
    {
         SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
         Audit newAuditEntry = new Audit();
         newAuditEntry.setAuditID(setIDForWorkflows.SetIDForAudits());
         newAuditEntry.setTransactionType("D");
         newAuditEntry.setBeforeBalance(beforeBalance);
         newAuditEntry.setAfterBalance(afterBalance);
         newAuditEntry.setHospice(donation.getHospiceToWhichAmountIsDonated());
         newAuditEntry.setComments(donation.getDonor().getDonorName()+" contributed to $ "+donation.getDonationAmount()+""
                 + " to "+donation.getHospiceToWhichAmountIsDonated().getHospiceName());
         listOfAudits.add(newAuditEntry);
         return newAuditEntry;
    }
    
    public Audit createNewAuditEntryForFederalPatient(Donation donation, double beforeBalance, double afterBalance)
    {
         SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
         Audit newAuditEntry = new Audit();
         newAuditEntry.setAuditID(setIDForWorkflows.SetIDForAudits());
         newAuditEntry.setTransactionType("R");
         newAuditEntry.setBeforeBalance(beforeBalance);
         newAuditEntry.setAfterBalance(afterBalance);
         newAuditEntry.setHospice(donation.getHospiceToWhichAmountIsDonated());
         newAuditEntry.setComments(donation.getDonor().getDonorName()+" contributed to $ "+donation.getDonationAmount()+""
                 + " to "+donation.getHospiceToWhichAmountIsDonated().getHospiceName() +" on patient registration");
         listOfAudits.add(newAuditEntry);
         return newAuditEntry;
    }
}
