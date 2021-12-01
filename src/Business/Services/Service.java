/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Services;

/**
 *
 * @author architnigam
 */
public class Service {
    private String serviceCode;
    private String serviceDescription;
    private double serviceCostPerUnit;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Double getServiceCostPerUnit() {
        return serviceCostPerUnit;
    }

    public void setServiceCostPerUnit(Double serviceCostPerUnit) {
        this.serviceCostPerUnit = serviceCostPerUnit;
    }
}
