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
    private String payerAddress;
    ArrayList<Service> listOfServicesCoveredUnderPayer;
}
