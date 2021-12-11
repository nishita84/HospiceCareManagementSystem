/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Email;

import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 *
 * @author architnigam
 */
public class Email {
    
    
    public void SendEmailOfAppointment(String senderEmailID, String receipent)
    {
        // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();

      // Setup mail server
     properties.setProperty("mail.smtp.host", "10.101.3.229");
     properties.setProperty("mail.smtp.port", "8080");

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties);
      
       try {
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(senderEmailID));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(receipent));

         // Set Subject: header field
         message.setSubject("Mail sent using Java Swing");

         // Now set the actual message
         message.setText("This is actual message");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
    }
}
