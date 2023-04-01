import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Treaning {
    public static void main(String[] args) {
//        System.out.println("This is my second HomeWork!");
//        System.out.println("Message: ");
//        Scanner scanner = new Scanner(System.in);
//        String userMessage = scanner.nextLine();
//        System.out.println("Your message: " + userMessage);
//    }
        int val = 1;
        while (val < 1){
            System.out.println("Value = " + val);
            val++;
        }
        System.out.println("-----------------------");

        int val2 = 1;
        do{
            System.out.println(val2);
            val2++;
        } while (val2 < 1);

        System.out.println("-----------------------");

        for (int i = 0; i <1; i++){
            System.out.println(i);
        }

        System.out.println("-----------------------");

        Random random = new Random();
        int[] array = new int[10];
        for (int x = 0; x < array.length ; x++){
            array[x] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------");

        int x = 10;
        Scanner scanner = new Scanner(System.in);
        if (x <= scanner.nextInt()){
            System.out.println("Your number > white my number: " + x);
        }else {
            System.out.println("Your number < white my number " + x);
        }

    }
}
