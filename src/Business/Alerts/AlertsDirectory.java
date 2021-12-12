/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Alerts;

import Business.Nurses.Nurse;
import Business.Patients.Patient;
import Business.Providers.Provider;
import Business.SetIDsForWorkflows;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class AlertsDirectory {
    private ArrayList<Alert> listOfAlerts;
    
    public AlertsDirectory()
    {
        listOfAlerts = new ArrayList<Alert>();
    }

    public ArrayList<Alert> getListOfAlerts() {
        return listOfAlerts;
    }

    public void setListOfAlerts(ArrayList<Alert> listOfAlerts) {
        this.listOfAlerts = listOfAlerts;
    }
    
    public Alert createNewAlert(Patient alertingPatient, String alertReason, int alertLevel, Provider reportingProvider, 
            Nurse assignedNurse)
    {
        Alert alert = new Alert();
        SetIDsForWorkflows setIDForWorkflows = new SetIDsForWorkflows();
        alert.setAlertID(setIDForWorkflows.SetIDForAlert());
        alert.setAlertPatient(alertingPatient);
        alert.setAlertSymptom(alertReason);
        alert.setAlertTime(new Date());
        alert.setAlertProvider(reportingProvider);
        alert.setAlertNurse(assignedNurse);
        alert.setAlertLevel(alertLevel);
        alert.setAlertStatus(0);
        listOfAlerts.add(alert);
        return alert;
    }
    
    public boolean doesPatientHaveOneOpenAlertAlreadyInSystem(Patient patient, ArrayList<Alert> listOfAlerts)
    {
        for (Alert alert : listOfAlerts)
        {
            if(alert.getAlertPatient().getPatientMRN().equals(patient.getPatientMRN()))
            {
                if(alert.getAlertStatus() == 0)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Alert updateAlert(Alert selectedAlert)
    {
        listOfAlerts.set(listOfAlerts.indexOf(selectedAlert), selectedAlert);
        return selectedAlert;
    }
}
