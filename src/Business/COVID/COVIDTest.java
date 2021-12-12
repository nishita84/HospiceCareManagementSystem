/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.COVID;

import Business.Patients.Patient;
import Business.TestingCentre.TestingCentre;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class COVIDTest {
    public String COVIDTestID;
    public TestingCentre TestingCentre;
    public Patient patient;
    public Date dateOfAppointment;
    public String time;
    public int testStatus;

    public String getCOVIDTestID() {
        return COVIDTestID;
    }

    public void setCOVIDTestID(String COVIDTestID) {
        this.COVIDTestID = COVIDTestID;
    }

    public TestingCentre getTestingCentre() {
        return TestingCentre;
    }

    public void setTestingCentre(TestingCentre TestingCentre) {
        this.TestingCentre = TestingCentre;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(int testStatus) {
        this.testStatus = testStatus;
    }
    
    
    
}
