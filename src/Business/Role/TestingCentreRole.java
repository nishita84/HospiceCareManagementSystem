/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.TestingCentre.TestingCentreJPanel;

/**
 *
 * @author architnigam
 */
public class TestingCentreRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        return new TestingCentreJPanel(userProcessContainer, account, system);
    }
}
