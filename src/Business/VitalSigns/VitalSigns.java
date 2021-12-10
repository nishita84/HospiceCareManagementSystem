/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import Business.Patients.Patient;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class VitalSigns {
    private String vitalSignsRecordID;
    private Patient patient;
    private Date dateOfVisit;
    private String gender;
    private String ethinicity;
    private double weightInPounds;
    private double heightInInches;
    private double BMI;
    private double systoleReadingInmmHg;
    private double diastoleReadingInmmHg;
    private double cholesterolReadingInmgDl;
    private int cholesterolDangerLevel;
    private int BMIDangerLevel;
    private int bloodPressureDangerLevel;

    public String getVitalSignsRecordID() {
        return vitalSignsRecordID;
    }

    public void setVitalSignsRecordID(String vitalSignsRecordID) {
        this.vitalSignsRecordID = vitalSignsRecordID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public double getSystoleReadingInmmHg() {
        return systoleReadingInmmHg;
    }

    public void setSystoleReadingInmmHg(double systoleReadingInmmHg) {
        this.systoleReadingInmmHg = systoleReadingInmmHg;
    }

    public double getDiastoleReadingInmmHg() {
        return diastoleReadingInmmHg;
    }

    public void setDiastoleReadingInmmHg(double diastoleReadingInmmHg) {
        this.diastoleReadingInmmHg = diastoleReadingInmmHg;
    }

    public double getCholesterolReadingInmgDl() {
        return cholesterolReadingInmgDl;
    }

    public void setCholesterolReadingInmgDl(double cholesterolReadingInmgDl) {
        this.cholesterolReadingInmgDl = cholesterolReadingInmgDl;
    }

    public int getCholesterolDangerLevel() {
        return cholesterolDangerLevel;
    }

    public void setCholesterolDangerLevel(int cholesterolDangerLevel) {
        this.cholesterolDangerLevel = cholesterolDangerLevel;
    }

    public int getBMIDangerLevel() {
        return BMIDangerLevel;
    }

    public void setBMIDangerLevel(int BMIDangerLevel) {
        this.BMIDangerLevel = BMIDangerLevel;
    }

    public int getBloodPressureDangerLevel() {
        return bloodPressureDangerLevel;
    }

    public void setBloodPressureDangerLevel(int bloodPressureDangerLevel) {
        this.bloodPressureDangerLevel = bloodPressureDangerLevel;
    }

    public String getEthinicity() {
        return ethinicity;
    }

    public void setEthinicity(String ethinicity) {
        this.ethinicity = ethinicity;
    }
      
}
