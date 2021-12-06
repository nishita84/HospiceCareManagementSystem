/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author architnigam
 */
public class AppConstants {
    
    
    // BMI Values
    
    public String BMI_SeverlyUnderweight = "Severely Underweight";
    public String BMI_Underweight = "Underweight";
    public String BMI_Normal = "Normal";
    public String BMI_Overweight = "Overweight";
    public String BMI_ModeratelyObese = "Moderately Obese";
    public String BMI_SeverlyObese = "Severely Obese";
    public String BMI_MorbidlyObese = "Morbidly Obese";
    
    // Blood Pressure Values
    
    public String BP_Normal = "Normal";
    public String BP_Elevated = "Elevated";
    public String BP_HighBloodPressureStage1 = "HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 1";
    public String BP_HighBloodPressureStage2 = "HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 2";
    public String BP_HyperTensiveCrisis = "HYPERTENSIVE CRISIS ";
    
    // Cholestrol Values
    
    public String Cholestrol_Desirable = "Desirable";
    public String Cholestrol_BorderlineHigh = "Borderline High";
    public String Cholestrol_High = "High";
    
    public String UnknownError = "UnknownError";
    
    // Messages
    public String PatientRecordSuccessfullySavedMessage = "Patient encounter record successfully saved: Below is the analysis -";
     public String PatientRecordSuccessfullyUpdatedMessage = "Patient encounter record successfully updated: Below is the analysis -";
    public String ErrorMessageAllFieldsNotFilled = "All fields are not filled! Ensure all fields are filled!";
    public String ErrorMessageAllFieldsAreNotNumeric = "MRN, Weight, Height, Cholestrol, Systole"
            + " and Diastole Readings need to have numeric values";
    public String ErrorMessageMRNNotFound1 = "The MRN '";
    public String ErrorMessageMRNNotFound2 = "' is not registered as a patient. Please register the MRN as "
            + "a patient before proceding";
    public String ErrorMessageUnauthorizedUserToRegisterPatients = "Logged in user not authorized to register patients";
    public String ErrorMessageUnauthorizedUserToRecordPatientData = "Logged in user not authorized to record patient data";
    public String ErrorMessageUnauthorizedUserToModifyPatientData = "Logged in user not authorized to modify patient data";
    public String ErrorMessageNoPatientsFound = "No patient found with MRN";
    public String ErrorMessageNoEncounterRecordsFound = "No encounter records found for patient with MRN";
    public String ErrorMessageEmptyFieldSearch = "Please enter a MRN before searching";
    public String ErrorMessageResidentIDEmptyFieldSearch = "Please enter a Resident ID before searching";
    public String ErrorMessageNoResidentsFound = "No residents found!";
    public String ErrorMessageResidentAlreadyAPatient = "This resident is already a patient!";
    public String DataSuccessfullySaved = "Past Encounter Records have been populated for analysis!";
    public String ErrorMessageForNoRowSelected = "No row selected! Please select a row!";
    public String UpdateSuccessful = "Patient encounter record successfully updated!";
    public String DeleteSuccessful = "Patient encounter record successfully deleted!";
    public String RegistrationOfAResidentAsAPatientSuccessful1 = "Resident with resident ID '";
    public String RegistrationOfAResidentAsAPatientSuccessful2 = "' has been successfully registered as a patient";
    public String TheMRN = "The MRN '";
    public String ErrorMessageForDuplicateVitalSigns = "' already has a vital sign logged in the system!"
            + " Click on Modify Patients tab to change vital signs for the corresponding MRN";
    public String ResidentAddedSuccessfullyMessage = "Resident Record added successfully with resident ID '";
    public String ErrorPatientIsAbove18YearsOfAge = "Patient should be above 18 years of age!";

    // File paths
    public String EncountersXMLFilePath = "/src/files/EncounterRecords.xml";
    public String ResidentXMLFilePath = "/src/files/ResidentRecords.xml";
    public String PathOfRegisteredPatientXMLFile = "/src/files/RegisteredPatients.xml";
    public String PathOfRegisteredUsersXMLFile = "/src/files/VerifiedUsers.xml";
    public String PathOfImageFile = "/src/files/logo.png";
    
    // XML Nodes
    public String nodePatient = "patient";
    public String nodeMRN = "mrn";
    public String nodeID = "id";
    public String nodeAge = "age";
    public String nodeWeight = "weight";
    public String nodeHeight = "height";
    public String nodeEthinicity = "ethinicity";
    public String nodeDistrict = "district";
    public String nodeDateOfVisit = "dateOfVisit";
    public String nodeSystoleReading = "systoleReading";
    public String nodeDiastoleReading = "diastoleReading";
    public String nodeCholestrolReading = "cholestrolReading";
    public String nodeFirstName = "firstname";
    public String nodeLastName = "lastname";
    public String nodeDateofBirth = "dateOfBirth";
    public String nodeCity = "city";
    public String nodeSSN = "ssn";
    public String nodeAddress = "address";
    public String nodeZipCode = "zipcode";
    public String nodeState = "state";
    public String nodeGender = "gender";
    public String nodeisResidentAPatient = "isResidentAPatient";
    public String nodeResidentID = "residentID";
    
    // Regular Expression
    public String RegularExpressionForNumericFields = "[0-9]+";
    public String AlternateRegexForNumberAndDecimals = "/^[+-]?([0-9]+\\.?[0-9]*|\\.[0-9]+)$/";
    
    // Look-up Values Ethnicity
    public String WhiteNonHispanic = "White, non-Hispanic";
    public String BlackNonHispanic = "Black, non-Hispanic";
    public String Hispanic = "Hispanic";
    public String Asian = "Asian";
    public String AmericanIndianOrAlaskaNative = "American Indian or Alaska Native";
    public String NativeHawaiian = "Native Hawaiian or Other Pacific Islander";
    
    // Districts
    public String Allston = "Allston";
    public String Fenway = "Fenway";
    public String BackBay = "Back Bay";
    public String BeaconHill = "Beacon Hill";
    public String NorthEnd = "North End";
    public String BayVillage = "Bay Village";
    public String Downtown = "Downtown";
    
    // Genders
    public String Male = "Male";
    public String Female = "Female";
    public String Other = "Other";
    
    // Age Groups
    public String AgeGroup1 = "18-30";
    public String AgeGroup2 = "31-45";
    public String AgeGroup3 = "46-60";
    public String AgeGroup4 = "61-75";
    public String AgeGroup5 = "75+";
    
}
