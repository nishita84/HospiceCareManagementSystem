/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Alerts;

import Business.Nurses.Nurse;
import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class Alert {
    private String alertID;
    Patient alertPatient;
    Provider alertProvider;
    Nurse alertNurse;
    private String alertSymptom;
    private int alertLevel;
    private Date alertTime;
    private int alertStatus;
    private Date alertCloseTime;

    public String getAlertID() {
        return alertID;
    }

    public void setAlertID(String alertID) {
        this.alertID = alertID;
    }

    public Patient getAlertPatient() {
        return alertPatient;
    }

    public void setAlertPatient(Patient alertPatient) {
        this.alertPatient = alertPatient;
    }

    public Provider getAlertProvider() {
        return alertProvider;
    }

    public void setAlertProvider(Provider alertProvider) {
        this.alertProvider = alertProvider;
    }

    public String getAlertSymptom() {
        return alertSymptom;
    }

    public void setAlertSymptom(String alertSymptom) {
        this.alertSymptom = alertSymptom;
    }

    public int getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(int alertLevel) {
        this.alertLevel = alertLevel;
    }

    public Date getAlertTime() {
        return alertTime;
    }

    public void setAlertTime(Date alertTime) {
        this.alertTime = alertTime;
    }

    public Nurse getAlertNurse() {
        return alertNurse;
    }

    public void setAlertNurse(Nurse alertNurse) {
        this.alertNurse = alertNurse;
    }
    
    public int getAlertStatus() {
        return alertStatus;
    }

    public void setAlertStatus(int alertStatus) {
        this.alertStatus = alertStatus;
    }

    public Date getAlertCloseTime() {
        return alertCloseTime;
    }

    public void setAlertCloseTime(Date alertCloseTime) {
        this.alertCloseTime = alertCloseTime;
    }
}
