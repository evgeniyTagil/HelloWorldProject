package lesson15_Stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 11, 23, 441, 122, 38, 4, 32, 342, 12, 32, 39, 8, 9, 11, 23, 14, 123, 1, 10, 50);
        Stream<Integer> valuesStream = values.stream(); //создание потока способ №1 при получении листа

        Stream<String> stream = Stream.of("A", "b", "c"); //создание потока с данными которые ввели

        Stream<String> myRows = Files.lines(Paths.get("car.doc")); //поток который читает из файла

        Stream<Integer> firstStream = Stream.iterate(0, n -> n + 1); //поток итератор, бесконечный
        Stream<Integer> secondStream = Stream.generate(() -> new Random().nextInt(300)); //генерирует через рандом бесконечное количество int

        //метод flatMap принимает несколько листов и объединяет вместе

        List<Integer> result = valuesStream
                .distinct()
                .sorted(((o1, o2) -> o2.compareTo(o1))) //обратный порядок
                .peek(x -> System.out.println(x)) //метод для проверки того что конкретно сейчас происходит в стриме
                .skip(2)
                .limit(3)
                .filter(val -> val % 2 == 0)
                .map(x -> x * x)
                .filter(x -> x < 5000)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
