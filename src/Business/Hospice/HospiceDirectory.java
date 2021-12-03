/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospice;

import Business.Counsellors.Counsellor;
import Business.Donors.Donor;
import Business.Nurses.Nurse;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.SetIDsForEnterprises;
import Business.Volunteers.Volunteer;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class HospiceDirectory {
    private ArrayList<Hospice> hospiceList;
    ArrayList<Patient> registeredPatientsInHospice;
    ArrayList<Provider> registeredProvidersInHospice;
    ArrayList<Nurse> registeredNursesInHospice;
    ArrayList<Counsellor> registeredCounsellorsInHospice;
    ArrayList<Volunteer> registeredVolunteersInHospice;
    ArrayList<Donor> registeredDonorsInHospice;
    
    public HospiceDirectory()
    {
        hospiceList = new ArrayList<Hospice>();
        registeredPatientsInHospice = new ArrayList<Patient>();
        registeredProvidersInHospice = new ArrayList<Provider>();
        registeredNursesInHospice = new ArrayList<Nurse>();
        registeredCounsellorsInHospice = new ArrayList<Counsellor>();
        registeredVolunteersInHospice = new ArrayList<Volunteer>();
        registeredDonorsInHospice = new ArrayList<Donor>();
    }

    public ArrayList<Hospice> getListOfHospice() {
        return hospiceList;
    }

    public void setListOfHospice(ArrayList<Hospice> hospiceList) {
        this.hospiceList = hospiceList;
    }

    
    public Hospice createNewHospice(String hospiceID, String hospiceName, String hospiceAddress, String hospiceCity, String hospiceState, 
            String hospiceCountry, String hospiceContactNumber, String hospiceEmailID, String hospiceZipCode)
    {
        
        Hospice newHospice = new Hospice();
        newHospice.setHospiceID(hospiceID);
        newHospice.setHospiceName(hospiceName);
        newHospice.setHospiceAddress(hospiceAddress);
        newHospice.setHospiceCity(hospiceCity);
        newHospice.setHospiceState(hospiceState);
        newHospice.setHospiceCountry(hospiceCountry);
        newHospice.setHospiceZipCode(hospiceZipCode);
        newHospice.setHospiceEmailID(hospiceEmailID);
        newHospice.setHospiceContactNumber(hospiceContactNumber);
        newHospice.setTotalHospiceBalance(0.00);
        newHospice.setRegisteredProvidersInHospice(registeredProvidersInHospice);
        newHospice.setRegisteredNursesInHospice(registeredNursesInHospice);
        newHospice.setRegisteredPatientsInHospice(registeredPatientsInHospice);
        newHospice.setRegisteredVolunteersInHospice(registeredVolunteersInHospice);
        newHospice.setRegisteredCounsellorsInHospice(registeredCounsellorsInHospice);
        newHospice.setRegisteredDonorsInHospice(registeredDonorsInHospice);
        hospiceList.add(newHospice);
        return newHospice;
    }
    
    public Hospice updateHospice(Hospice selectedHospice)
    {
        hospiceList.set(hospiceList.indexOf(selectedHospice), selectedHospice);
        return selectedHospice;
    }
    
    public void deleteHospice(int indexOfSelectedRecord)
    {
        hospiceList.remove(indexOfSelectedRecord);
    }
    
    public Hospice findHospiceByID(String hospiceID, ArrayList<Hospice> listOfHospices)
    {
        for(Hospice hospice: hospiceList)
        {
            if(hospice.getHospiceID().equals(hospiceID))
            {
                return hospice;
            }
        }
        return null;
    }

}
