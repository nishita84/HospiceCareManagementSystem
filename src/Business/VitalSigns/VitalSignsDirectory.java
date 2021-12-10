/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;


import Business.Patients.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class VitalSignsDirectory {
    private ArrayList <VitalSigns> listOfVitalSigns;
    BMICalculator bmiCalculator;
    BloodPressureCalculator bloodPressureCalculator;
    CholesterolCalculator cholesterolCalculator;
    
    public VitalSignsDirectory()
    {
        this.listOfVitalSigns = new ArrayList<VitalSigns>();
        bmiCalculator = new BMICalculator();
        bloodPressureCalculator = new BloodPressureCalculator();
        cholesterolCalculator = new CholesterolCalculator();
    }

    public ArrayList<VitalSigns> getListOfVitalSigns() {
        return listOfVitalSigns;
    }

    public void setListOfVitalSigns(ArrayList<VitalSigns> listOfVitalSigns) {
        this.listOfVitalSigns = listOfVitalSigns;
    }
    
     public VitalSigns createVitalSignsRecord(Patient patient, String gender, String ethinicity, Date dateOfVisit,
             double heightInInches, double weightInPounds, double systoleReading, double diastoleReading, 
             double totalCholesterolReading) {

            VitalSigns newVitalSignsRecord = new VitalSigns();
            newVitalSignsRecord.setPatient(patient);
            newVitalSignsRecord.setEthinicity(ethinicity);
            newVitalSignsRecord.setDateOfVisit(dateOfVisit);
            newVitalSignsRecord.setGender(gender);
            newVitalSignsRecord.setDateOfVisit(new Date());
            newVitalSignsRecord.setHeightInInches(heightInInches);
            newVitalSignsRecord.setWeightInPounds(weightInPounds);
            newVitalSignsRecord.setSystoleReadingInmmHg(systoleReading);
            newVitalSignsRecord.setDiastoleReadingInmmHg(diastoleReading);
            newVitalSignsRecord.setCholesterolReadingInmgDl(totalCholesterolReading);
            
            double BMIValue = (bmiCalculator.CalculateBMI(weightInPounds, heightInInches));
            newVitalSignsRecord.setBMI(BMIValue);
            int BMICriticality = bmiCalculator.DetermineBMICriticalityOfPatient(weightInPounds, heightInInches);
            newVitalSignsRecord.setBMIDangerLevel(BMICriticality);
            
            int CholesterolCriticality = cholesterolCalculator.DetermineCholesterolDangerLevelCriticalityOfPatient(totalCholesterolReading);
            newVitalSignsRecord.setCholesterolDangerLevel(CholesterolCriticality);
            
            int BPCriticality = bloodPressureCalculator.DetermineBloodPressureCriticalityOfPatient(systoleReading, diastoleReading);
            newVitalSignsRecord.setBloodPressureDangerLevel(BPCriticality);
            
            listOfVitalSigns.add(newVitalSignsRecord);
            return newVitalSignsRecord;
    }
}
