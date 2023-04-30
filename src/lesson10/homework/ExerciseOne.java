package lesson10.homework;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) throws CharacterSequenceException {
        String string = "1111-AAA-1111-AAA-1A1A";
        MethodToImplement method = new MethodToImplement();
        try {
            method.checkInSymbols(string);
        } catch (CharacterSequenceException e) {
            throw new CharacterSequenceException("Exception");
        }
    }
}
