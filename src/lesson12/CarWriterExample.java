package lesson12;

import java.io.*;

public class CarWriterExample {
    public static void main(String[] args) {
        File file = new File("car.doc");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileOutputStream outputStream = new FileOutputStream("car.doc");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            Car lada = new Car(100,"!Lada");
            lada.setUnneededValue(100);
            objectOutputStream.writeObject(lada);
            objectOutputStream.writeObject(new Car(1000,"BMW"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
