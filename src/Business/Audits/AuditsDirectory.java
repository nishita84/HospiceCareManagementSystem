/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Audits;

import Business.Agency.Agency;
import Business.ClaimsBilling.Claim;
import Business.Donation.Donation;
import Business.Hospice.Hospice;
import Business.Patients.Patient;
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
        Hospice hospice = createdClaim.getProvider().getOperatingHospice();
        newAuditEntry.setTransactionType("C");
        newAuditEntry.setPatient(createdClaim.getPatient());
        newAuditEntry.setPayer(createdClaim.getPayerForClaim());
        newAuditEntry.setProvider(createdClaim.getProvider());
        newAuditEntry.setHospice(createdClaim.getHospice());
        newAuditEntry.setTimeOfTransaction(createdClaim.getClaimSubmissionTime());
        newAuditEntry.setBeforeBalance(hospice.getTotalHospiceBalance());
        newAuditEntry.setAfterBalance(hospice.getTotalHospiceBalance());
        newAuditEntry.setComments("Claim created for patient with claim amount :$ "+createdClaim.getClaimAmount());
        listOfAudits.add(newAuditEntry);
        return newAuditEntry;
    }
    
    public Audit createNewAuditEntryForAdjudication(Claim adjudicatedClaim)
    {
        SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
        Audit newAuditEntry = new Audit();
        Hospice hospice = adjudicatedClaim.getProvider().getOperatingHospice();
        newAuditEntry.setAuditID(setIDForWorkflows.SetIDForAudits());
        newAuditEntry.setTransactionType("A");
        newAuditEntry.setPatient(adjudicatedClaim.getPatient());
        newAuditEntry.setPayer(adjudicatedClaim.getPayerForClaim());
        newAuditEntry.setProvider(adjudicatedClaim.getProvider());
        newAuditEntry.setHospice(adjudicatedClaim.getHospice());
        newAuditEntry.setTimeOfTransaction(adjudicatedClaim.getClaimAdjudicationTime());
        newAuditEntry.setBeforeBalance(hospice.getTotalHospiceBalance() + adjudicatedClaim.getAdjudicatedAmount());
        newAuditEntry.setAfterBalance(hospice.getTotalHospiceBalance());
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
    
    public Audit createNewAuditEntryForFederalPatient(Agency agency, double beforeBalance, double afterBalance, Hospice hospice, Patient patient)
    {
         SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
         Audit newAuditEntry = new Audit();
         newAuditEntry.setAuditID(setIDForWorkflows.SetIDForAudits());
         newAuditEntry.setTransactionType("P");
         newAuditEntry.setBeforeBalance(beforeBalance);
         newAuditEntry.setAfterBalance(afterBalance);
         newAuditEntry.setTimeOfTransaction(patient.getAdmissionDatetime());
         newAuditEntry.setHospice(hospice);
         newAuditEntry.setComments(agency.getAgencyName()+" contributed to $ "+agency.getAmountForEveryPatientAdmitted()+""
                 + " to "+hospice.getHospiceName() +" on patient registration");
         listOfAudits.add(newAuditEntry);
         return newAuditEntry;
    }
    
    public Audit ReturnAuditRecordsDependingOnHospice(Hospice hospice, ArrayList<Audit> listOfAudits)
            
    {
        for(Audit audit : listOfAudits)
        {
            if(audit.getHospice().getHospiceID().equals(hospice.getHospiceID()))
            {
                return audit;
            }
        }
        return null;
    }
}
