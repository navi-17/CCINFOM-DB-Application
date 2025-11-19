package view;

import controller.*;

public class ASMain{
    public static void main(String[] args){
        ASGui gui = new ASGui();
        PatientController patientController = new PatientController(gui);
        NurseController nurseController = new NurseController(gui);
        PhysicianController physicianController = new PhysicianController(gui);
        WardController wardController = new WardController(gui);
        IllnessController illnessController = new IllnessController(gui);
        MedicineController medicineController = new MedicineController(gui);
        DiagnosisController diagnosisController = new DiagnosisController(gui);
        NurseAssignmentController nurseAssignmentController = new NurseAssignmentController(gui);
        AdmissionController admissionController = new AdmissionController(gui);
        TreatmentController treatmentController = new TreatmentController(gui);
        DischargeController dischargeController = new DischargeController(gui);
<<<<<<< HEAD
=======
        SearchController searchController = new SearchController(gui);
>>>>>>> 9fe09b628216d5b2658392e6a7fc3de7564eb9b7
        CreateController createController = new CreateController(gui);
    }
}