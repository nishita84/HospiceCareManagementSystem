/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Nurses;

import Business.EcoSystem;
import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class NursesDirectory {
    private ArrayList<Nurse> listOfNurses;  
    private ArrayList<Patient> patientsUnderNurse;  
    EcoSystem system;
    public NursesDirectory(){
        listOfNurses = new ArrayList();
        patientsUnderNurse = new ArrayList();
    }

    public ArrayList<Nurse> getNurseList() {
        return listOfNurses;
    }

    public void setNurseList(ArrayList<Nurse> listOfNurses) {
        this.listOfNurses = listOfNurses;
    }
    
     public Nurse createNurse(String nurseID, String nurseName, String nurseAddress, String nurseCity, String nurseState, 
             String nurseZipCode, String nurseCountry, String nurseContactNo, String nurseEmailID, Provider providerWhoNurseWorksFor, 
             Date dateOfBirth) {
            

            Nurse nurse = new Nurse();
            nurse.setNurseID(nurseID);
            nurse.setNurseName(nurseName);
            nurse.setNurseAddress(nurseAddress);
            nurse.setNurseCity(nurseCity);
            nurse.setNurseState(nurseState);
            nurse.setNurseZipCode(nurseZipCode);
            nurse.setNurseCountry(nurseCountry);
            nurse.setNurseContactNumber(nurseContactNo);
            nurse.setNurseEmailID(nurseEmailID);
            nurse.setReportingProvider(providerWhoNurseWorksFor);
            nurse.setPatientsAssigned(patientsUnderNurse);
            nurse.setDateOfBirth(dateOfBirth);
            listOfNurses.add(nurse);
            return nurse;
    }
    
    public Nurse updateNurse(Nurse selectedNurse)
    {
        listOfNurses.set(listOfNurses.indexOf(selectedNurse), selectedNurse);
        return selectedNurse;
    }
    
    public void deleteNurse(int indexOfSelectedRecord)
    {
        listOfNurses.remove(indexOfSelectedRecord);
    }
    
    public Nurse findNurseByID(String nurseID, ArrayList<Nurse> listOfNurses)
    {
        for(Nurse nurse: listOfNurses)
        {
            if(nurse.getNurseID().equals(nurseID))
            {
                return nurse;
            }
        }
        return null;
    }
}
