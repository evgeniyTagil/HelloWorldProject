package Lesson17_Reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String test = "This is my 1 test string, - 12345";
        String test2 = "12345";

        Pattern numbers = Pattern.compile("\\d+"); //задание шаблона для поиска

        Matcher numbersMatcher = numbers.matcher(test); //поиск по строке
        System.out.println(numbersMatcher.matches()); //.matches - проверка на соответствие ВСЕЙ строки

        Matcher numbersMatcher2 = numbers.matcher(test2);
        System.out.println(numbersMatcher2.matches());


        //if  для первого совпадения
//        if (numbersMatcher.find()){ //.find - мы даем команду найти что-то подходящее под шаблон
//            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end()); //дает точное начало и конец подходящего куска строки
//            System.out.println(numbersMatcher.group()); //возврощает найденный кусок
//
        //while для всех совпадений
        while (numbersMatcher.find()){ //.find - мы даем команду найти что-то подходящее под шаблон
            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end()); //дает точное начало и конец подходящего куска строки
            System.out.println(numbersMatcher.group()); //возврощает найденный кусок
        }
        numbersMatcher.reset(); //.reset - нужен потому-что методы выше запоминают позицию в строке на которой остановились, reset возврощает в начало строки
        //numbersMatcher.usePattern() начинает использовать новый паттерн с этого момента (если нет reset то будет с места где астановился старый паттерн)

        numbersMatcher.results()//можно выполнять в потоке .results()
                .map(matchResult -> matchResult.group())
                .map(String::length)
                .forEach(lenght -> System.out.println(lenght));

    }
}
