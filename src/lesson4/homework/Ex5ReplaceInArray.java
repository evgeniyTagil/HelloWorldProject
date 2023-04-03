package lesson4.homework;

import java.util.Arrays;
import java.util.Random;

public class Ex5ReplaceInArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int num = 2;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(33);
        }
        System.out.println("Массив до замены - " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % num != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Массив после замены - " + Arrays.toString(array));
    }
}
