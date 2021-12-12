/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author rohannayak
 */
public abstract class Role {
    
    public enum RoleType{
        HospiceAdmin("HospiceAdmin"),
        Patient("Patient"),
        Provider("Provider"),
        SysAdmin("Sysadmin"),
        Volunteer("Volunteer"),
        Nurse("Nurse"),
        Counsellor("Counsellor"),
        Donor("Donor"),
        Visitor("Visitor");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    } 
}