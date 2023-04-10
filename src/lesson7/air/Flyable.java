package lesson7.air;

public interface Flyable {
    void fly();

    void flyWithSound(); //нельзя писать реализацию

    default void printMessage() { //если default то можно
        System.out.println("this is non informative message");
    }
}