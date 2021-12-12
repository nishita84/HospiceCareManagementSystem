/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.COVID;

import Business.Patients.Patient;
import Business.SetIDsForWorkflows;
import Business.TestingCentre.TestingCentre;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author architnigam
 */
public class COVIDTestsDirectory {
    private ArrayList<COVIDTest> listOfCOVIDTest;
    
    public COVIDTestsDirectory()
    {
        listOfCOVIDTest = new ArrayList<COVIDTest>();
    }

    public ArrayList<COVIDTest> getListOfCOVIDTest() {
        return listOfCOVIDTest;
    }

    public void setListOfCOVIDTest(ArrayList<COVIDTest> listOfCOVIDTest) {
        this.listOfCOVIDTest = listOfCOVIDTest;
    }
    
    public COVIDTest scheduleANewCOVIDTest(Patient patient, TestingCentre testingCentre, 
            Date dateOfAppointment, String timeOfAppointment)
    {
        COVIDTest covidTest = new COVIDTest();
        SetIDsForWorkflows setIDForWorkflow = new SetIDsForWorkflows();
        covidTest.setCOVIDTestID(setIDForWorkflow.SetIDForCOVIDTest());
        covidTest.setPatient(patient);
        covidTest.setTestStatus(0);
        covidTest.setDateOfAppointment(dateOfAppointment);
        covidTest.setTime(timeOfAppointment);
        covidTest.setTestingCentre(testingCentre);
        listOfCOVIDTest.add(covidTest);
        return covidTest;
    }
    
     public COVIDTest updateCOVIDTest(COVIDTest selectedCOVIDTest)
    {
        listOfCOVIDTest.set(listOfCOVIDTest.indexOf(selectedCOVIDTest), selectedCOVIDTest);
        return selectedCOVIDTest;
    }
}
