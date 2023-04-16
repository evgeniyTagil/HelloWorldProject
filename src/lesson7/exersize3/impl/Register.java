package lesson7.exersize3.impl;

import lesson7.exersize3.abstractClass.Documents;
import lesson7.exersize3.interfaces.Printable;

public class Register extends Documents implements Printable {
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
        int count = 0;
        for (int i = 0; i <documents.length; i++) {
            if (documents[i] != null){
                count++;
            }
        }
        System.out.println("Количество свободных ячеек: " + (documents.length - count));
        System.out.println("Количество занятых ячеек: " + count);
    }
}

