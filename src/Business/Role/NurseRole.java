/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author architnigam
 */
public class NurseRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new NurseWorkAreaJPanel(userProcessContainer,account);//To change body of generated methods, choose Tools | Templates.
    }
}
