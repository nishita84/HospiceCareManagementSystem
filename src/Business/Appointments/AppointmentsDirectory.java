/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointments;

import Business.Counsellors.Counsellor;
import Business.Patients.Patient;
import Business.Providers.Provider;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class AppointmentsDirectory {
    private ArrayList<Appointment> listOfAppointments;
    
    public AppointmentsDirectory()
    {
        listOfAppointments = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getListOfAppointments() {
        return listOfAppointments;
    }

    public void setListOfAppointments(ArrayList<Appointment> listOfAppointments) {
        this.listOfAppointments = listOfAppointments;
    }
    
    public Appointment createNewAppointmentWithProvider(String appointmentID, Patient appointmentPatient, 
            Provider appointmentProvider, Date appointmentDate, String appointmentTime, 
            String appointmentReason)
    {
        Appointment newAppointmentWithProvider = new Appointment();
        newAppointmentWithProvider.setAppointmentID(appointmentID);
        newAppointmentWithProvider.setAppointmentPatient(appointmentPatient);
        newAppointmentWithProvider.setAppointmentProvider(appointmentProvider);
        newAppointmentWithProvider.setAppointmentDate(appointmentDate);
        newAppointmentWithProvider.setAppointmentTime(appointmentTime);
        newAppointmentWithProvider.setAppointmentReason(appointmentReason);
        newAppointmentWithProvider.setAppointmentStatus(0);
        listOfAppointments.add(newAppointmentWithProvider);
        return newAppointmentWithProvider;
    }
    
    public Appointment createNewAppointmentWithCounsellor(String appointmentID, Patient appointmentPatient, 
            Counsellor appointmentCounsellor, Date appointmentDate, String appointmentTime, 
            String appointmentReason)
    {
        Appointment newAppointmentWithCounsellor = new Appointment();
        newAppointmentWithCounsellor.setAppointmentID(appointmentID);
        newAppointmentWithCounsellor.setAppointmentPatient(appointmentPatient);
        newAppointmentWithCounsellor.setAppointmentCounsellor(appointmentCounsellor);
        newAppointmentWithCounsellor.setAppointmentDate(appointmentDate);
        newAppointmentWithCounsellor.setAppointmentTime(appointmentTime);
        newAppointmentWithCounsellor.setAppointmentReason(appointmentReason);
        newAppointmentWithCounsellor.setAppointmentStatus(0);
        listOfAppointments.add(newAppointmentWithCounsellor);
        return newAppointmentWithCounsellor;
    }
    
    public ArrayList<Appointment> findAppointmentByProvider(String ProviderNPI, ArrayList<Appointment> listOfAppointments)
    {
        ArrayList<Appointment> listOfAppointmentsByProvider = new ArrayList<Appointment>();
        for(Appointment appt : listOfAppointments)
        {
            if(appt.getAppointmentProvider().getProviderNPI().equals(ProviderNPI))
            {
                listOfAppointmentsByProvider.add(appt);
            }
        }
        return listOfAppointmentsByProvider;
    }
    
    public ArrayList<Appointment> findAppointmentByCounsellor(String counsellorID, ArrayList<Appointment> listOfAppointments)
    {
        ArrayList<Appointment> listOfAppointmentsByCounsellor = new ArrayList<Appointment>();
        for(Appointment appt : listOfAppointments)
        {
            if(appt.getAppointmentCounsellor().getCounsellorID().equals(counsellorID))
            {
                listOfAppointmentsByCounsellor.add(appt);
            }
        }
        return listOfAppointmentsByCounsellor;
    }
}
