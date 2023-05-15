package lesson14;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add((new Fruit("Banana", 20, "Yellow")));
        fruits.add((new Fruit("Apple", 10, "Red")));
        fruits.add((new Fruit("Plume", 5, "Violet")));
        fruits.add((new Fruit("Peach", 25, "Yellow")));
        fruits.add((new Fruit("Banana", 25, "Yellow")));
        Collections.sort(fruits, (a,b) -> a.getName().length() - b.getName().length());
        Collections.sort(fruits, Comparator.comparingInt(fruit -> fruit.getName().length()));
        System.out.println(fruits);

        MyBestInterface myBestInterface = () -> {
            System.out.println("Hello world");
        };
        myBestInterface.test();

        Supplier<Integer> myRandomSupplier = () -> new Random().nextInt(5);
        System.out.println(getOneFruit(fruits,myRandomSupplier));
        System.out.println(getOneFruit(fruits,myRandomSupplier));
        System.out.println(getOneFruit(fruits, () -> 0));
        System.out.println(getOneFruit(fruits, () -> fruits.size()-1));

        Supplier<Integer> myNotBananaSupplier = () -> getNotBananaPosition(fruits);
        System.out.println(getOneFruit(fruits,myNotBananaSupplier));

        Function<Fruit,String> getNameFunction = fruit -> fruit.getName();
        Function<Fruit,String> getShortNameFunction = fruit -> fruit.getName().substring(0,2);
        Function<Fruit,String> getSizeFunction = fruit -> fruit.getWeight() < 10 ? "Small" : "Big";
    }

    private static List<String> convertFruits(List<Fruit> fruits, Function<Fruit, String> converter){
        List<String> result = new ArrayList<>();
        for (Fruit fruit: fruits){
            result.add(converter.apply(fruit));
        }
        return result;
    }

    private static int getNotBananaPosition(List<Fruit> fruits) {
        int position = new Random().nextInt(5);
        while (fruits.get(position).getName().equals("Banana")){
            position = new Random().nextInt(5);
        }
        return position;
    }

    private static Fruit getOneFruit(List<Fruit> fruits, Supplier<Integer> positionSupplier){
        return fruits.get(positionSupplier.get());
    }
}
