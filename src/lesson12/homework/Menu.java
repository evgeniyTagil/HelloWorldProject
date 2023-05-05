package lesson12.homework;

import java.util.Scanner;

public class Menu {
    public static void menu(){
        System.out.println("Hello, press 1 if you want to write the document or 2 if you want to read the content");
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
            default:
                menu();
                break;
        }
    }

}
