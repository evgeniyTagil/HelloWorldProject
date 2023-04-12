package lesson7.classwork.air;

public class Duck implements Flyable {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void flyWithSound() {
        System.out.println("Duck flying, kr kr");
    }

    @Override
    public void printMessage() {
        System.out.println("--- Duck message ---");
    }
}
