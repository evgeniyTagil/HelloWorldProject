package lesson9;

public class Surgeon implements Doctor{
    @Override
    public void heal() {
        System.out.println("Lets break some bones");
    }
}
