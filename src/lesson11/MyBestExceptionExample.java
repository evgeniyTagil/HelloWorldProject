package lesson11;

import java.util.Scanner;

public class MyBestExceptionExample {
    public static void main(String[] args) {
        //мы попросим человека угадать наш возраст
        //если +- 5 лет мы говорим что не угадал
        //если угадал мы говорим что угадал
        //если разбежка в большую сторону(и больше 5 лет) - ошибка (видимо охринел)
        //если в меньшую сторону (и больше 5) - ошибка (льстец)
        int currentAge = 30;
        System.out.println("Please, enter guessed age");
        Scanner scanner = new Scanner(System.in);
        int guessedAge = scanner.nextInt();
        try {
            boolean isGameContinue = checkAge(currentAge, guessedAge);
            while (isGameContinue) {
                System.out.println("Please, enter guessed age again");
                guessedAge = scanner.nextInt();
                isGameContinue = checkAge(currentAge, guessedAge);
            }
        } catch (MyBestException e) {
            System.out.println("My age is "+ e.getAge() + ". " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("This is end...");
    }

    private static boolean checkAge(int currentAge, int guessedAge) throws MyBestException {
        int result = currentAge - guessedAge;
        if (result == 0) {
            System.out.println("You are right!!!");
            return false;
        }
        if (result > -5 && result < 5) {
            System.out.println("Try again, you are close enough");
            return true;
        }
        if (result > 5)throw new MyBestException("You are not an age expert!(flirt version)", currentAge);
        throw new MyBestException("You are totally not an age expert!!!!(angry version)", currentAge);
    }
}
