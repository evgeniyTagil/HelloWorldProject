package lesson14.homework;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int userNum = scanner.nextInt();
        Predicate<Integer> isDivided = (n) -> n % 13 == 0;
        System.out.println("Ваше число - " + userNum + "; Результат - " + isDivided.test(userNum));
    }
}
