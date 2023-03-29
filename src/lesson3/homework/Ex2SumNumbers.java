package lesson3.homework;

import java.util.Scanner;

public class Ex2SumNumbers {
    public static void main(String[] args) {
        System.out.println("Please write number: ");

        Scanner scanner = new Scanner(System.in);
        int scanerNumber = scanner.nextInt();

        int resultFor = 0;
        if (scanerNumber <= 100) {
            for (int i = 1; i <= scanerNumber; i++) {
                resultFor += i;
            }
            System.out.println("Your sum: " + resultFor);
        } else {
            System.out.println("Your number is not correct, please write number < 100");
        }
    }
}
