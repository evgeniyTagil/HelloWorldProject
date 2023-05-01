package lesson10.homework;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) throws CharacterSequenceException, NumbersSequenceException {
        String string = "5551-ABC-1111-AAA-1a2b";
        MethodToImplement method = new MethodToImplement();
        try {
            method.checkInSymbols(string);
            method.checkNumbers(string);
            method.checkEndString(string);
        } catch (CharacterSequenceException | NumbersSequenceException e) {
            throw new CharacterSequenceException("Exception");
        }
    }
}
