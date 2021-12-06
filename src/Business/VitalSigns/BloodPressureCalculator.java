/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import Business.AppConstants;


/**
 *
 * @author architnigam
 */
public class BloodPressureCalculator {
    
    AppConstants AppConstants = new AppConstants();
    
    public int DetermineBloodPressureCriticalityOfPatient(double systoleReading, double diastoleReading)
    {
        int criticalLevel = 0;
        
        if(systoleReading < 120 && diastoleReading < 80)
        {
            criticalLevel = 1;
        }
        else if(systoleReading >= 120 && systoleReading <= 129 && diastoleReading < 80)
        {
            criticalLevel = 2;
        }
        else if(systoleReading >= 130 && systoleReading <= 139 || diastoleReading >= 80 && diastoleReading <= 89)
        {
            criticalLevel = 3;
        }
        
        else if(systoleReading >= 140 || diastoleReading > 90)
        {
            criticalLevel = 4;
        }
        
        else if(systoleReading >= 180 && diastoleReading > 120)
        {
            criticalLevel = 5;
        }
        return criticalLevel;
    }
    
    public String BPMapCriticalityLevelToCategory(int criticalLevel)
    {
        String BPCategory = "";
        switch(criticalLevel)
        {
            case 1:
                BPCategory = AppConstants.BP_Normal;
                break;
            case 2:
                BPCategory = AppConstants.BP_Elevated;
                break;
            case 3:
                BPCategory = AppConstants.BP_HighBloodPressureStage1;
                break;
            case 4:
                BPCategory = AppConstants.BP_HighBloodPressureStage2;
                break;
             case 5:
                BPCategory = AppConstants.BP_HyperTensiveCrisis;
                break;
                
             default:
                 BPCategory = AppConstants.UnknownError;
                 break;
               
        }
        return BPCategory;
    }
    
    
    public boolean doesPatientHaveAbnormalBloodPressure(int bpCriticalityOfPatient)
    {
        boolean patientHasAbnormalBloodPressure = false;
        if(bpCriticalityOfPatient == 2 || bpCriticalityOfPatient == 3
                        || bpCriticalityOfPatient == 4 || bpCriticalityOfPatient == 5)
        {
            patientHasAbnormalBloodPressure  = true;
        }
        return patientHasAbnormalBloodPressure;
    }
    
}
