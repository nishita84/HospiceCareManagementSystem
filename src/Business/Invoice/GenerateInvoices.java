/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class GenerateInvoices {
    
    public void GenerateDonationInvoice(String donationID, String donorName, String donationAmount, 
            String hospiceDonatedTo, Date timeOfDonation)
    {
        String projectPath = System.getProperty("user.dir");
        try{
            File invoiceFile = new File(projectPath + "/src/Invoices/"+donationID+".txt");
            FileWriter myWriter = new FileWriter(invoiceFile);
            myWriter.write("-------------------- INVOICE FOR DONATION ------------------------");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("-------------------Donation ID: "+donationID+"");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("-------------------Donor Name: "+donorName+"");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("-------------------Donation Amount: $"+donationAmount+"");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("-------------------Hospice: "+hospiceDonatedTo+"");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("-------------------Date/Time of Donation: "+String.valueOf(timeOfDonation)+"");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("\n");
            myWriter.write("------------------THIS IS AN OFFICIAL RECEIPT OF TRANSACTION, PLEASE PRESERVE THIS COPY FOR DIGITAL RECORDS----------------");
            myWriter.close();
        }
        catch(Exception ex){
            
        }
    }
}
