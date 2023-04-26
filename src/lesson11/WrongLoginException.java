package lesson11;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message){
        super(message);
    }
}
