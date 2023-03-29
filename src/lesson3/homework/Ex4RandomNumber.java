package lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class Ex4RandomNumber {
    public static void main(String[] args) {
        System.out.println("Hello, guess the number from 1 to 5");

        Random random = new Random();
        int randomNumber = random.nextInt(5);

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == randomNumber) {
            System.out.println("You are right");
        } else {
            System.out.println("Not: " + userNumber);
        }
    }
}

