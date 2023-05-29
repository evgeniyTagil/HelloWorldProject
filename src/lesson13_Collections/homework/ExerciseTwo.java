package lesson13_Collections.homework;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ExerciseTwo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("exercise.txt")) {
            writer.write("1\n");
            writer.write("10\n");
            writer.write("3\n");
            writer.write("10\n");
            writer.write("8\n");
            writer.write("21\n");
        } catch (IOException e) {
            throw new RuntimeException();
        }

        Set<Integer> numbers = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("exercise.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                numbers.add(number);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
