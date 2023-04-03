package lesson4.homework;

import java.util.Random;
import java.util.Scanner;

public class Ex0ArraySearcher {
    public static void main(String[] args) {
        System.out.println("Please, write you number: ");
        int arNumber = 0;
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            arNumber = array[i];
        }
        Scanner userNumber = new Scanner(System.in);
        int counter = 3;
        while (counter > 0) {
            if (userNumber.nextInt() == arNumber) {
                System.out.println("You right, number - " + arNumber);
                break;
            } else {
                counter--;
                System.out.println("Your number is not correct, correct number is - " + arNumber +
                        ", attempts left - " + counter);
                if (counter == 0){
                    System.out.println("The attempts are over :(. Good luck!");
                }else {
                    System.out.println("Try again: ");
                }
            }
        }
    }
}

