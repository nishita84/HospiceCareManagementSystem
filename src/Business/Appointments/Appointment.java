/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointments;

import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class Appointment {
    private int appointmentID;
    Patient appointmentPatient;
    Provider appointmentProvider;
    private Date appointmentTime;
    private int appointmentStatus;
    private String appointmentReason;

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public Patient getAppointmentPatient() {
        return appointmentPatient;
    }

    public void setAppointmentPatient(Patient appointmentAskedBy) {
        this.appointmentPatient = appointmentAskedBy;
    }

    public Provider getAppointmentProvider() {
        return appointmentProvider;
    }

    public void setAppointmentProvider(Provider appointmentReceiver) {
        this.appointmentProvider = appointmentReceiver;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public int getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(int appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentReason() {
        return appointmentReason;
    }

    public void setAppointmentReason(String appointmentReason) {
        this.appointmentReason = appointmentReason;
    }
    
    
}
