package lesson16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();
        testMap.getOrDefault("a", "not found");//ищем а если находим то пт пишем а если нет not found
        testMap.putIfAbsent("a", "abc");// если в а пусто пишем абц если нет то ничего не пишем
        // testMap.computeIfAbsent("aa",(a0,a1 -> a0+a1 ))

        var abc = """
                abc
                   abc
                  """;
        System.out.println(abc);

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("give the date");
        String date = scanner.nextLine();
        //LocalDate localDate = LocalDate.parse(date,formater);
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);

        System.out.println(localDate.getDayOfWeek().getValue());
        var day = localDate.getDayOfWeek().getValue();
        if (day == 1) {
            System.out.println(localDate.plusDays(1));
        } else {
            System.out.println(localDate.plusDays(9 - day));
        }
        if (day != 1) {
            day = 9 - day;
        }
//6,7
//        6-day>0
//                ==0
    }
}
