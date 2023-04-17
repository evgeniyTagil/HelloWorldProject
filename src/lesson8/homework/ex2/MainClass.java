package lesson8.homework.ex2;


public class MainClass {
    public static void main(String[] args) {
        Patient ivan = new Patient("Ivan");
        menu(ivan);
    }

    public static void menu(Patient patient){
        System.out.println("Добро пожаловать " + patient.getName() + " выберите интересующего вас врача: ");
        System.out.println("1 - что-бы отправится на лечение к Хирургу");
        System.out.println("2 - что-бы отправится на лечение к Дантисту");
        System.out.println("3 - что-бы отправится на лечение к Терапевту");
        System.out.println("4 - для завершения работы.");
        TreatmentPlan.treatmentPlan();
    }
}
