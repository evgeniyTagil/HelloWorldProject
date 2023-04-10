package lesson7.computer;

import lesson7.computer.Comp;

public class Laptop extends Comp { //класс Laptop уноследовал все параметры у Comp


    public Laptop(String hdd, String ram, String touchpad, String userName) {
        super(hdd, ram, userName); //конструктор класса родителя
        this.touchpad = touchpad; //У этого класса есть поле
    }

    private String touchpad;

    public String getTouchpad() {
        return touchpad;
    }

    public void setTouchpad(String touchpad) {
        this.touchpad = touchpad;
    }

    @Override
    public void printDisplay() {
        System.out.println("this is laptop display");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "touchpad='" + touchpad + '\'' +
                "} " + super.toString();
    }
}
