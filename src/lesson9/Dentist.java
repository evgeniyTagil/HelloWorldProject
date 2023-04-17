package lesson9;

public class Dentist implements Doctor{
    @Override
    public void heal() {
        System.out.println("How many teeth do ypu have? Lets reduce the number");
    }
}
