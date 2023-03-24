import java.util.Scanner;

public class HelloHomeWork {
    public static void main(String[] args) {
        System.out.println("This is my second HomeWork!");
        System.out.println("Message: ");
        Scanner scanner = new Scanner(System.in);
        String userMessage = scanner.nextLine();
        System.out.println("Your message: " + userMessage);
    }
}
