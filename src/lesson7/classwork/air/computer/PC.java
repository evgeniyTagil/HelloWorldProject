package lesson7.classwork.air.computer;

public class PC extends Comp {//класс PC уноследовал все параметры у Comp


    public PC(String hdd, String ram, String userName) {
        super(hdd, ram, userName);
    }

    @Override
    public void printDisplay() {
        System.out.println("this is PC display");
    }
}
