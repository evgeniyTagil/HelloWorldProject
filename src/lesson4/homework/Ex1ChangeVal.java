package lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Ex1ChangeVal {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Добрый день!");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Вот что содержит массив сейчас: " + Arrays.toString(array));
        System.out.println("Выберите число которое хотите заменить: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] == userNumber.nextInt()) {
                    array[i] = 0;
                    System.out.println("Вот измененный массив - " + Arrays.toString(array));
                    break;
                }else{
                    System.out.println("Не корректный ввод");
                }
            }
    }
}
