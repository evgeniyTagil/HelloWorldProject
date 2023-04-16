package lesson8.homework.ex2;

public class Dentist implements Treatment { //дантист

    @Override
    public void treat() {
        System.out.println("Выполняется лечение у дантиста" + '\n'
                + "Нужно менять зубы, с вас 100000$");
    }
}
