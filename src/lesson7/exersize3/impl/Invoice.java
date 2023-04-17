package lesson7.exersize3.impl;

import lesson7.exersize3.Documents;
import lesson7.exersize3.Printable;

import java.util.Date;

public class Invoice extends Documents implements Printable {
    private int sum;
    private int department;
    public Invoice (int sum, Date documentsDate,int documentsNumber, int department ){
        super(documentsNumber, documentsDate);
        this.sum = sum;
        this.department = department;
    }

    @Override
    public void print() {
        System.out.println("Контракт на сумму: " + getSum() +
                "; Дата создания контакта: " + getDocumentsDate() +
                "; Номер контракта: " + getDocumentsNumber() +
                "; Ответственный департамент №" + getDepartment());
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
}
