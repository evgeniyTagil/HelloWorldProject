package lesson13_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        //Set это коллекция уникальных значений
        Set<String> firstSet = new HashSet<>(); //для быстрого поиска
        Set<String> secondSet = new TreeSet<>();//значения автоматически сортируются по увеличению
        firstSet.add("afirst");
        firstSet.add("bsecond");
        firstSet.add("cthird");
        secondSet.add("bsecond");
        secondSet.add("afirst");
        secondSet.add("cthird");
        System.out.println(firstSet);
        System.out.println(secondSet);

        System.out.println(firstSet.contains("first"));
        System.out.println(firstSet.size());
        System.out.println(firstSet.remove("cthirad"));

        Set<Person> myPersonSet = new HashSet<>();
        myPersonSet.add(new Person("Pasha","Tisnk"));
        myPersonSet.add(new Person("Pasha","Tisnk"));
        myPersonSet.add(new Person("Dima","Tisnk"));
        System.out.println(myPersonSet);
        System.out.println("-----------");

        Set<Person> myPersonTreeSet = new TreeSet<>();
        myPersonTreeSet.add(new Person("Pasha","Tisnk"));
        myPersonTreeSet.add(new Person("Dima","Tisnk"));
        myPersonTreeSet.add(new Person("Pasha","Tonk"));
        System.out.println(myPersonTreeSet);

    }
}
