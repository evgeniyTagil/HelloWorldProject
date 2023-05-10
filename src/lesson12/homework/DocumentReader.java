package lesson12.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocumentReader {
    public void reader(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Please, enter document name");
        try (FileReader reader = new FileReader(scr.nextLine());){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}