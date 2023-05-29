package lesson13_Collections.homework;

import java.util.*;

public class ExerciseThree {
    public static void main(String[] args) {
        final String BERRY = "Ягода";
        final String VEGETABLE = "Овощ";
        final String FRUIT = "Фрукт";

        Map<String, List<String>> collection = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название категории продукта: ");
            System.out.println("Ягода | Овощ | Фрукт");
            String category = scanner.nextLine();
            if (category.equalsIgnoreCase(BERRY) || category.equalsIgnoreCase(VEGETABLE) || category.equalsIgnoreCase(FRUIT)) {
                System.out.println("Введите название продукта: ");
                String nameProducts = scanner.nextLine();
                List<String> products = collection.get(category);
                if (products == null) {
                    products = new ArrayList<>();
                    collection.put(category, products);
                }
                products.add(nameProducts);
            }else {
                System.out.println("Не коректный ввод!");
            }
        }
        System.out.println("Ягоды: " + collection.get("ягода"));
        System.out.println("Овощи: " + collection.get("овощ"));
        System.out.println("Фрукты: " + collection.get("фрукт"));
        System.out.println("Весь список: " + collection);
    }
}
