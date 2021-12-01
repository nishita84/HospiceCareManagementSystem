/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Diagnosis;

import Business.Providers.Provider;
import Business.SetIDsForEnterprises;
import java.util.ArrayList;

/**
 *
 * @author architnigam
 */
public class DiagnosisDirectory {
    private ArrayList<Diagnosis> diagnosisList;

    public ArrayList<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(ArrayList<Diagnosis> diagnosisList) {
        this.diagnosisList = diagnosisList;
    }
    
     public Diagnosis createNewDiagnosis(String diagnosisCode, String diagnosisDescription, String ICDCode)
    {
        SetIDsForEnterprises setIDForEnterprises = new SetIDsForEnterprises();
        Diagnosis newDiagnosis = new Diagnosis();
        newDiagnosis.setDiagnosisCode(diagnosisCode);
        newDiagnosis.setDiagnosisDescription(diagnosisDescription);
        newDiagnosis.setIcdCode(ICDCode);
        diagnosisList.add(newDiagnosis);
        return newDiagnosis;
    }
    
    public Diagnosis updateDiagnosis(Diagnosis selectedDiagnosis)
    {
        diagnosisList.set(diagnosisList.indexOf(selectedDiagnosis), selectedDiagnosis);
        return selectedDiagnosis;
    }
    
    public void deleteDiagnosis(int indexOfSelectedRecord)
    {
        diagnosisList.remove(indexOfSelectedRecord);
    }
    
    public Diagnosis findDiagnosisByCode(String diagnosisCode, ArrayList<Provider> listOfDiagnosis)
    {
        for(Diagnosis diagnosis: diagnosisList)
        {
            if(diagnosis.getDiagnosisCode().equals(diagnosisCode))
            {
                return diagnosis;
            }
        }
        return null;
    }
}
