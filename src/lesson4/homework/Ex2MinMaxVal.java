package lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex2MinMaxVal {
    public static void main(String[] args) {
        System.out.println("Выберите размерность необходимую для массива: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random randomNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(50);
        }
        System.out.println("Массив заполненный случайными значениями: " + Arrays.toString(array));
        Arrays.sort(array);
        int minVal = array[0];
        System.out.println("Минимальное значение - " + minVal);
        int maxVal = array[array.length - 1];
        System.out.println("Максимальное значение - " + maxVal);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        float averageVal = sum / array.length;
        System.out.println("Среднее значение в массиве - " + averageVal);

    }
}
