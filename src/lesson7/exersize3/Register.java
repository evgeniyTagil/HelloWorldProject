package lesson7.exersize3;

import java.util.Arrays;

public class Register extends Documents implements Printable{
    private Documents[] documents;
    private int index;

    public Register() {
        documents = new Documents[10];
        index = 0;
    }

    public void addDocument(Documents document) {
        if (index < documents.length) {
            documents[index] = document;
            index++;
        }
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(documents));
    }
}

