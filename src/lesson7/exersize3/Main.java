package lesson7.exersize3;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        Contract contractOne = new Contract(1, new Date(), "бананов", 100);
        contractOne.print();
        System.out.println("-----------------------------------------");
        Contract contractTwo = new Contract(2,new Date(),"яблок",200);
        contractTwo.print();
        System.out.println("-----------------------------------------");
        Contract contractMen = new Contract(1,new Date(),new Date(2023,Calendar.MAY,10));
        contractMen.print();
        System.out.println("-----------------------------------------");
        Register register = new Register();
        register.addDocument(contractOne);
        register.addDocument(contractTwo);
        register.addDocument(contractMen);
        register.print();
    }
}

