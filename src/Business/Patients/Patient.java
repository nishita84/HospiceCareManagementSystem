/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;
import Business.Payers.Payer;
import Business.Providers.Provider;
/**
 *
 * @author architnigam
 */

public class Patient {
    private int patientMRN;
    private String patientName;
    private String patientAddress;
    private String patientCity;
    private String patientState;
    private String patientZipCode;
    private String patientCountry;
    private String patientContactNumber;
    private String patientEmailID;
    Provider registeredProvider;
    Payer registeredPayer;
    private double balanceAllocatedToPatient;
    private String illnessAssociated;
    
}
