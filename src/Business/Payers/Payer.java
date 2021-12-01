/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payers;

import Business.Services.Service;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class Payer {
    private String payerName;
    private String payerBillingAddress;
    ArrayList<Service> listOfServicesCoveredUnderPayer;

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayerBillingAddress() {
        return payerBillingAddress;
    }

    public void setPayerBillingAddress(String payerBillingAddress) {
        this.payerBillingAddress = payerBillingAddress;
    }

    public ArrayList<Service> getListOfServicesCoveredUnderPayer() {
        return listOfServicesCoveredUnderPayer;
    }

    public void setListOfServicesCoveredUnderPayer(ArrayList<Service> listOfServicesCoveredUnderPayer) {
        this.listOfServicesCoveredUnderPayer = listOfServicesCoveredUnderPayer;
    }
    
    
}
