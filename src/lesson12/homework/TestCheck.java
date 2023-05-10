package lesson12.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestCheck {
    public static boolean checkContent(String string) {
        try (FileReader fileReader = new FileReader("documents.doc");
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(string)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}