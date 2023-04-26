package lesson11;

public class MyBestException extends Exception{
    private int age;

    public int getAge() {
        return age;
    }

    public MyBestException(String message, int age){
        super(message);
        this.age = age;
    }
}
