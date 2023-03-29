package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Classwork {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2}; // массив содержащий цифры 0,1,2
        int[] arr2 = new int[5]; // новый массив размером 5
        System.out.println("third element " + arr[2]); //вывод элемента массива №1
        System.out.println("third element " + arr2[2]); // вывод элемента массива №2
        //arr2[2] = 10; // заполняем нужный нам элемент массива "[2]" нужным числом "= 10"
        System.out.println("third element " + arr2[2]); //вывод заполненного элемента нашим числом
        System.out.println("Arr length: " + arr.length); //длинна массива
        Random random = new Random();
        for (int i = 0; i < arr2.length; i++) { //заполняем массив пока длинна массива не закончится
            arr2[i] = random.nextInt(10); //случайные числа поместили в массив
            System.out.println("rr2[" + i + "] = " + arr2[i]); //просмотр заполненного масиива
            System.out.println("--------------------------------------------------");
        }


        //Ex1 заполнение массива от 1 до 10
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
            System.out.println("Arr3[" + i + "] = " + arr3[i]);
        }
        System.out.println("Arr3 in line: " + Arrays.toString(arr3));
        System.out.println("--------------------------------------------------");


        //Ex2 сумма значений массива
        int sum = 0;
        for (int val : arr3) {
            sum += val;
        }
        System.out.println(sum);
        System.out.println("--------------------------------------------------");


        //Ex3
        System.out.println("Arr2 in line: " + Arrays.toString(arr2)); //Сортировка массива Arrays.sort
        Arrays.sort(arr2);
        System.out.println("Arr2 отсартированный: " + Arrays.toString(arr2));

        System.out.println("--------------------------------------------------");


        //Ex4 Поиск самого большого элемента
        int result = -1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10);
            if (result < arr2[i]) {
                result = arr2[i];
            }
        }
        System.out.print(Arrays.toString(arr2));
        System.out.println(" - Самое большое значение " + result);
        System.out.println("--------------------------------------------------");


        //Ex5 Подстчет определленного значения в массиве (В нашем случае посчитать сколько раз встречается 2-ка в массиве)
        int value = 2;
        int counter = 0;
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = random.nextInt(10);
            if (arr4[i] == value) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(arr4));
        System.out.println(counter);
    }
}
