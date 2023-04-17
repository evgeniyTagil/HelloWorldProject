package lesson9;

public class Therapist implements Doctor{
    @Override
    public void heal() {
        System.out.println("What is your name? Take your medicine");
    }
}
