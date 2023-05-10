package lesson12.homework;

import java.io.*;
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
        try (FileWriter writer = new FileWriter("documents.doc", true);
             FileWriter writerNotValid = new FileWriter("NotValidNumbers.doc", true)) {
            int stringLength = 5;
            String userDocNum;
            boolean isTrue = true;
            do {
                System.out.println("--------------------------------");
                System.out.println("Please, write document number");
                userDocNum = scanner.nextLine();
                if (isDocumentNumberCorrect(stringLength, userDocNum, isTrue)) {
                        writer.write("Document number: " + userDocNum + "\n");
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("The length of the document number must be 5 numbers and be unique");
                    System.out.println("Your number document get in file " + "NotValidNumbers.doc");
                    File notValid = new File("NotValidNumbers.doc");
                    notValid.createNewFile();
                    writerNotValid.write("Not valid document number: " + userDocNum + "\n");
                    writerNotValid.flush();
                    System.out.println("Try again");
                }
            } while (isDocumentNumberNotCorrect(stringLength, userDocNum, isTrue));
        } catch (InputMismatchException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isDocumentNumberNotCorrect(int stringLength, String userDocNum, boolean isTrue) {
        return userDocNum.matches("\\d+") != isTrue || userDocNum.length() != stringLength
                || TestCheck.checkContent(userDocNum) == isTrue;
    }

    private static boolean isDocumentNumberCorrect(int stringLength, String userDocNum, boolean isTrue) {
        return userDocNum.matches("\\d+") == isTrue && userDocNum.length() == stringLength
                && TestCheck.checkContent(userDocNum) != isTrue;
    }
}