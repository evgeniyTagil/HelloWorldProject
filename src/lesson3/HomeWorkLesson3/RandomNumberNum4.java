package lesson3.HomeWorkLesson3;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberNum4 {
    public static void main(String[] args) {
        System.out.println("Hello, guess the number from 1 to 5");

        Random random = new Random();
        int randomNumber = random.nextInt(5);

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == randomNumber) {
            System.out.println("Try");
        } else {
            System.out.println("Not: " + userNumber);
        }
    }
}

