package lesson8;

public class Parent {

    protected String value = "33";

    public Parent(){
        System.out.println("This is my default constructor");
    }
    private String name;

    public String getName() {
        return name;
    }

    /**
     * this method........
     * @param name - имя
     */
    public void setName(String name) {
        this.name = name;
    }
}
