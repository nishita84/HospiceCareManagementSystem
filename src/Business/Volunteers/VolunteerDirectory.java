/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteers;

import Business.Nurses.Nurse;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class VolunteerDirectory {
    private ArrayList<Volunteer> listOfVolunteers;
    
    public VolunteerDirectory()
    {
        listOfVolunteers = new ArrayList<Volunteer>();
    }

    public ArrayList<Volunteer> getListOfVolunteers() {
        return listOfVolunteers;
    }

    public void setListOfVolunteers(ArrayList<Volunteer> listOfVolunteers) {
        this.listOfVolunteers = listOfVolunteers;
    }
    
    public Volunteer createVolunteer(String volunteerID, String volunteerName, String volunteerAddress, 
            String volunteerEmailID, String volunteerContactNo)
    {
        Volunteer newVolunteer = new Volunteer();
        newVolunteer.setVolunteerID(volunteerID);
        newVolunteer.setVolunteerName(volunteerName);
        newVolunteer.setVolunteerAddress(volunteerAddress);
        newVolunteer.setVolunteerEmailID(volunteerEmailID);
        newVolunteer.setVolunteerContactNo(volunteerContactNo);
        listOfVolunteers.add(newVolunteer);
        return newVolunteer;
    }
    public Volunteer updateNurse(Volunteer selectedVolunteer)
    {
        listOfVolunteers.set(listOfVolunteers.indexOf(selectedVolunteer), selectedVolunteer);
        return selectedVolunteer;
    }
    
    public void deleteVolunteer(int indexOfSelectedRecord)
    {
        listOfVolunteers.remove(indexOfSelectedRecord);
    }
    
    public Volunteer findVolunteerByID(String volunteerID, ArrayList<Nurse> listOfNurses)
    {
        for(Volunteer volunteer: listOfVolunteers)
        {
            if(volunteer.getVolunteerID().equals(volunteerID))
            {
                return volunteer;
            }
        }
        return null;
    }
    
}
