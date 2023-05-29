package Lesson17.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static final String DOCUMENT_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static final String TXT_FORMAT = ".txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите название файла для чтения: ");
        Pattern document = Pattern.compile(DOCUMENT_FORMAT);
        Pattern mail = Pattern.compile("[a-z]{3,10}@[a-z]{4,8}.+[a-z]{2}");
        FileReader reader = new FileReader("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\" + scr.nextLine() + TXT_FORMAT);
        String str = readFileAndRefactorToString(reader);
        Matcher matcher = mail.matcher(str);
        if (searchDocumentByFormat(matcher)) {
            System.out.println("Найден документ - " + matcher.group());
        } else {
            System.out.println("Документ по дефолтному формату не найден.");
        }
    }

    private static boolean searchDocumentByFormat(Matcher matcher) {
        while (matcher.find()) {
            return true;
        }
        return false;
    }

    private static String readFileAndRefactorToString(FileReader reader) {
        Scanner scanner = new Scanner(reader);
        List<String> stringList = new ArrayList<>();
        while (scanner.hasNext()) {
            stringList.add(scanner.nextLine());
        }
        return stringList.toString();
    }
}

