/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Agency;

/**
 *
 * @author architnigam
 */
public class Agency {
    private String countryName;
    private String agencyName;
    private double amountForEveryPatientAdmitted;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public double getAmountForEveryPatientAdmitted() {
        return amountForEveryPatientAdmitted;
    }

    public void setAmountForEveryPatientAdmitted(double amountForEveryPatientAdmitted) {
        this.amountForEveryPatientAdmitted = amountForEveryPatientAdmitted;
    }
}
