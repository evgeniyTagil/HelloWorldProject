package lesson12.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DocumentWriter {

    public void writer() {
        File file = new File("documents.doc");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("documents.doc", true);) {
            int stringLength = 5;
            String userDocNum;
            boolean isTrue = true;
            do {
                System.out.println("Please, write document number");
                userDocNum = scanner.nextLine();
                if (userDocNum.matches("\\d+") == isTrue && userDocNum.length() == stringLength) {
                    writer.write("Document number: " + userDocNum + "\n");
                } else {
                    System.out.println("The length of the document number must be 15 characters");
                    System.out.println("Your number document get in file " + "NotValidNumbers.doc");
                    FileWriter writerNotValid = new FileWriter("NotValidNumbers.doc",true);
                    File notValid = new File("NotValidNumbers.doc");
                    notValid.createNewFile();
                    writerNotValid.write("Not valid document number: " + userDocNum + "\n");
                    writerNotValid.flush();
                    System.out.println("Please try again");
                }
            } while (userDocNum.matches("\\d+") != isTrue || userDocNum.length() != stringLength);
        } catch (InputMismatchException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}