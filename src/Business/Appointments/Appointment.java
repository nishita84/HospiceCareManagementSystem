/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointments;

import Business.Counsellors.Counsellor;
import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class Appointment {
    private String appointmentID;
    Patient appointmentPatient;
    Provider appointmentProvider;
    Counsellor appointmentCounsellor;
    private Date appointmentDate;
    private String appointmentTime;
    private int appointmentStatus;
    private String appointmentReason;

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
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

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
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

    public Counsellor getAppointmentCounsellor() {
        return appointmentCounsellor;
    }

    public void setAppointmentCounsellor(Counsellor appointmentCounsellor) {
        this.appointmentCounsellor = appointmentCounsellor;
    }
    
    
}
