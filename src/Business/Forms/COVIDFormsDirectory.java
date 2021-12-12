/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Forms;

import Business.Patients.Patient;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class COVIDFormsDirectory {
    private ArrayList<COVIDSelfDiagnosisForm> listOfCOVIDForms;
    
    public COVIDFormsDirectory()
    {
        this.listOfCOVIDForms = new ArrayList<COVIDSelfDiagnosisForm>();
    }

    public ArrayList<COVIDSelfDiagnosisForm> getListOfCOVIDForms() {
        return listOfCOVIDForms;
    }

    public void setListOfCOVIDForms(ArrayList<COVIDSelfDiagnosisForm> listOfCOVIDForms) {
        this.listOfCOVIDForms = listOfCOVIDForms;
    }
    
    public COVIDSelfDiagnosisForm createCOVIDSelfDiagnosisForm(Patient patientFillingForm, boolean hasPatientTraveledAbroad, 
            boolean hasPatientBeenInContactWithPositivePatient, boolean isPatientExperiencingSymptoms, 
            boolean hasPatientAgreedTAndC) throws ParseException
    {
        COVIDSelfDiagnosisForm newCOVIDForm = new COVIDSelfDiagnosisForm();
        
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date todayDate = new Date();
        Date todayDateWithZeroTime = formatter.parse(formatter.format(todayDate)); 
        String dateToString = formatter.format(todayDateWithZeroTime); 
        dateToString = dateToString.substring(0, 10);
        Date dateOfFormSubmission =new SimpleDateFormat("MM/dd/yyyy").parse(dateToString);
        
        newCOVIDForm.setPatientFillingForm(patientFillingForm);
        newCOVIDForm.setDateOfForm(dateOfFormSubmission);
        newCOVIDForm.setHasPatientTraveledAbroadInLastFourteenDays(hasPatientTraveledAbroad);
        newCOVIDForm.setHasPatientBeenInCloseContactWithConfirmedCase(hasPatientBeenInContactWithPositivePatient);
        newCOVIDForm.setHasPatientBeenExperiencingSymptoms(isPatientExperiencingSymptoms);
        newCOVIDForm.setHasPatientAgreedToTermsAndConditions(hasPatientAgreedTAndC);
        listOfCOVIDForms.add(newCOVIDForm);
        return newCOVIDForm;
    }
}
