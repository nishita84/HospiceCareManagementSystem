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
public class CholesterolCalculator {
    
    AppConstants AppConstants = new AppConstants();
    
    public int DetermineCholesterolDangerLevelCriticalityOfPatient(double totalCholestrolReading)
    {
        int cholestrolCriticality = 0;
        
        if(totalCholestrolReading < 200)
        {
            cholestrolCriticality = 1;
        }
        else if(totalCholestrolReading >= 200 && totalCholestrolReading <= 239)
        {
            cholestrolCriticality = 2;
        }
        else
        {
            cholestrolCriticality = 3;
        }
        return cholestrolCriticality;
    }
    
    public String CholesterolMapCriticalityLevelToCategory(int criticalLevel)
    {
        String CholestrolCategory = "";
        switch(criticalLevel)
        {
             case 1:
                CholestrolCategory = AppConstants.Cholestrol_Desirable;
                break;
            case 2:
                CholestrolCategory = AppConstants.Cholestrol_BorderlineHigh;
                break;
            case 3:
                CholestrolCategory = AppConstants.Cholestrol_High;
                break;
            default:
                 CholestrolCategory = AppConstants.UnknownError;
                 break;
        }
        return CholestrolCategory;
    }
    
    public boolean doesPatientHaveAbnormalCholesterol(int cholesterolCriticalityOfPatient)
    {
        boolean patientHasAbnormalCholesterol = false;
         if(cholesterolCriticalityOfPatient == 2 || cholesterolCriticalityOfPatient == 3)
                {
                    patientHasAbnormalCholesterol = true;
                }
        return patientHasAbnormalCholesterol;
    }
}
