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
    private int alertID;
    Patient alertPatient;
    Provider alertProvider;
    Nurse alertNurse;
    private String alertComments;
    private Date alertTime;
    private int alertStatus;

    public int getAlertID() {
        return alertID;
    }

    public void setAlertID(int alertID) {
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

    public String getAlertComments() {
        return alertComments;
    }

    public void setAlertComments(String alertComments) {
        this.alertComments = alertComments;
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
    
    
    
}
