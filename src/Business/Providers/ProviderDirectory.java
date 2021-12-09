/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Providers;

import Business.EcoSystem;
import Business.Hospice.Hospice;
import Business.Patients.Patient;
import Business.Services.Service;
import Business.SetIDsForEnterprises;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class ProviderDirectory {
    private ArrayList<Service> listOfServicesUnderProviders;
    private ArrayList<Patient> listOFPatientsUnderProvider;
    private ArrayList<Provider> listOfProviders;
    EcoSystem system;
    
    public ProviderDirectory()
    {
        this.system = system;
        listOfServicesUnderProviders = new ArrayList<Service>();
        listOFPatientsUnderProvider = new ArrayList<Patient>();
        listOfProviders = new ArrayList<Provider>();
    }
    
    public ArrayList<Provider> getProviderList() {
        return listOfProviders;
    }

    public void setProviderList(ArrayList<Provider> listOfProviders) {
        this.listOfProviders = listOfProviders;
    }
    
     public Provider createProvider(String NPI, String providerName, String providerAddress, String providerCity, String providerState, 
             String providerZipCode, String providerCountry, String providerContactNo, String emailID, 
             Hospice hospice) {

            Provider newprovider = new Provider();
            newprovider.setProviderNPI(NPI);
            newprovider.setProviderName(providerName);
            newprovider.setProviderAddress(providerAddress);
            newprovider.setProviderCity(providerCity);
            newprovider.setProviderState(providerState);
            newprovider.setProviderCountry(providerCountry);
            newprovider.setZipCode(providerZipCode);
            newprovider.setProviderContactNumber(providerContactNo);
            newprovider.setProviderEmailID(emailID);
            newprovider.setPatientsRegisteredWithProvider(listOFPatientsUnderProvider);
            newprovider.setListOfServicesProvided(listOfServicesUnderProviders);
            newprovider.setOperatingHospice(hospice);
            listOfProviders.add(newprovider);
            return newprovider;
    }
    
    public Provider updateProvider(Provider selectedProvider)
    {
        listOfProviders.set(listOfProviders.indexOf(selectedProvider), selectedProvider);
        return selectedProvider;
    }
    
    public void deleteProvider(int indexOfSelectedRecord)
    {
        listOfProviders.remove(indexOfSelectedRecord);
    }
    
    public Provider findProviderByNPI(String providerNPI, ArrayList<Provider> listOfProviders)
    {
        for(Provider provider: listOfProviders)
        {
            if(provider.getProviderNPI().equals(providerNPI))
            {
                return provider;
            }
        }
        return null;
    }
    
    public Provider findProviderByEmailID(String providerEmailID, ArrayList<Provider> listOfProviders)
    {
        for(Provider provider: listOfProviders)
        {
            if(provider.getProviderEmailID().equals(providerEmailID))
            {
                return provider;
            }
        }
        return null;
    }
    
}
