package lesson5.homework;

import java.util.Scanner;

public class Ex1ChangeArray {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        System.out.println("Массив до изменения: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = i + j + k;
                    System.out.print(" Array[i][j][k] = " + array[i][j][k] + ";");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение на которое хотите увеличить массив: ");
        int userNum = scanner.nextInt();
        System.out.println("Массив после изменения: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = userNum + array[i][j][k];
                    System.out.print(" Array[i][j][k] = " + array[i][j][k] + ";");
                }

            }
            System.out.println();
        }
    }
}
