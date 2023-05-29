package lesson15_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class HwEx {
    public static void main(String[] args) {
        List<Integer> arrs = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5);
        int x = 3;
        List<Integer> result =
                arrs.stream().map(val -> val == x ? 0 : val).toList();
        System.out.println(result);

        System.out.println(IntStream.of(1, 2, 3, 1, 2, 3, 4, 5).summaryStatistics());

        arrs.stream().filter(z -> z % 2 == 0).forEach(z -> System.out.println(z));
    }
}
