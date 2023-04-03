package lesson4.homework;

import java.util.Arrays;
import java.util.Random;

public class Ex3ComparisonAverageVal {
    public static void main(String[] args) {
        int[] arrayNumberOne = new int[5];
        int[] arrayNumberTwo = new int[5];
        Random randomNum = new Random();
        for (int i = 0; i < arrayNumberOne.length; i++) {
            arrayNumberOne[i] = randomNum.nextInt(50);
        }
        for (int i = 0; i < arrayNumberTwo.length; i++) {
            arrayNumberTwo[i] = randomNum.nextInt(50);
        }
        System.out.println("Массив №1 - " + Arrays.toString(arrayNumberOne));
        System.out.println("Массив №2 - " + Arrays.toString(arrayNumberTwo));
        System.out.println("\n");

        int sumOneArray = 0;
        for (int i = 0; i < arrayNumberOne.length; i++) {
            sumOneArray += arrayNumberOne[i];
        }
        float averageOneArray = sumOneArray / arrayNumberOne.length;
        System.out.println("Среднее значение массива №1 - " + averageOneArray);

        int sumTwoArray = 0;
        for (int i = 0; i < arrayNumberTwo.length; i++) {
            sumTwoArray += arrayNumberTwo[i];
        }
        float averageTwoArray = sumTwoArray / arrayNumberTwo.length;
        System.out.println("Среднее значение массива №2 - " + averageTwoArray);

        if (averageOneArray < averageTwoArray) {
            System.out.println("Среднее значение массива №2 - "
                    + averageTwoArray + " больше чем массива №1 - "
                    + averageOneArray);
        } else if (averageOneArray > averageTwoArray) {
            System.out.println("Среднее значение массива №1 - "
                    + averageOneArray + " больше чем массив №2 - "
                    + averageTwoArray);
        } else {
            System.out.println("Средние значения массива №1 и №2 равны между собой - "
                    + arrayNumberOne);
        }
    }
}
