/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Diagnosis;

/**
 *
 * @author architnigam
 */
public class Diagnosis {
    private String diagnosisCode;
    private String diagnosisDescription;
    private String ICDCode; 

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getDiagnosisDescription() {
        return diagnosisDescription;
    }

    public void setDiagnosisDescription(String diagnosisDescription) {
        this.diagnosisDescription = diagnosisDescription;
    }

    public String getIcdCode() {
        return ICDCode;
    }

    public void setIcdCode(String ICDCode) {
        this.ICDCode = ICDCode;
    }
}
