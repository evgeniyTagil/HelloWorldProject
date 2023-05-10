package lesson12.homework;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        System.out.println("--------------------------------");
        System.out.println("Hello, wot do you want:");
        System.out.println("Please, enter #1 for write document number");
        System.out.println("Enter #2 for read all numbers documents");
        System.out.println("Or 3 for exit");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        switch (userNum){
            case 1:
                DocumentWriter writer = new DocumentWriter();
                writer.writer();
                break;
            case 2:
                DocumentReader reader = new DocumentReader();
                reader.reader();
                break;
            case 3:
                System.out.println("Thanks, good bye!");
                break;
            default:
                break;
        }
    }
}
