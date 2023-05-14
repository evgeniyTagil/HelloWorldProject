package lesson13.homework;

import java.util.*;

public class ExerciseThree {
    public static void main(String[] args) {
        Map<String, List<String>> collection = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите название категории продукта: ");
            System.out.println("Ягода | Овощ | Фрукт");
            String category = scanner.nextLine();
            System.out.println("Введите название продукта: ");
            String nameProducts = scanner.nextLine();
            List<String> products = collection.get(category);
            if (products == null) {
                products = new ArrayList<>();
                collection.put(category, products);
            }
            products.add(nameProducts);
        }
        System.out.println("Ягоды: " + collection.get("ягода"));
        System.out.println("Овощи: " + collection.get("овощ"));
        System.out.println("Фрукты: " + collection.get("фрукт"));
        System.out.println("Весь список: " + collection);
    }
}
