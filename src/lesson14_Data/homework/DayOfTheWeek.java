package lesson14_Data.homework;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        System.out.println("Please enter data in format: year month day");
        String userData = scanner.nextLine();
        LocalDate date = LocalDate.parse(userData,formatter);
        System.out.println(date.getDayOfWeek());

    }
}