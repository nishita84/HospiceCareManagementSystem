/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Donation.Donation;
import Business.Donors.Donor;
import Business.Hospice.Hospice;
import javax.swing.JTextField;

/**
 *
 * @author architnigam
 */
public class ValidationLogic {
    private EcoSystem ecosystem;
    
    public ValidationLogic(EcoSystem ecosystem)
    {
        this.ecosystem = ecosystem;
    }
    
    public boolean ValidateThatTextFieldHasNumericDigits(JTextField txtField)
    {
        boolean doesFieldHaveNumericDigits = false;
        return doesFieldHaveNumericDigits;
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
