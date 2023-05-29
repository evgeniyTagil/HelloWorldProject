package Lesson17_Reg;

import static java.util.Arrays.asList;
import static java.util.regex.Pattern.compile;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        List<String> testLString = asList("ABC", "abc", "f",
                "F", "", "a1a",
                "a11","a.1","a..1");
        /*Pattern pattern = Pattern.compile("[a-z]");*/ //1 маленькая буква
//        Pattern pattern = Pattern.compile("[a-z]+"); //как минимум 1 маленькая буква
        /*Pattern pattern = Pattern.compile("[a-z]*");*///от 0 до любого количества маленьких букв
        /*Pattern pattern = Pattern.compile("[a-z]?");*/ //или 0 или 1-а маленькая буква
        /*Pattern pattern = Pattern.compile("[a-z]{2,3}");*/ //от 2-х маленьких до 3-х
        /*Pattern pattern = Pattern.compile("[a-zA-Z]");*/ //и маленькие и большие
        /*Pattern pattern = compile("[a-z]+", CASE_INSENSITIVE);*/ //аналог примеру выше c использованием + static import
        /*Pattern pattern = compile("[^a-z]+");*/ //все кроме того что идет за ним и + значит как минимум 1-н
        /*Pattern pattern = compile("[a-z]+\\d+[a-z]+");*/ //сразу идет какая нибудь буква, потом цифра и опять буква
        /*Pattern pattern = compile("[a-z]+\\d+$");*/ //
        /*Pattern pattern = compile("[^a-z]+\\d+");*/ //строка должна начинатся именно с этого, символ ^
        /*Pattern pattern = compile("[a-z]+\\.\\d+");*///искать так что-бы был символ + . + заканчивается на цифру
        /*Pattern pattern = compile("[a-z]+.\\d+");*/ //теперь . это обсалютно любой символ
        Pattern pattern = compile("([a-z]+.)(\\d+)"); //выделение скобками + можно их разделить по группам matcher.group(1) или (2)
        testLString.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
            System.out.println(str + " is matcher? " + matcher.matches());
            if (matcher.find()){
                System.out.println("First group: " + matcher.group(1));
                System.out.println("Second group: " + matcher.group(2));
            }
        });
    }
}