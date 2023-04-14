package lesson8.homework.ex1;

public class Phone {
    private String name;
    private int number;
    private String model;
    private int weight;

    public String receiveCall() {
        return "{Звонит {" + getName() + "}" + " "
                + getNumber() + " " + getModel() + "}";
    }

    public String receiveCall(String name, int number) {
        return "Звонит: " + name + "; Номер - " + number;
    }

    public Phone(String name, int number, String model, int weight) {
        this(number, model);
        this.name = name;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

}
