/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospice;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class HospiceDirectory {
    private ArrayList<Hospice> hospiceList;
    
    public HospiceDirectory()
    {
        hospiceList = new ArrayList<Hospice>();
    }

    public ArrayList<Hospice> getListOfHospice() {
        return hospiceList;
    }

    public void setListOfHospice(ArrayList<Hospice> hospiceList) {
        this.hospiceList = hospiceList;
    }

    
    public Hospice createNewHospice(String hospiceID, String hospiceName, String hospiceAddress, String hospiceCity, String hospiceState, 
            String hospiceCountry, String hospiceContactNumber, String hospiceEmailID, String hospiceZipCode)
    {
        
        Hospice newHospice = new Hospice();
        newHospice.setHospiceID(hospiceID);
        newHospice.setHospiceName(hospiceName);
        newHospice.setHospiceAddress(hospiceAddress);
        newHospice.setHospiceCity(hospiceCity);
        newHospice.setHospiceState(hospiceState);
        newHospice.setHospiceCountry(hospiceCountry);
        newHospice.setHospiceZipCode(hospiceZipCode);
        newHospice.setHospiceEmailID(hospiceEmailID);
        newHospice.setHospiceContactNumber(hospiceContactNumber);
        newHospice.setTotalHospiceBalance(0.00);
        hospiceList.add(newHospice);
        return newHospice;
    }
    
    public Hospice updateHospice(Hospice selectedHospice)
    {
        hospiceList.set(hospiceList.indexOf(selectedHospice), selectedHospice);
        return selectedHospice;
    }
    
    public void deleteHospice(int indexOfSelectedRecord)
    {
        hospiceList.remove(indexOfSelectedRecord);
    }
    
    public Hospice findHospiceByID(String hospiceID, ArrayList<Hospice> listOfHospices)
    {
        for(Hospice hospice: listOfHospices)
        {
            if(hospice.getHospiceID().equals(hospiceID))
            {
                return hospice;
            }
        }
        return null;
    }
    
    public Hospice findHospiceByName(String hospiceName, ArrayList<Hospice> listOfHospices)
    {
        for(Hospice hospice: listOfHospices)
        {
            if(hospice.getHospiceName().equals(hospiceName))
            {
                return hospice;
            }
        }
        return null;
    }
    
     public Hospice findHospiceByEmailID(String hospiceEmailID, ArrayList<Hospice> listOfHospices)
    {
        for(Hospice hos: listOfHospices)
        {
            if(hos.getHospiceEmailID().equals(hospiceEmailID))
            {
                return hos;
            }
        }
        return null;
    }

}
