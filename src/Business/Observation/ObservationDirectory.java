/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Observation;

import Business.Counsellors.Counsellor;
import Business.Patients.Patient;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class ObservationDirectory {
    private ArrayList<Observation> observationList;
    
    public ObservationDirectory()
    {
        observationList = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getObservationList() {
        return observationList;
    }

    public void setObservationList(ArrayList<Observation> observationList) {
        this.observationList = observationList;
    }
    
    public Observation createNewObservation(String meetingID, Counsellor counsellor, Patient patient, 
            String observationComments, boolean isPatientDepressed, boolean isPatientTakingMedications)
    {
        Observation observation = new Observation();
        observation.setMeetingID(meetingID);
        observation.setCounsellor(counsellor);
        observation.setPatientName(patient);
        observation.setObservationComments(observationComments);
        observation.setIsPatientDepressed(isPatientDepressed);
        observation.setIsPatientTakingMedications(isPatientTakingMedications);
        observationList.add(observation);
        return observation;
    }
}
