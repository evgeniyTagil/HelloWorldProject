package lesson3;

public class ForLoopClass {
    public static void main(String[] args) {

        //СЧЕТЧИКИ

//        for (int counter = 100; counter > 0; counter-- ) { // переменная начала счета; условие остановки; что делать
//            System.out.println("a" + counter);

//        for (int count = 0; count < 100; count++) { // 1)Счетчик кратных 2-м до 100
//            if (count%2 == 0) {
//                System.out.println(count);
//            }

//        for (int x = 0; x < 100; x += 2) {   // 2)Счетчик кратных 2-м до 100
//            System.out.println(x);
//        }

//        int count = 100;
//        while (count > 0) {
//            System.out.println("count: " + count--);
//        }
//
//        do {
//            System.out.println("count again: " + count++);
//        } while (count < 100);

//        int counter = 0;
//        while (counter < 100){
//            counter+=2;
//            System.out.println("couter: " + counter);
//        }
//        int counter = 0;
//        while (counter < 100) {
//            counter += 5;
//            System.out.println("couter: " + counter);
        for (int x = 0; x <= 100; x += 5){
            System.out.println(x);
            System.out.println(-x);
        }

    }
}