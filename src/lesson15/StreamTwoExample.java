package lesson15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class StreamTwoExample {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Arrays.asList(1, 2, 10, 150, 3, 7, 5, 9, 67); // в такой добавить можно
        List<Integer> emptyList = Collections.emptyList(); // панты и добавить в него ничего нельзя
        List<Integer> singlList = Collections.singletonList(1); // только 1 эл-нт
        Stream<List<Integer>> listStream = Stream.of(values, values, singlList);

        Stream<Integer> valuesStream = values.stream(); // однопоточный стрим
        Stream<String> stringStream = Stream.of("A", "b", "C"); // заполнять поток прии создании
        Stream<String> myRows = Files.lines(Paths.get("car.doc"));
        Stream<Integer> firstStream = Stream
                .iterate(0, n -> n + 1); // от 0 до бесконечности
        Stream<Integer> secondStream = Stream
                .generate(() -> new Random().nextInt(100)); // пока не остановим поток

//        List<Integer> result = firstStream
//                .skip(20)
//                .limit(30)
//                .distinct()
//                //.peek(x -> System.out.println(x))
//                .sorted((o1, o2) -> o2.compareTo(o1))
//                .filter(val -> val % 2 == 0)
//                .map(x -> x * x) // вывело квадраты чисел // можно вместо x*x методы пихать
//                .filter(x -> x < 1000)
//                .collect(Collectors.toList());
//        System.out.println(result);

        System.out.println(listStream.flatMap(Collection::stream)
                .filter(x -> x<3)
                .noneMatch(x -> x%3 == 0));
        //.anyMatch(x -> x>1));
        //.findAny().orElseThrow());
        //.max((o1,o2) -> o1.compareTo(o2)).orElseThrow());
        // .count());
        //.collect(Collectors.toSet())
        //.toList();
        //System.out.println("Second" + thirdResult);

        //List<Integer> result = valuesStream.collect(Collectors.toList()); //прочитать поток можно только 1 раз
        //Set<Integer> integerSet = valuesStream.collect(Collectors.toSet()); // поэтому тут пусто

        firstStream
                .skip(20)
                .limit(30)
                .distinct()
                //.peek(x -> System.out.println(x))
                .sorted((o1, o2) -> o2.compareTo(o1))
                .filter(val -> val % 2 == 0)
                .map(x -> x * x) // вывело квадраты чисел // можно вместо x*x методы пихать
                .filter(x -> x < 1000)
                .map(x -> (long) x)
                //.forEach(x -> System.out.println(x))
                .reduce((a,b) -> a*b).ifPresent(x-> System.out.println(x));

    }
}