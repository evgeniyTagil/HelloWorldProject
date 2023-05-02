package lesson10.homework;

import lesson11.WrongPasswordException;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) throws CharacterSequenceException, NumbersSequenceException, WrongLetterException {
        String string = "5551-ABC-1111-AAA-1a2b";
        MethodToImplement method = new MethodToImplement();
        try {
            method.checkInSymbols(string);
            method.checkNumbers(string);
            method.checkEndString(string);
        } catch (CharacterSequenceException | NumbersSequenceException e) {
            throw new CharacterSequenceException("Exception");
        }

        String str = "2424";
        try {
            method.checkInString(str);
        }catch (WrongPasswordException e){
            throw new WrongLetterException("EXCEPTION");
        }

        System.out.println("The end");
    }
}
