package lesson16.homework;

public class Book {
    private String author;
    private String bookName;
    private int yearOfPrinting;

    public Book(String author, String bookName, int yearOfPrinting) {
        this.author = author;
        this.bookName = bookName;
        this.yearOfPrinting = yearOfPrinting;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearOfPrinting() {
        return yearOfPrinting;
    }

    public void setYearOfPrinting(int yearOfPrinting) {
        this.yearOfPrinting = yearOfPrinting;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", yearOfPrinting=" + yearOfPrinting +
                '}' + "\n";
    }
}
