package lesson6;

public class MainClass {
    public static void main(String[] args) {
//        Car myBmw = new Car();     // new Car() - создание конструктора(пустой, или по умолчанию)
//        myBmw.colour = "Green";
//        myBmw.age = 2023;
//        myBmw.brand = "BMW";
//        System.out.println(myBmw.brand);
//        System.out.println(myBmw.age);
//        System.out.println(myBmw.colour);
//        System.out.println(myBmw.wheelNumber);

        Car myNewBmw = new Car("Blue",2023,"BMW",4,true,"Auto");
        System.out.println(myNewBmw.getColour());
        myNewBmw.setColour("Black-Metal");
        System.out.println(myNewBmw.getColour());
        System.out.println(myNewBmw);

        myNewBmw.startDriving();
        myNewBmw.changeSpeed(10);
        myNewBmw.goDirectly();
        myNewBmw.changeSpeed(50);
        myNewBmw.changeSpeed(-30);
        myNewBmw.switchDirection(true);
        myNewBmw.goDirectly();
        myNewBmw.changeSpeed(30);
        myNewBmw.switchDirection(false);
        myNewBmw.sound();
        myNewBmw.changeSpeed(-60);
    }
}
