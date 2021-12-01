/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.HospiceAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ArchitNigam
 */
public class HospiceAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer);
    }

    
    
}
