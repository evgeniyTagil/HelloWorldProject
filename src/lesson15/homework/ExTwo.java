package lesson15.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {
        Students arkadiy = new Students("Arkadiy");
        Students vitaliy = new Students("Vitaliy");
        Students nikita = new Students("Nikita");
        Students vasiliy = new Students("Vasiliy");
        Students evgeniy = new Students("Evgeniy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter student name: ");
        String userStr = scanner.nextLine();

        List<Students> list = Arrays.asList(arkadiy, vitaliy, nikita, vasiliy, evgeniy);

        long result = list.stream().filter(p -> p.getName().equalsIgnoreCase(userStr)).count();
        if (result != 0) {
            System.out.println("Количество людей с таким имененм: " + result);
        } else {
            System.out.println("Нет такого человека");
        }

        System.out.println("------------");
        List<Students> newResult = list;
        System.out.println(newResult.stream().filter(p -> p.getName().startsWith("A", 0)).toList());
        System.out.println(newResult);

    }
}
