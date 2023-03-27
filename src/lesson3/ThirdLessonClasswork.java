package lesson3;

import java.util.Scanner;

public class ThirdLessonClasswork {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int myParam = scanner.nextInt();
//        if (myParam > 5) {
//            System.out.println("myParam is greater than 5!");
//            if (myParam > 100){
//                System.out.println("Oh, it is too much");
//            }
//        } else if (myParam > 3) {
//            System.out.println("myParam is greater than 3!");
//        } else {
//            System.out.println("myParam is not greater than 3!");
//        }
        Scanner newScanner = new Scanner(System.in);
//        int temp = newScanner.nextInt();
//        if (temp >= 20) {
//            System.out.println("Hot");
//        } else if (temp > 5) {
//            System.out.println("warm");
//        } else if (temp < 5) {
//            if (temp > -100) {
//                System.out.println("cold");
//            }
//        }
//        String result = (temp >= 20) ? "hot2" : (temp >= 5) ? "warm2" : "cold2"; // Тернарный оператор
//        System.out.println(result);

        int month  = newScanner.nextInt();
        switch (month) {
            case 12: case 1: case 2:
                System.out.println("this is winter");
                break;
            case 3: case 4: case 5:
                System.out.println("this is spring");
                break;
            case 6 : case 7: case 8:
                System.out.println("this is summer");
                break;
            case 9: case 10: case 11:
                System.out.println("this is autumn");
                break;
            default:
                System.out.println("this is not mount number");
        }
    }
}

