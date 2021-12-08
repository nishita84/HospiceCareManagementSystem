/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author architnigam
 */
public class LookUpMapping {
    
    
    public String mapAlertLevel(int alertLevel)
    {
        String alertLevelValue = "";
        switch(alertLevel)
        {
            case 0:
                alertLevelValue = "Low";
                break;
            case 1: 
                alertLevelValue = "Moderate";
                break;
            case 2: 
                alertLevelValue = "Critical";
                break;
        }
        return alertLevelValue;
    }
    
    public String mapAlertStatus(int alertStatus)
    {
        String alertLevelValue = "";
        switch(alertStatus)
        {
            case 0:
                alertLevelValue = "Open";
                break;
            case 1: 
                alertLevelValue = "Closed";
                break;
        }
        return alertLevelValue;
    }
}
