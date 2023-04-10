package lesson7.air;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is fly");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Airplane is fly, fsfsfsffsf");
    }
}