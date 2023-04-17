package lesson8.homework.ex2;

import java.util.Scanner;

public class TreatmentPlan {
    public static void treatmentPlan(){
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();
        Therapist therapist = new Therapist();
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        switch (userNum) {
            case 1 -> {
                System.out.println("...перенапровление к хирургу...");
                surgeon.treat();
            }
            case 2 -> {
                System.out.println("...перенапровление к дантисту...");
                dentist.treat();
            }
            case 3 -> {
                System.out.println("...перенапровение к терапевту...");
                therapist.treat();
            }
            default -> System.out.println("Завершение сеанса");
        }
    }
}
