/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payers;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class PayersDirectory {
    private ArrayList<Payer> listOfPayers;
    
    public PayersDirectory()
    {
        listOfPayers = new ArrayList<Payer>();
    }

    public ArrayList<Payer> getListOfPayers() {
        return listOfPayers;
    }

    public void setListOfPayers(ArrayList<Payer> listOfPayers) {
        this.listOfPayers = listOfPayers;
    }
    
     public Payer createPayer(String payerID, String payerName, String payerAddress, String payerEmailID) {

            Payer newPayer = new Payer();
            newPayer.setPayerID(payerID);
            newPayer.setPayerName(payerName);
            newPayer.setPayerBillingAddress(payerAddress);
            newPayer.setPayerEmailID(payerEmailID);
            listOfPayers.add(newPayer);
            return newPayer;
    }
    
    public Payer updatePayer(Payer selectedPayer)
    {
        listOfPayers.set(listOfPayers.indexOf(selectedPayer), selectedPayer);
        return selectedPayer;
    }
    
    public void deletePayer(int indexOfSelectedRecord)
    {
        listOfPayers.remove(indexOfSelectedRecord);
    }
    
    public Payer findPayerByID(String payerID, ArrayList<Payer> listOfPayers)
    {
        for(Payer payer: listOfPayers)
        {
            if(payer.getPayerID().equals(payerID))
            {
                return payer;
            }
        }
        return null;
    }
    
    public Payer findPayerByEmailID(String payerEmailID, ArrayList<Payer> listOfPayers)
    {
        for(Payer payer: listOfPayers)
        {
            if(payer.getPayerEmailID().equals(payerEmailID))
            {
                return payer;
            }
        }
        return null;
    }
    
    public Payer findPayerByName(String payerName, ArrayList<Payer> listOfPayers)
    {
        for(Payer payer: listOfPayers)
        {
            if(payer.getPayerName().equals(payerName))
            {
                return payer;
            }
        }
        return null;
    }
}
