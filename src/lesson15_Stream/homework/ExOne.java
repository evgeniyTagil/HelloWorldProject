package lesson15_Stream.homework;

import java.util.*;
import java.util.stream.Stream;

public class ExOne {
    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                list.add(random.nextInt(20));
            }
            System.out.println("List before change: " + list);

            Stream<Integer> result = list.stream()
                    .distinct()
                    .filter(n -> n >= 7 && n <= 17)
                    .map(n -> n * 2)
                    .sorted()
                    .limit(4)
                    .peek(n -> System.out.println(n));

            result.mapToDouble(n -> n).average().ifPresent(n -> System.out.println("Average: " + n));
        }
}
