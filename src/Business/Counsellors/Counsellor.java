/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Counsellors;

import Business.Patients.Patient;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Counsellor {
    private int counsellorID;
    private String counsellorName;
    private String counsellorAddress;
    private String counsellorCity;
    private String counsellorState;
    private String counsellorZipCode;
    private String counsellorCountry;
    ArrayList<Patient> patientsAssignedToCounsellor;
    
}
