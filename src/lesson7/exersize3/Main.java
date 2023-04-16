package lesson7.exersize3;

import lesson7.exersize3.impl.Contract;
import lesson7.exersize3.impl.Invoice;
import lesson7.exersize3.impl.Register;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        Contract contractOne = new Contract(1, new Date(), "бананов", 100);
        contractOne.print();
        System.out.println("-----------------------------------------");
        Contract contractMen = new Contract(1,new Date(),new Date(2023,Calendar.MAY,10),"бананы",100);
        contractMen.print();
        System.out.println("-----------------------------------------");
        Invoice invoice = new Invoice(1000,new Date(),1,1);
        invoice.print();
        System.out.println("-----------------------------------------");
        Register register = new Register();
        register.addDocument(contractOne);
        register.addDocument(contractMen);
        register.addDocument(invoice);
        register.print();
    }
}

