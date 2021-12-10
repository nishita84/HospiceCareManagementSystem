/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author architnigam
 */
public class ValidationLogic {
    private EcoSystem ecosystem;
    JFrame frame;
    AppConstants AppConstants = new AppConstants();
    public ValidationLogic()
    {
        
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
    
    
    public boolean validateIfAllFieldsAreFilled_2(JTextField field1, JTextField field2)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        
        if(field1Value.equals("") || field2Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    public boolean validateIfAllFieldsAreFilled_3(JTextField field1, JTextField field2, JTextField field3)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    public boolean validateIfAllFieldsAreFilled_4(JTextField field1, JTextField field2, JTextField field3, 
            JTextField field4)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        String field4Value = field4.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals("")
                || field4Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    public boolean validateIfAllFieldsAreFilled_5(JTextField field1, JTextField field2, JTextField field3, 
            JTextField field4, JTextField field5)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        String field4Value = field4.getText();
        String field5Value = field5.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals("")
                || field4Value.equals("") || field5Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    public boolean validateIfAllFieldsAreFilled_6(JTextField field1, JTextField field2, JTextField field3, 
            JTextField field4, JTextField field5, JTextField field6)
    {
        boolean areAllFieldsFilled = true;
        String field1Value = field1.getText();
        String field2Value = field2.getText();
        String field3Value = field3.getText();
        String field4Value = field4.getText();
        String field5Value = field5.getText();
        String field6Value = field5.getText();
        
        if(field1Value.equals("") || field2Value.equals("") || field3Value.equals("")
                || field4Value.equals("") || field5Value.equals("") || field6Value.equals(""))
        {
            areAllFieldsFilled = false;
        }
        return areAllFieldsFilled;
    }
    
    
    public boolean validateIfFieldIsNumeric(JTextField field)
    {
        boolean isFilledNumeric = true;
        String fieldValue = field.getText();
        if(!fieldValue.matches("[0-9]+"))
        {
            isFilledNumeric = false;
        }
        return isFilledNumeric;
    }
    
    // Function to validate that contact mobile number has 10 digits
     public boolean validateIfContactNumberIsCorrect(JTextField txtContactNumber){
        boolean isContactNumberValid = false;
        String contactNumberValue = txtContactNumber.getText();
        if(contactNumberValue.length() == 10 && validateIfFieldIsNumeric(txtContactNumber))
        {
            isContactNumberValid = true;
        }
        else{
            JOptionPane.showMessageDialog(frame, "Contact number should be 10 digits long!");
        }
        return isContactNumberValid;
    }
  
}
