/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author architnigam
 */
public class SetIDsForWorkflows {
    private final String codeForDonation = "DON";
    private final String codeForAlert = "AL";
    private final String codeForAppointment = "AP";
    private final String codeForLinkage = "LN";
    private final String codeForClaims = "CL";
    private final String codeForAudit = "AD";
    
    private final int min = 1000;
    private final int max = 9999;
    
    public String SetIDForDonation()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForDonation = codeForDonation + String.valueOf(random_int);
        return idForDonation;
    }
    public String SetIDForAlert()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForAlert = codeForAlert + String.valueOf(random_int);
        return idForAlert;
    }
    public String SetIDForAppointment()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForAppointment = codeForAppointment + String.valueOf(random_int);
        return idForAppointment;
    }
    public String SetIDForLinkage()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForLinkage = codeForLinkage + String.valueOf(random_int);
        return idForLinkage;
    }
    public String SetIDForClaims()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForClaim= codeForClaims + String.valueOf(random_int);
        return idForClaim;
    }
    public String SetIDForAudits()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForClaim= codeForAudit + String.valueOf(random_int);
        return idForClaim;
    }
}
