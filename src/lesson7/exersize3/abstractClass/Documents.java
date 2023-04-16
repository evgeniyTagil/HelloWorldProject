package lesson7.exersize3.abstractClass;

import java.util.Date;

public abstract class Documents {
    private int documentsNumber;
    private Date documentsDate;
    private Date documentDateOver;

    public Documents(int documentNumber, Date documentDate) {
        this.documentsNumber = documentNumber;
        this.documentsDate = documentDate;
    }


    public Documents(int documentsNumber, Date documentsDate, Date documentDateOver){
        this.documentsNumber = documentsNumber;
        this.documentsDate = documentsDate;
        this.documentDateOver = documentDateOver;
    }

    public Documents() {
    }


    public int getDocumentsNumber() {
        return documentsNumber;
    }

    public void setDocumentsNumber(int documentNumber) {
        this.documentsNumber = documentNumber;
    }

    public Date getDocumentsDate() {
        return documentsDate;
    }

    public void setDocumentsDate(Date documentsDate) {
        this.documentsDate = documentsDate;
    }
}
