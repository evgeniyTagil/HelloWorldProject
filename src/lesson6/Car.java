package lesson6;

public class Car {
    // 1) Признаки:
    //цвет машины,год машины, марка машины, двигатель,
    //кузов, есть-ли магнитола, коробка передач
    private String colour;
    private int age;
    private String brand;
    private int wheelNumber = 4;
    private boolean isRadioPresent = true;
    private String korobka = "Auto";

    private int currentSpeed = 0;

    {
        age = 999999999;  //это "блок"
    }

    public Car(String colour, int age, String brand, int wheelNumber, boolean isRadioPresent, String korobka) {
        this.colour = colour;
        this.age = age;
        this.brand = brand;
        this.wheelNumber = wheelNumber;
        this.isRadioPresent = isRadioPresent;
        this.korobka = korobka;
    }
    public Car(String colour, int age, String brand) {
        this.colour = colour;
        this.age = age;
        this.brand = brand;
    }
    public Car() { //пустой конструктор(без параметров)
    }

    @Override
    public String toString() {
        return "Car: " +
                "colour = '" + colour + '\'' +
                "; age = " + age +
                "; brand = '" + brand + '\'' +
                "; wheelNumber = " + wheelNumber +
                "; isRadioPresent = " + isRadioPresent +
                "; korobka = '" + korobka + '\'';
    }

    // 2) Действие/методы - завестись, подать сигнал, поехать вперед,
    //повернуть (влево/вправо), ускорится, замедлится

    public void startDriving(){            //метод
        System.out.println("woof-woof");
    }

    public void sound(){
        System.out.println("beep-beep");
    }

    public void goDirectly(){
        System.out.println("my car is going!");
    }

    public void switchDirection(boolean isRightOne){
        if (currentSpeed > 30){
            System.out.println("!It is too dangerous to switch direction!");
        }
        if (isRightOne){
            System.out.println("We are moving to right direction");
        }else {
            System.out.println("We are moving to left direction");
        }
    }

    public void changeSpeed(int speedChange){
        currentSpeed = currentSpeed + speedChange;
        if (speedChange > 0){
            System.out.println("We are moving faster, our speed " + currentSpeed);
        }else {
            System.out.println("We are moving slower, our speed " + currentSpeed);
        }
        if (currentSpeed <=0){
            System.out.println("We finished our trip");
        }
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getBrand() {
        return brand;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isRadioPresent() {
        return isRadioPresent;
    }

    public void setRadioPresent(boolean radioPresent) {
        isRadioPresent = radioPresent;
    }

    public String getKorobka() {
        return korobka;
    }

    public void setKorobka(String korobka) {
        this.korobka = korobka;
    }

}