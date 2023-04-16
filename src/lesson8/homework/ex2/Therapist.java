package lesson8.homework.ex2;

public class Therapist implements Treatment { //терапевт

    @Override
    public void treat() {
        System.out.println("Выполняется лечение у терапевта" + '\n'
                + "Пропейте курс угля!");
    }
}
