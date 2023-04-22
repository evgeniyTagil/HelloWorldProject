package lesson10;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        //Создание строк
        String str = "This is my string";
        String str2 = "This is my string";
        String str3 = new String("this is my string");
        System.out.println(str == str2); //Сравнение строк всегда, в отличае от объекта, при равном написании всегда true
        System.out.println(str == str3);
        System.out.println(str.equals(str3));//метод сравнение строк по содержимому
        System.out.println(str.compareTo(str3));//метод показывает насколько индексы далеко друг от друга


        //Склеивание строк
        String addString = str + str2;
        System.out.println(addString); //Склеивание строк
        System.out.println(str.concat(str2)); //Склеивание строк №2
        System.out.println(String.join(" ", str, str2)); //Склеивание строк №3 - самый популярный, количество скрок может быть 2+
        String[] arr = new String[]{str, str2, str3};
        System.out.println(String.join(" ", arr));

        //Методы стринг
        String myBestString = "          this is string      ";
        System.out.println(myBestString.length()); //метод
        System.out.println(myBestString.trim()); //метод вывода без учета пробелов
        myBestString = myBestString.trim(); //для того чтобы применить изменения к строке нужно ее пересахранить
        System.out.println(myBestString.length());
        System.out.println(myBestString.charAt(5)); //метод который выведет символ по заданному индексу

        char[] charArr = myBestString.toCharArray(); //т.к. строка это массив индексов цифр по системе UTF-8 можно строку передать в массив
        int count = 0;
        for (char ch : charArr) {
            if (ch == 'i') { //'i' можно записать по его позиции в UTF-8 (105) ch == 105
                count++;
            }
        }
        System.out.println("Count " + count);

        System.out.println(myBestString.substring(5)); //вывод начиная с определенной позиции

        System.out.println(myBestString.substring(5,7)); //вывод начиная с и по определенную позицию
        System.out.println(str.toLowerCase()); //метод для написания текста в нижнем регистре

        System.out.println(str.toUpperCase()); //метод для написания текста в верхнем регистре
        System.out.println(str.equalsIgnoreCase(str3)); //метод сравнивает в не зависимости от регистра

        System.out.println(str.replace('i','a')); //метод замены во всей строке символа 1 на символ 2
        System.out.println(str.replace("is","as"));//меняет несколько символов идущих друг за другом

        System.out.println(str.contains("is")); //метод для проверки наличия значения в строке

        System.out.println(str.indexOf("is")); //метод ищет первую позицию в строке по 1-у символу сочетания
        System.out.println(str.indexOf("is",2)); //аналогичен верхнему только ищет с указанного индекса
        System.out.println(str.lastIndexOf("is")); //метод ищет последнюю позицию в строке по 1-у символу сочетания
        String str5 = " ";
        System.out.println("----------------------");
        System.out.println(str5.isEmpty()); //проверяет пустая-ли строка
        System.out.println(str5.isBlank()); //не учитывает пробел как сивол и проверяет пустая-ли строка

        String str4 = "abra";
        System.out.println(str4.repeat(5)); //метод склеивает заданное количество раз
        System.out.println(str4.startsWith("ab")); //метод для проверки с чего начинается строка(с учетом регистра)
        System.out.println(str4.endsWith("ra"));//аналогичный метод методу выше только для последних символов

        String[] myArr = str.split(" "); //метод разделяет строку с помощью указателя(у меня пробел) на разные ячейки массива
        String[] myArr2 = str.split("");
        System.out.println(Arrays.toString(myArr)); //с пробелом как разделитель
        System.out.println(Arrays.toString(myArr2)); //без пробела, без разделителя

    }
}
