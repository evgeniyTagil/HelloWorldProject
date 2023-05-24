package lesson16.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> booksList = Arrays.asList(
                new Book("Маргарет Митчел", "Унесенные ветром", 1936),
                new Book("Джордж Оруел", "1984", 1949),
                new Book("Михаил Булгаков", "Мастер и Маргарита", 1967),
                new Book("Лев Толстой", "Война и мир", 1867),
                new Book("Федор Достоевский","Преступление и наказание",1866),
                new Book("Конан Дойл", "Шерлок Холмс", 1887),
                new Book("Михаил Булгаков","Собачье сердце",1925),
                new Book("Федор Достоевский","Идиот",1869));

        List<Book> sortOfYear = booksList.stream()
                .sorted(Comparator.comparingInt(Book::getYearOfPrinting))
                .toList();
        sortOfYear.forEach(System.out::println);
        System.out.println("-------------------");

        Map<String, List<Book>> sortOfAuthor = booksList.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
        System.out.println(sortOfAuthor);
        System.out.println("-------------------");

        Map<Integer,Long> countOfYear = booksList.stream()
                .collect(Collectors.groupingBy(Book::getYearOfPrinting,Collectors.counting()));
        System.out.println(countOfYear);
        System.out.println("-------------------");

        Map<String,Long> countOfAuthor = booksList.stream()
                .collect(Collectors.groupingBy(Book::getAuthor,Collectors.counting()));
        System.out.println(countOfAuthor);
    }
}