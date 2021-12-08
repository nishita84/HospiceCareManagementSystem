/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;

import Business.EcoSystem;
import Business.Hospice.Hospice;
import Business.Payers.Payer;
import Business.Providers.Provider;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class PatientsDirectory {
    private ArrayList<Patient> listOfPatients;
    
    public PatientsDirectory()
    {
        listOfPatients = new ArrayList<Patient>();
    }
    
    public ArrayList<Patient> getPatientList() {
        return listOfPatients;
    }

    public void setNurseList(ArrayList<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }
    
     public Patient createPatient(String patientMRN, String patientsName, String patientsAddress, String patientsCity, String patientsState, 
             String patientsZipCode, String patientsCountry, String patientsContactNo, String patientsEmailID, Provider registeredProvider, 
             Payer registeredPayer, String terminalIllnessAssociatedWithPatient,  Date dateOfBirth, 
             boolean isPatientAnInPatient, Hospice hospice) {

            Patient newPatient = new Patient();
            newPatient.setPatientMRN(patientMRN);
            newPatient.setPatientName(patientsName);
            newPatient.setPatientAddress(patientsAddress);
            newPatient.setPatientCity(patientsCity);
            newPatient.setPatientCountry(patientsCountry);
            newPatient.setPatientContactNumber(patientsContactNo);
            newPatient.setPatientEmailID(patientsEmailID);
            newPatient.setPatientZipCode(patientsZipCode);
            newPatient.setRegisteredProvider(registeredProvider);
            newPatient.setDateOfBirth(dateOfBirth);
            newPatient.setBalanceAllocatedToPatient(1000);
            newPatient.setTerminalIllnessAssociated(terminalIllnessAssociatedWithPatient);
            newPatient.setAdmissionDatetime(new Date());
            newPatient.setIsPatientAnInPatient(isPatientAnInPatient);
            newPatient.setOperatingHospice(hospice);
            //newPatient.setAdmissionDischargeTime(new Date());
            listOfPatients.add(newPatient);
            return newPatient;
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
    
    public Patient findPatientByMRN(String patientMRN, ArrayList<Patient> listOfPatients)
    {
        for(Patient patient: listOfPatients)
        {
            if(patient.getPatientMRN().equals(patientMRN))
            {
                return patient;
            }
        }
        return null;
    }
    
    public Patient findPatientByEmailID(String patientEmailID, ArrayList<Patient> listOfPatients)
    {
        for(Patient patient: listOfPatients)
        {
            if(patient.getPatientEmailID().equals(patientEmailID))
            {
                return patient;
            }
        }
        return null;
    }
    
}
