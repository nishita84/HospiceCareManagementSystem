/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chatbot;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Symptoms {
    private String patientMRN;
    private int age;
    private String gender;
    private ArrayList<String> listOfSymptoms;
    private ArrayList<String> currentMedications;
    private ArrayList<String> pastOrCurrentIllness;

    public String getPatientMRN() {
        return patientMRN;
    }

    public void setPatientMRN(String patientMRN) {
        this.patientMRN = patientMRN;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getListOfSymptoms() {
        return listOfSymptoms;
    }

    public void setListOfSymptoms(ArrayList<String> listOfSymptoms) {
        this.listOfSymptoms = listOfSymptoms;
    }


    public ArrayList<String> getCurrentMedications() {
        return currentMedications;
    }

    public void setCurrentMedications(ArrayList<String> currentMedications) {
        this.currentMedications = currentMedications;
    }

    public ArrayList<String> getPastOrCurrentIllness() {
        return pastOrCurrentIllness;
    }

    public void setPastOrCurrentIllness(ArrayList<String> pastOrCurrentIllness) {
        this.pastOrCurrentIllness = pastOrCurrentIllness;
    }
    
    
}
