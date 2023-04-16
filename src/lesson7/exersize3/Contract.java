package lesson7.exersize3;

import java.util.Date;

public class Contract extends Documents implements Printable {
    private String contractType;
    private int numberOfItems;

    @Override
    public void print() {
        System.out.println("Контракт #" + getDocumentsNumber() + " был создан " + getDocumentsDate() + ".");
        System.out.println("Контракт создан на " + numberOfItems + " " + contractType + ".");
    }

    public Contract(int documentsNumber, Date documentsDate, String contractType, int numberOfItems) {
        super(documentsNumber, documentsDate);
        this.contractType = contractType;
        this.numberOfItems = numberOfItems;
    }

    public Contract(int documentsNumber, Date documentsDate, Date documentDateOver) {
        super(documentsNumber,documentsDate,documentDateOver);
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}
