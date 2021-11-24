/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Services;

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
    
    public Service createService(){
        
        Service svc = new Service();
        // Setters
        return svc;
    
    }
}
