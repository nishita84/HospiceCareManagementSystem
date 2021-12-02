/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Services;

import Business.Providers.Provider;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class ServicesDirectory {
    ArrayList<Service> listOfServices;
    
    public ServicesDirectory(){
          listOfServices = new ArrayList<Service>();
        }

    public ArrayList<Service> getServicesList() {
        return listOfServices;
    }

    public void setServicesList(ArrayList<Service> listOfServices) {
        this.listOfServices = listOfServices;
    }
    
    public Service createService(String svcCode, String svcDescription, double svcCostPerUnit, 
            Provider serviceProvider){
        
        Service newService = new Service();
        newService.setServiceCode(svcCode);
        newService.setServiceDescription(svcDescription);
        newService.setServiceCostPerUnit(svcCostPerUnit);
        newService.setServiceProvider(serviceProvider);
        listOfServices.add(newService);
        return newService;
    }
}
