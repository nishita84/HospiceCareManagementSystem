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



public class SetIDsForEnterprises {
    private final String codeForNurses = "NR";
    private final String codeForHospice = "HO";
    private final String codeForCounsellor = "CR";
    private final String codeForVisitors = "VT";
    private final String codeForVolunteers = "VL";
    private final String codeForDonors = "DN";
    private final int min = 1000;
    private final int max = 9999;

    public String SetIDForHospice()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForHospice = codeForHospice + String.valueOf(random_int);
        return idForHospice;
    }
    
    public String SetIDForNurse()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForNurse = codeForNurses + String.valueOf(random_int);
        return idForNurse;
    }
    
    public String SetIDForCounsellors()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForCounsellors = codeForCounsellor + String.valueOf(random_int);
        return idForCounsellors;
    }
    
    public String SetIDForVisitors()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForVisitors = codeForVisitors + String.valueOf(random_int);
        return idForVisitors;
    }
    
    public String SetIDForVolunteers()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForVolunteers = codeForVolunteers + String.valueOf(random_int);
        return idForVolunteers;
    }
    
    public String SetIDForDonors()
    {
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String idForProvider = codeForDonors + String.valueOf(random_int);
        return codeForDonors;
    }
    
}
