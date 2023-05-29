package Lesson17_Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExExample {

    public static final String DEFAULT_DOCUMENT_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static final String NUMBERS_WITH_MINUS = "\\d+-?";
    public static final String LETTERS_BLOCK = "[a-z]{3}";
    public static final String EXTEND_DOCUMENT_FORMAT = "(\\d{4})(-[a-z]{3}-)(\\d{4})(-[a-z]{3}-)(\\d[a-z]){2}";

    public static void main(String[] args) {
        //10я домашка
        //формат xxxx-yyy-xxxx-yyy-xyxy , где x-число, y-буква
        Pattern documentPattern = Pattern.compile(DEFAULT_DOCUMENT_FORMAT);
        String testCase = "1504-abc-5678-def-9z0y";
        Matcher matcher = documentPattern.matcher(testCase);
        System.out.println(documentPattern.matcher(testCase).matches());

        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        System.out.println("\nFirst task: ");
        printFirstLetters(testCase);
        printWithoutLetters(testCase);
        printOnlyLetters(testCase);
        printIfDocumentStartsWithANumberThatLessThat150(testCase);
    }

    private static void printIfDocumentStartsWithANumberThatLessThat150(String str) {
        Pattern pattern = Pattern.compile("[0-1]([0-4][0-9]|50).+");
        System.out.println(pattern.matcher(str).matches());

    }

    private static void printOnlyLetters(String str) {
        System.out.println(str.replaceAll(NUMBERS_WITH_MINUS, "")
                .replaceAll("-", "/"));
    }

    private static void printWithoutLetters(String str) {
        System.out.println(str.replaceAll(LETTERS_BLOCK, "***"));
    }

    private static void printFirstLetters(String str) {
        Pattern pattern = Pattern.compile(EXTEND_DOCUMENT_FORMAT);
        Matcher matcher = pattern.matcher(str);
        System.out.println(pattern.matcher(str).matches());
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(1) + matcher.group(3));
        }
    }
}