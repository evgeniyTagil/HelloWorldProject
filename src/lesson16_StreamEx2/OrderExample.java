package lesson16_StreamEx2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OrderExample {
    public static void main(String[] args) {


        List<Order> orders = getOrders();
        var result = orders
                .stream()
                .filter(isOrderWithEggs())
                .toList();

        System.out.println(result);

        var products = orders.stream()
                .flatMap(Order::getProductStream)
                .distinct()
                .map(Product::getProductName) //по именам
                .toList();//вывод продуктов без дубликатов

        System.out.println(products);


    }

    private static Predicate<Order> isOrderWithEggs() {
        return order -> order
                .getProducts()
                .stream()
                .anyMatch(containsEggs());
    }

    private static Predicate<Product> containsEggs() {
        return product -> product
                .getProductName()
                .equals("Eggs");
    }

    private static List<Order> getOrders() {
        List<Product> products = getSecondProducts();
        List<Product> secondProducts = getFirstProducts();
        List<Product> thirdProducts = getThirdProducts();
        return Arrays.asList(new Order(1, products),
                new Order(2, secondProducts),
                new Order(3, thirdProducts));
    }

    private static List<Product> getThirdProducts() {
        List<Product> thirdProducts = Arrays.asList(
                new Product("Meat", 60),
                new Product("Beer", 15),
                new Product("Fish", 55));
        return thirdProducts;
    }

    private static List<Product> getFirstProducts() {
        List<Product> secondProducts = Arrays.asList(
                new Product("Bread", 25),
                new Product("Eggs", 15),
                new Product("Apples", 10));
        return secondProducts;
    }

    private static List<Product> getSecondProducts() {
        List<Product> products = Arrays.asList(
                new Product("Milk", 20),
                new Product("Eggs", 15),
                new Product("Sugar", 10));
        return products;
    }
}
