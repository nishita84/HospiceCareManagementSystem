/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author architnigam
 */
public class ValidationLogic {
    private EcoSystem ecosystem;
    JFrame frame;
    AppConstants AppConstants = new AppConstants();
    public ValidationLogic(EcoSystem ecosystem)
    {
        this.ecosystem = ecosystem;
    }
    
     public boolean ValidateIfAllFieldsOnUIAreFilledAndAreNumeric(String MRN, String weight, 
            String height, String cholesterolReading, String systoleReading, 
            String diastoleReading) {
        
        boolean areAllFieldsFilled = false;
        if (!(MRN.equals("")) && !(weight.equals("")) && !(height.equals("")) && !(cholesterolReading.equals(""))
               && !(systoleReading.equals("")) && !(diastoleReading.equals("")))
        {
            areAllFieldsFilled = true;
        }
        boolean areAllFieldsNumeric = false;
        
        if(MRN.length() >= 1 && weight.length() >= 1 && height.length() >= 1 && cholesterolReading.length() >= 1
                && systoleReading.length() >= 1 && diastoleReading.length() >= 1)
        {
            if(! MRN.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! weight.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! height.matches(AppConstants.RegularExpressionForNumericFields) 
                    || ! cholesterolReading.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! systoleReading.matches(AppConstants.RegularExpressionForNumericFields)
                    || ! diastoleReading.matches(AppConstants.RegularExpressionForNumericFields))
            {
                areAllFieldsNumeric = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsAreNotNumeric);
            }
            else 
            {
                areAllFieldsNumeric = true;
            }
        }
        else
        {
                areAllFieldsFilled = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsNotFilled);
        }
        
        boolean validationSuccessful = false;
        
        if(areAllFieldsFilled && areAllFieldsNumeric)
        {
            validationSuccessful = true;
        }
        else{
            validationSuccessful = false;
        }
        return validationSuccessful;
    }
    
    public boolean ValidateThatAllFieldsAreFilledDuringUpdate(String weight, 
            String height, String cholesterolReading, String systoleReading, 
            String diastoleReading)
    {
        boolean areAllFieldsFilled = false;
        if ( !(weight.equals("")) && !(height.equals("")) && !(cholesterolReading.equals(""))
               && !(systoleReading.equals("")) && !(diastoleReading.equals("")))
        {
            areAllFieldsFilled = true;
        }
        else
        {
                areAllFieldsFilled = false;
                JOptionPane.showMessageDialog(frame, AppConstants.ErrorMessageAllFieldsNotFilled);
        }
        return areAllFieldsFilled;
    }
    
    
    // Donor is not allowed to donate more than $20k dollars in one donation
    public boolean VerifyThatDonorPermittedAmountOfDonation(double totalAmountDonatedByDonorToHospice)
    {
        boolean isDonorDonatingPermissibleAmount = true;
        if(totalAmountDonatedByDonorToHospice > 20000 )
        {
            isDonorDonatingPermissibleAmount = false;
        }
        return isDonorDonatingPermissibleAmount;
    }
}
