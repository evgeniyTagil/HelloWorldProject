package lesson8;

public class MainExample {
    public static void main(String[] args) {
        Parent badParent = new Child();
        final int myInt;
        myInt = 12;
        badParent.setName("Tom");
        System.out.println(badParent.getName());

        BadParent superBadParent = new BadParent();
        Personable personable = new BadParent();
    }
}
