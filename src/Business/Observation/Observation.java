/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Observation;

import Business.Counsellors.Counsellor;
import Business.Patients.Patient;

/**
 *
 * @author architnigam
 */
public class Observation {
    private String observationComments;
    private Patient patientName;
    private Counsellor counsellor;
    private String meetingID;
    private boolean isPatientDepressed;
    private boolean isPatientTakingMedications;

    public String getObservationComments() {
        return observationComments;
    }

    public void setObservationComments(String observationComments) {
        this.observationComments = observationComments;
    }

    public Patient getPatientName() {
        return patientName;
    }

    public void setPatientName(Patient patientName) {
        this.patientName = patientName;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public boolean isIsPatientDepressed() {
        return isPatientDepressed;
    }

    public void setIsPatientDepressed(boolean isPatientDepressed) {
        this.isPatientDepressed = isPatientDepressed;
    }

    public boolean isIsPatientTakingMedications() {
        return isPatientTakingMedications;
    }

    public void setIsPatientTakingMedications(boolean isPatientTakingMedications) {
        this.isPatientTakingMedications = isPatientTakingMedications;
    }
    
    
         
    
}
