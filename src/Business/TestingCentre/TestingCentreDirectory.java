/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestingCentre;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class TestingCentreDirectory {
    private ArrayList<TestingCentre> listOfTestingCentre;
    
    public TestingCentreDirectory()
    {
        listOfTestingCentre = new ArrayList<TestingCentre>();
    }

    public ArrayList<TestingCentre> getListOfTestingCentre() {
        return listOfTestingCentre;
    }

    public void setListOfTestingCentre(ArrayList<TestingCentre> listOfTestingCentre) {
        this.listOfTestingCentre = listOfTestingCentre;
    }
    
    public TestingCentre addNewTestingCentre(String testCentreID, String testCentreName, String testCentreAddress, 
            String testCentreCity, String testCentreState, String testCentreZipCode, String testCentreEmailID)
    {
        TestingCentre testingCentre = new TestingCentre();
        testingCentre.setTestingCentreID(testCentreID);
        testingCentre.setTestingCentreName(testCentreName);
        testingCentre.setTestingCentreState(testCentreName);
        testingCentre.setTestingCentreAddress(testCentreAddress);
        testingCentre.setTestingCentreCity(testCentreCity);
        testingCentre.setTestingCentreState(testCentreState);
        testingCentre.setTestingCentreZipCode(testCentreZipCode);
        testingCentre.setTestingCentreEmailID(testCentreEmailID);
        listOfTestingCentre.add(testingCentre);
        return testingCentre;
    }
    
    public TestingCentre findTestingCentreByEmailID(String testingCentreEmailID, ArrayList<TestingCentre> listOfTestingCentres)
    {
        for(TestingCentre testCentre : listOfTestingCentres)
        {
            if(testCentre.getTestingCentreEmailID().equals(testingCentreEmailID))
            {
                return testCentre;
            }
        }
        return null;
    }
    
    public TestingCentre findTestingCentreByName(String testingCentreName, ArrayList<TestingCentre> listOfTestingCentres)
    {
        for(TestingCentre testCentre : listOfTestingCentres)
        {
            if(testCentre.getTestingCentreName().equals(testingCentreName))
            {
                return testCentre;
            }
        }
        return null;
    }
    
}
