package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        List<String> secondString = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println(strings);
        secondString.add("forth");
        secondString.add("fifth");
        strings.addAll(secondString);
        System.out.println(strings);
        strings.add(2,"next");
        System.out.println(strings);
        System.out.println(strings.contains("next")); //проверяет ес-ли указанное в коллекции
        System.out.println(strings.indexOf("next")); //дает номер объекта в коллекции
        System.out.println(strings.lastIndexOf("next")); //дает последний номер указанного значения
        System.out.println(strings.isEmpty()); //возврощает true если пустой или false если не пустой
        System.out.println(strings.get(5)); //достает элемент по индексу
        System.out.println(strings.remove("next")); //выбросить из коллекции
        System.out.println(strings.remove(4)); //выбросить по позиции
        System.out.println(strings.removeAll(secondString)); //выбросить все из текущего листа значения указанного листа
        System.out.println(strings.set(1,"next")); //замена значения по позиции
        System.out.println("---------");
        System.out.println(strings.size()); //считает сколько элементов есть в коллекции
        System.out.println(strings.subList(1,3)); //выводит по индексу с 1-го не включая 3-й
        System.out.println(strings);

        System.out.println("----------------");
        Collections.sort(secondString); //отсортировал
        System.out.println(secondString);
        Collections.reverse(secondString); //перевернул
        System.out.println(secondString);
        Collections.shuffle(strings); //перемешать содержимое коллекции
        System.out.println(strings);

        for (String str: strings){ //проход по листу
            System.out.println(str);
        }


    }
}