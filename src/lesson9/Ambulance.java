package lesson9;

import java.util.Arrays;
import java.util.Random;

public class Ambulance {
    public static void main(String[] args) {
        //1 - создать поциентов
        Patient[] patients = getPatients();
        for (Patient patient : patients) {
            //2 - прописать им план лечения
            setMedicalPlan(patient);
            //3 - выделить доктора
            Doctor doctor = getDoctorToPatient(patient);
            //4 - вылечить
            doctor.heal();

        }
    }

    private static void setMedicalPlan(Patient patient) {
        if (patient.getName() == null) {
            patient.setMedicalPlan(1);
        } else {
            Random random = new Random();
            patient.setMedicalPlan(random.nextInt(3));
        }
    }


    private static Doctor getDoctorToPatient(Patient patient) {
        if (patient.getMedicalPlan() == 1) return new Therapist();
        if (patient.getMedicalPlan() == 2) return new Dentist();
        return new Surgeon();
    }

    private static Patient[] getPatients() {
        Patient[] patients = new Patient[2];
        patients[0] = new Patient("Vasya Pupkin", 23);
        patients[1] = new Patient();
        return patients;
    }
}