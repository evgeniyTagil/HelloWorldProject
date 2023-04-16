package lesson8.homework.ex2;

public class Surgeon implements Treatment { //Хирург

    @Override
    public void treat() {
        System.out.println("Выполняется лечение у хирурга" + '\n'
                + "Нужно ломать ногу!");
    }
}
