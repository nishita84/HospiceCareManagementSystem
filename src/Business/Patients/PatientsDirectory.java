/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;

import Business.EcoSystem;
import Business.Nurses.Nurse;
import Business.Providers.Provider;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class PatientsDirectory {
    private ArrayList<Patient> listOfPatients;
    EcoSystem system;
    
    public PatientsDirectory()
    {
        this.system = system;
    }
    
    public ArrayList<Patient> getPatientList() {
        return listOfPatients;
    }

    public void setNurseList(ArrayList<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }
    
     public Patient createPatient(String patientMRN, String patientsName, String patientsAddress, String patientsCity, String patientsState, 
             String patientsZipCode, String patientsCountry, String patientsContactNo, String patientsEmailID, Provider registeredProvider, 
             String terminalIllnessAssociatedWithPatient) {

            Patient pn = new Patient();
            pn.setPatientMRN(Integer.parseInt(patientMRN));
            pn.setPatientName(patientsName);
            pn.setPatientAddress(patientsAddress);
            pn.setPatientCity(patientsCity);
            pn.setPatientCountry(patientsCountry);
            pn.setPatientContactNumber(patientsContactNo);
            pn.setPatientEmailID(patientsEmailID);
            pn.setPatientZipCode(patientsZipCode);
            pn.setRegisteredProvider(registeredProvider);
            pn.setBalanceAllocatedToPatient(1000);
            pn.setTerminalIllnessAssociated(terminalIllnessAssociatedWithPatient);
            listOfPatients.add(pn);
            return pn;
    }
    
    public Patient updatePatient(Patient selectedNurse)
    {
        listOfPatients.set(listOfPatients.indexOf(selectedNurse), selectedNurse);
        return selectedNurse;
    }
    
    public void deletePatient(int indexOfSelectedRecord)
    {
        listOfPatients.remove(indexOfSelectedRecord);
    }
    
    public Patient findPatientByMRN(int patientMRN, ArrayList<Patient> listOfPatients)
    {
        for(Patient patient: listOfPatients)
        {
            if(patient.getPatientMRN()== patientMRN)
            {
                return patient;
            }
        }
        return null;
    }
    
}
