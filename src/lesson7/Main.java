package lesson7;

import lesson7.air.Airplane;
import lesson7.air.Duck;
import lesson7.air.Flyable;
import lesson7.computer.Comp;
import lesson7.computer.Laptop;
import lesson7.computer.PC;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("a", "b", "c", "Arkasha");
        laptop.setHdd("10");
        PC pc = new PC("a", "b", "Prostokvasha");
        pc.setHdd("20");

        // Comp comp = new Comp("A","B","Prostokvasha");

        Comp myBestComp = new Laptop("x", "y", "z", "Test Name");

        System.out.println(myBestComp);

        // System.out.println(laptop);
        System.out.println("--------------------------");
        Airplane airplane = new Airplane();
        airplane.fly();
        airplane.flyWithSound();
        airplane.printMessage();
        System.out.println("--------------------------");
        Duck duck = new Duck();
        duck.fly();
        duck.flyWithSound();
        duck.printMessage();
        System.out.println("--------------------------");

        Flyable[] flyItems = getFlyables();
        for (Flyable flyable: flyItems) {
            flyable.flyWithSound();
        }
    }

    private static Flyable[] getFlyables() {
        Flyable[] flyItems = new Flyable[4];
        flyItems[0] = new Duck();
        flyItems[1] = new Airplane();
        flyItems[2] = new Duck();
        flyItems[3] = new Airplane();
        return flyItems;
    }
}