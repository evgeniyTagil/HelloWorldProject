package lesson16_StreamEx2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.getOrDefault("1", "null"); //ищем по ключу, если нашли вернули по значению 1, если нет default
        myMap.putIfAbsent("a", "abc"); //проверяет по ключу, если там есть значение ничего не запишет, если нету - запишет

        System.out.println("------------------------------");

        MyBestInterface intStr = str -> str.substring(0, 2); //функциональный интерфейс
        System.out.println(intStr.test("abc"));

        System.out.println("------------------------------");

        List<Integer> testValue = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2);
        Map<Integer, Long> result = testValue.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //групирет, Function.identity() - лзначает число,ollectors.counting() - считает сколько раз
        System.out.println(result);

        System.out.println("------------------------------");

        List<User> users = Arrays.asList(
                new User(20, "Evgeniy"),
                new User(22, "Arkadiy"),
                new User(20, "Viniamin"),
                new User(33, "Alex"),
                new User(41, "Vasiliy"));

        Map<Integer, List<User>> usersByAge = users.stream()
                .collect(Collectors.groupingBy(User::getAge));
        System.out.println(usersByAge);

        System.out.println("------------------------------");

        List<Employee> employees = Arrays.asList( //считаем среднюю ЗП
                new Employee("worker", 200),
                new Employee("worker", 500),
                new Employee("worker", 1200),
                new Employee("manager", 1200),
                new Employee("manager", 700),
                new Employee("manager",2000));

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println(averageSalary);


        var employeesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory));
        System.out.println(employeesByCategory);


        var salariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(salariesByCategory);


        var minSalariesByCategory = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCategory,Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(minSalariesByCategory);

        Map<Employee, String> tests = employees.stream()
                .collect(Collectors.toMap(    //один обьект один ключ без повторок
                        Function.identity(),
                        Employee::getCategory));
        System.out.println(tests);

    }
}
