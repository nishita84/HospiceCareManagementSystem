package Business;

import Business.Employee.Employee;
import Business.Hospice.Hospice;
import Business.Role.HospiceAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
//        Hospice hospice = new Hospice();
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
//        hospice = system.getHospiceDirectory().createNewHospice("Hospice Test", "Test Address", "Dallas", 
//                "TX", "USA", "1234567890", "something@test.com", "02215", "hosUSA");
//        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("hosUSA", "hosUSA", employee, new HospiceAdminRole());
//        
        return system;
    }
    
}
