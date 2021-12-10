/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import Business.AppConstants;
import java.text.DecimalFormat;

/**
 *
 * @author architnigam
 */
public class BMICalculator {
    
    AppConstants AppConstants = new AppConstants();
    
    public double CalculateBMI(double weightInPounds, double heightInInches)
    {
        double BMI = 0;
        BMI = (weightInPounds/Math.pow(heightInInches, 2))*703;
        DecimalFormat df = new DecimalFormat("#.##");      
        BMI = Double.valueOf(df.format(BMI));
        return BMI;
    }
    
    public int DetermineBMICriticalityOfPatient(double weightInPounds, double heightInInches)
    {
        double BMI = CalculateBMI(weightInPounds, heightInInches);
        int criticalLevel = 0;
        
        if (BMI < 16.0)
        {
            criticalLevel = 1;
        }
        else if(BMI>=16.0 && BMI < 18.4)
        {
            criticalLevel = 2;
        }
        else if(BMI>=18.5 && BMI<24.9)
        {
            criticalLevel = 3;
        }
        else if(BMI>=24.9 && BMI<29.9)
        {
            criticalLevel = 4;
        }
        else if(BMI>=29.9 && BMI<34.9)
        {
            criticalLevel = 5;
        }
        else if(BMI>=34.9 && BMI<=39.9)
        {
            criticalLevel = 6;
        }
        else
        {
             criticalLevel = 7;
        }
        return criticalLevel;
    }
    
    public String BMIMapCriticalityLevelToCategory(int criticalLevel)
    {
        String BMICategory = "";
        switch(criticalLevel)
        {
            case 1:
                BMICategory = AppConstants.BMI_SeverlyUnderweight;
                break;
            case 2:
                BMICategory = AppConstants.BMI_Underweight;
                break;
            case 3:
                BMICategory = AppConstants.BMI_Normal;
                break;
            case 4:
                BMICategory = AppConstants.BMI_Overweight;
                break;
             case 5:
                BMICategory = AppConstants.BMI_ModeratelyObese;
                break;
             case 6:
                BMICategory = AppConstants.BMI_SeverlyObese;
                break;
             case 7:
                BMICategory = AppConstants.BMI_MorbidlyObese;
                break;
             default:
                 BMICategory = AppConstants.UnknownError;
                 break;
        }
        return BMICategory;
    }
    
    public boolean doesPatientHaveAbnormalBMI(int bmiCriticalityOfPatient)
    {
        boolean patientHasAbnormalBMI = false;
        if(bmiCriticalityOfPatient == 1 || bmiCriticalityOfPatient == 2
                        || bmiCriticalityOfPatient == 4 || bmiCriticalityOfPatient == 5
                        || bmiCriticalityOfPatient == 6 || bmiCriticalityOfPatient == 7)
        {
             patientHasAbnormalBMI = true;
        }
        return patientHasAbnormalBMI;
    }
    
}
