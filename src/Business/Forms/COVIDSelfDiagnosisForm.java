/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Forms;

import Business.Patients.Patient;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class COVIDSelfDiagnosisForm {
    private Patient patientFillingForm;
    private Date dateOfForm;
    private boolean hasPatientTraveledAbroadInLastFourteenDays;
    private boolean hasPatientBeenInCloseContactWithConfirmedCase;
    private boolean hasPatientBeenExperiencingSymptoms;
    private boolean hasPatientAgreedToTermsAndConditions;
    private String countryFromWhereFormIsBeingFilled;

    public Patient getPatientFillingForm() {
        return patientFillingForm;
    }

    public void setPatientFillingForm(Patient patientFillingForm) {
        this.patientFillingForm = patientFillingForm;
    }

    public Date getDateOfForm() {
        return dateOfForm;
    }

    public void setDateOfForm(Date dateOfForm) {
        this.dateOfForm = dateOfForm;
    }

    public boolean isHasPatientTraveledAbroadInLastFourteenDays() {
        return hasPatientTraveledAbroadInLastFourteenDays;
    }

    public void setHasPatientTraveledAbroadInLastFourteenDays(boolean hasPatientTraveledAbroadInLastFourteenDays) {
        this.hasPatientTraveledAbroadInLastFourteenDays = hasPatientTraveledAbroadInLastFourteenDays;
    }

    public boolean isHasPatientBeenInCloseContactWithConfirmedCase() {
        return hasPatientBeenInCloseContactWithConfirmedCase;
    }

    public void setHasPatientBeenInCloseContactWithConfirmedCase(boolean hasPatientBeenInCloseContactWithConfirmedCase) {
        this.hasPatientBeenInCloseContactWithConfirmedCase = hasPatientBeenInCloseContactWithConfirmedCase;
    }

    public boolean isHasPatientBeenExperiencingSymptoms() {
        return hasPatientBeenExperiencingSymptoms;
    }

    public void setHasPatientBeenExperiencingSymptoms(boolean hasPatientBeenExperiencingSymptoms) {
        this.hasPatientBeenExperiencingSymptoms = hasPatientBeenExperiencingSymptoms;
    }

    public boolean isHasPatientAgreedToTermsAndConditions() {
        return hasPatientAgreedToTermsAndConditions;
    }

    public void setHasPatientAgreedToTermsAndConditions(boolean hasPatientAgreedToTermsAndConditions) {
        this.hasPatientAgreedToTermsAndConditions = hasPatientAgreedToTermsAndConditions;
    }

    public String getCountryFromWhereFormIsBeingFilled() {
        return countryFromWhereFormIsBeingFilled;
    }

    public void setCountryFromWhereFormIsBeingFilled(String countryFromWhereFormIsBeingFilled) {
        this.countryFromWhereFormIsBeingFilled = countryFromWhereFormIsBeingFilled;
    }
    
    
}
