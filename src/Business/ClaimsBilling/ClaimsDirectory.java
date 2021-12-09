/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ClaimsBilling;

import Business.Diagnosis.Diagnosis;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.Services.Service;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class ClaimsDirectory {
    private ArrayList<Claim> listOfClaims;
    
    public ClaimsDirectory()
    {
        listOfClaims = new ArrayList<Claim>();
    }

    public ArrayList<Claim> getListOfClaims() {
        return listOfClaims;
    }

    public void setListOfClaims(ArrayList<Claim> listOfClaims) {
        this.listOfClaims = listOfClaims;
    }
    
    public Claim createNewClaim(String claimID, String claimType, String linkageID,
            Date startDate, Date endDate, String claimDiagnosis,
            int units, double totalClaimAmount, String placeOfService, String claimBatchNumber, 
            Service selectedService, Patient claimPatient, Provider claimProvider)
    {
        Claim newClaim = new Claim();
        newClaim.setClaimID(claimID);
        newClaim.setClaimType(claimType);
        newClaim.setLinkageID(linkageID);
        newClaim.setClaimSubmissionTime(new Date());
        newClaim.setClaimStartDate(startDate);
        newClaim.setClaimEndDate(endDate);
        newClaim.setDiagnosis(claimDiagnosis);
        newClaim.setPlaceOfService(placeOfService);
        newClaim.setServiceUsed(selectedService);
        newClaim.setUnits(units);
        newClaim.setClaimAmount(totalClaimAmount);
        newClaim.setClaimStatus(0);
        newClaim.setPatient(claimPatient);
        newClaim.setProvider(claimProvider);
        newClaim.setClaimBatchNumber(claimBatchNumber);
        listOfClaims.add(newClaim);
        return newClaim;
    }
    
    public Claim updateClaim(Claim selectedClaim)
    {
        listOfClaims.set(listOfClaims.indexOf(selectedClaim), selectedClaim);
        return selectedClaim;
    }
    
    public Claim findClaimByID(String claimID, ArrayList<Claim> listOfClaims)
    {
        for(Claim claim : listOfClaims)
        {
            if(claim.getClaimID().equalsIgnoreCase(claimID))
            {
                return claim;
            }
        }
        return null;
    }
    
     public Claim findClaimByBatchNumber(String claimBatchNumber, ArrayList<Claim> listOfClaims)
    {
        for(Claim claim : listOfClaims)
        {
            if(claim.getClaimBatchNumber().equalsIgnoreCase(claimBatchNumber))
            {
                return claim;
            }
        }
        return null;
    }
}
