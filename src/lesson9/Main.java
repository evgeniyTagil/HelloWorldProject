package lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Mounth.values())); //перечисляет все
        System.out.println(Mounth.valueOf("MAY")); //ищет есть-ли с таким именем
        System.out.println(Mounth.MARCH.ordinal());//показывает позицию
    }
}
