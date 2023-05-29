package lesson13_Collections;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        //Map работает по принципу <КЛЮЧ , ЗНАЧЕНИЕ> - возврощает значение по ключу
        Map<Integer,String> firstMap = new HashMap<>(); //HashMap быстро ищет по ключу
        Map<Integer,String> secondMap = new TreeMap<>(); //TreeMap ключи идут по возрастанию
        firstMap.put(1,"Red");
        firstMap.put(2,"Orange");
        firstMap.put(3,"Yellow");
        firstMap.put(4,"forDelete");
        secondMap.put(1,"Red");
        secondMap.put(2,"Orange");
        secondMap.put(3,"Yellow");
        System.out.println(firstMap.get(2));
        System.out.println(firstMap.containsKey(3)); //проверяет есть-ли значение по ключу
        System.out.println(firstMap.isEmpty()); //true если пустой и false если заполнен
        System.out.println(firstMap.size()); //сколько есть ключей
        //System.out.println(firstMap.remove(4)); //удалить по ключу и в начем случае выводит значение которое удаляет
        System.out.println(firstMap.keySet()); //дает все ключи
        System.out.println(firstMap.values()); //возврощает не ключи а значения

        System.out.println(firstMap); //вывод

        for (Integer key: firstMap.keySet()){   //вывод
            System.out.println(firstMap.get(key));
        }

        firstMap.forEach((k,v) ->System.out.println(k + " " + v));  //вывод


        List<Integer> integer;
        List<List<Integer>> integer2;



        Map<String,List<String>> myMap = new HashMap<>();
        //computer(Lenovo,Asus)
        //phones(Samsung,Iphone)
        List<String> computers = new ArrayList<>();
        computers.add("Lenovo");

        List<String> phones = new ArrayList<>();
        phones.add("Samsung");

        myMap.put("computers",computers);
        myMap.put("phones",phones);
    }
}
