/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospice;

import Business.Counsellors.Counsellor;
import Business.Donors.Donor;
import Business.Nurses.Nurse;
import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Hospice {
    private String hospiceName;
    private String hospiceAddress;
    private String hospiceCity;
    private String hospiceState;
    private String hospiceZipCode;
    private String hospiceCountry;
    private String hospiceContactNumber;
    private String hospiceEmailID;
    private double totalHospiceBalance;
    ArrayList<Patient> registeredPatientsInHospice;
    ArrayList<Provider> registeredProvidersInHospice;
    ArrayList<Nurse> registeredNursesInHospice;
    ArrayList<Counsellor> registeredCounsellorsInHospice;
    //ArrayList<Volunteer> registeredVolunteersInHospice;
    ArrayList<Donor> registeredDonorsInHospice;
    
}
