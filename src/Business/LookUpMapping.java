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
    
    public String mapClaimStatus(int claimStatus)
    {
        String claimStatusValue = "";
        switch(claimStatus)
        {
            case 0:
                claimStatusValue = "Created";
                break;
            case 1: 
                claimStatusValue = "Processing ";
                break;
             case 2: 
                claimStatusValue = "Approved ";
                break;
             case 3: 
                claimStatusValue = "Rejected ";
                break;
             case 4: 
                claimStatusValue = "Paid ";
                break;
             case 5: 
                claimStatusValue = "Voided ";
                break;
        }
        return claimStatusValue;
    }
    
    public String mapAppointmentStatus(int appointmentStatus)
    {
        String appointmentStatusValue = "";
        switch(appointmentStatus)
        {
            case 0:
                appointmentStatusValue = "Scheduled";
                break;
            case 1: 
                appointmentStatusValue = "Completed ";
                break;
             case 2: 
                appointmentStatusValue = "Canceled ";
                break;
        }
        return appointmentStatusValue;
    }
}
