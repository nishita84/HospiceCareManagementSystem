/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Hospice.HospiceDirectory;
import Business.Nurses.NursesDirectory;
import Business.Patients.PatientsDirectory;
import Business.Providers.ProviderDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    HospiceDirectory hospiceDirectory;
    ProviderDirectory providerDirectory;
    NursesDirectory nurseDirectory;
    PatientsDirectory patientDirectory;

    public EcoSystem(HospiceDirectory hospiceDirectory, ProviderDirectory providerDirectory, NursesDirectory nurseDirectory, PatientsDirectory patientDirectory)  {
        this.hospiceDirectory = hospiceDirectory;
        this.nurseDirectory = nurseDirectory;
        this.patientDirectory = patientDirectory;
        this.providerDirectory = providerDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
         hospiceDirectory = new HospiceDirectory();
         nurseDirectory = new NursesDirectory();
         patientDirectory = new PatientsDirectory();
         providerDirectory = new ProviderDirectory();
    }

    public ProviderDirectory getProviderDirectory() {
        return providerDirectory;
    }

    public void setProviderDirectory(ProviderDirectory providerDirectory) {
        this.providerDirectory = providerDirectory;
    }
    

    public NursesDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NursesDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    public PatientsDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientsDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public HospiceDirectory getHospiceDirectory() {
        return hospiceDirectory;
    }

    public void setHospiceDirectory(HospiceDirectory hospiceDirectory) {
        this.hospiceDirectory = hospiceDirectory;
    }
    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    
    
}
