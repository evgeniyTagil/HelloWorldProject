package lesson14.homework;

import java.time.LocalDate;

public class NextTuesday {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.plusWeeks(1));
    }
}
