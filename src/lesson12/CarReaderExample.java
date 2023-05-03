package lesson12;

import java.io.*;

public class CarReaderExample {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("car.doc");
             ObjectInputStream objectOutputStream = new ObjectInputStream(inputStream);){
            while (true){
                Car myCar = (Car) objectOutputStream.readObject();
                System.out.println(myCar);
            }
        }catch (IOException e){
           // throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
