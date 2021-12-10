/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Forms;

import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class NurseVisitationFormsDirectory {
    private ArrayList<NurseVisitationAssessment> listOfNurseVisitForms;
    
    public NurseVisitationFormsDirectory()
    {
        listOfNurseVisitForms = new ArrayList<NurseVisitationAssessment>();
    }

    public ArrayList<NurseVisitationAssessment> getListOfNurseVisitForms() {
        return listOfNurseVisitForms;
    }

    public void setListOfNurseVisitForms(ArrayList<NurseVisitationAssessment> listOfNurseVisitForms) {
        this.listOfNurseVisitForms = listOfNurseVisitForms;
    }
    
    public NurseVisitationAssessment createNewVisitationAssessment()
    {
        NurseVisitationAssessment nurseForm = new NurseVisitationAssessment();
        return nurseForm;
    }
}
