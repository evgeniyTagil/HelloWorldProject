package lesson5;

import java.util.Arrays;
import java.util.Random;

public class Classwork {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[][] arr2 = new int[10][10];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(arr2)); //способ печати 2-го массива №1

        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(" arr[i][j] = " + arr2[i][j]);
            }
            System.out.println(); //способ печати 2-го массива №2
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        int[][] arr3 = new int[4][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i + 1];
            Arrays.fill(arr3[i], i + 1);
        }
        System.out.println(Arrays.deepToString(arr3)); //зубчатый массив

        System.out.println("-----------------------------------------------------------------------------------------");

        Random random = new Random();
        int[][] arr5 = new int[5][5];
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5.length; j++) {
                arr5[i][j] = random.nextInt(100);
                System.out.print(" " + arr5[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr5));

        System.out.println("-----------------------------------------------------------------------------------------");

        int[] array = new int[5];
        int[] newArray = new int[5];
        array[0] = 5;
        newArray[3] = 10;
        System.out.println(Arrays.equals(array, newArray)); //сравнение массивов
        System.out.println(Arrays.compare(array, newArray)); //compare

        System.out.println("-----------------------------------------------------------------------------------------");

        int[][][] superArr = new int[11][11][11];
        for (int i = 0; i < superArr.length; i++) {
            for (int j = 0; j < superArr[i].length; j++) {
                for (int k = 0; k < superArr[i][j].length; k++) {
                    superArr[i][j][k] = random.nextInt(10);
                    System.out.print(" arr[i][j][k] = " + superArr[i][j][k] + ";");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();

        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        int[][] result = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array1[i][j] = random.nextInt(7);
                array2[i][j] = random.nextInt(7);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                result[i][j] = array1[i][j] * array2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));
        System.out.println();
        System.out.println(Arrays.deepToString(result));
    }
}
