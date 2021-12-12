/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;

import Business.COVID.COVIDTest;
import Business.Patients.Patient;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

// Ensure 
// 1. Allow Less Secure App(should be turned on): https://myaccount.google.com/lesssecureapps?pli=1&rapt=AEjHL4PalwviZVy9Fpw_V_ck4U7InWAaXHO2tlYUGu1zGdPtVfB7VChKxU36GuA8vbtgLB3nHgW8y4wUW852rTNQjYXUXwow8g
// 2. Two Step Verification should be turned off.
/**
 *
 * @author architnigam
 */

public class Email {
    
    
    public void SendEmailOfAppointment(String recepient, String appointmentID, String appointeeName, String appointerName,
            Date dateOfAppointment, 
            String time)
    {

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
     properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.smtp.host", "smtp.gmail.com");
     properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
     properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
     properties.put("mail.smtp.port", "587");
       
     
        final String senderEmailID = "aedprojectgroup@gmail.com";
        final String password = "aedproject100";
      // Get the default Session object.
        Session session = Session.getDefaultInstance(properties, new Authenticator()
        {
             @Override
             protected PasswordAuthentication getPasswordAuthentication()
             {
                 return new PasswordAuthentication(senderEmailID, password);
             }
        });
      
       try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(senderEmailID));

         // Set To: header field of the header.
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));

         // Set Subject: header field
         message.setSubject("Appointment Confirmed:  #"+appointmentID+" for "+appointeeName);

         // Now set the actual message
         DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
  
        // Get the date using calendar object;
  
        // Convert the date into a
        // string using format() method
        String dateToString = df.format(dateOfAppointment); 
        dateToString = dateToString.substring(0, 10);
         message.setText("Hi, \nThis is a message on behalf of "+appointerName+". Your appointment has been confirmed"
                 + " on "+dateToString+" at "+time+"\n\n Please carry your medical card and arrive 15 minutes "
                         + "before your appointment. \n\n We appreciate your cooperation! Looking forwarding to seeing you!"
                         + "\n\n Thanks, \n "+appointerName);

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
    }
    
    public void SendEmailOfCOVIDTestResultToPatient(COVIDTest test)
    {
         // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
     properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.smtp.host", "smtp.gmail.com");
     properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
     properties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
     properties.put("mail.smtp.port", "587");
       
     
        final String senderEmailID = "aedprojectgroup@gmail.com";
        final String password = "aedproject100";
      // Get the default Session object.
        Session session = Session.getDefaultInstance(properties, new Authenticator()
        {
             @Override
             protected PasswordAuthentication getPasswordAuthentication()
             {
                 return new PasswordAuthentication(senderEmailID, password);
             }
        });
      
       try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(senderEmailID));

         // Set To: header field of the header.
         message.setRecipient(Message.RecipientType.TO, new InternetAddress(test.getPatient().getPatientEmailID()));

         // Set Subject: header field
         message.setSubject("COVID-19 Test Results for:  #"+test.getPatient().getPatientName());
  
        // Get the date using calendar object;
  
        // Convert the date into a
        // string using format() method
        if(test.getTestStatus() == 3)
        {
             message.setText("Hi, \nThis is a message on behalf of "+test.getTestingCentre().getTestingCentreName()+". Your COVID-19 Test done on "+test.getTime()+" has been found"
                 + " to be POSITIVE. \n\n We urge you to isolate and schedule an appointment with your Provider "
                         + "\n\n Please wear a mask if you step outside though we humbly request you not to"
                         + "\n\n Stay Home, Stay Safe \n "+test.getTestingCentre().getTestingCentreName());
        }
        else if(test.getTestStatus() == 2)
        {
             message.setText("Hi, \nThis is a message on behalf of "+test.getTestingCentre().getTestingCentreName()+". Your COVID-19 Test done on "+test.getTime()+" has been found"
                 + " to be NEGATIVE.\n\n Stay Home, Stay Safe \n "+test.getTestingCentre().getTestingCentreName());
        }

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
    }
}
