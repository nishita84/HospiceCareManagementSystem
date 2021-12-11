/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Agency;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class AgencyDirectory {
    private ArrayList<Agency> listOfAgencies;
    
    public AgencyDirectory()
    {
        listOfAgencies = new ArrayList<Agency>();
    }

    public ArrayList<Agency> getListOfAgencies() {
        return listOfAgencies;
    }

    public void setListOfAgencies(ArrayList<Agency> listOfAgencies) {
        this.listOfAgencies = listOfAgencies;
    }
    
    public Agency createNewAgency(String countryName, String agencyName, double amount)
    {
        Agency newAgency = new Agency();
        newAgency.setCountryName(countryName);
        newAgency.setAgencyName(agencyName);
        newAgency.setAmountForEveryPatientAdmitted(amount);
        listOfAgencies.add(newAgency);
        return newAgency;
    }
    
    public Agency findAgencyByCountryName(String countryName, ArrayList<Agency> listOfAgency)
    {
        for(Agency agency : listOfAgency)
        {
            
            if(agency.getCountryName().equals(countryName))
            {
                return agency;
            }
        }
        return null;
    }
}
