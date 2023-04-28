package lesson10.homework;

import java.util.Scanner;

public class ExerciseOne{
    public static void main(String[] args) {
        String string = "1111-AAA-1111-AAA-1A1A";
        /*
        Сделал доступ реализацию доступа специально разную
         */
        MethodToImplement method = new MethodToImplement();
        method.digitalOutput(string); //при обычном методе
        MethodToImplement.replacement(string);
        MethodToImplement.printLetters(string);
        MethodToImplement.checkLetters(string);
        MethodToImplement.checkNumbers(string);
        MethodToImplement.checkEndString(string);


    }
}
