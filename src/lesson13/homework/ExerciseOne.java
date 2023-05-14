package lesson13.homework;

import java.io.File;
import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        //#1
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("two");
        list.add("three");
        list.add("check");
        Collections.sort(list);
        System.out.println(list);
    }
}
