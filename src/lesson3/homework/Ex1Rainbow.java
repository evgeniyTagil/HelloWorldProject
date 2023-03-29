package lesson3.homework;

import java.util.Scanner;

public class Ex1Rainbow {
    public static void main(String[] args) {
        System.out.println("Write your number");
        Scanner scanner = new Scanner(System.in);
        int rainbow = scanner.nextInt();
        switch (rainbow) {
            case 1: System.out.println("This is red color");
                break;
            case 2: System.out.println("This is orange color");
                break;
            case 3: System.out.println("This is yellow color");
                break;
            case 4: System.out.println("This is green color");
                break;
            case 5: System.out.println("This is blue color");
                break;
            case 6: System.out.println("This purple color");
                break;
            default: {
                System.out.println("Please enter a valid number from 1 to 6");
        }
        }
    }
}
