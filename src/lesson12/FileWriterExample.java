package lesson12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("abc.doc",true)){ //если указано true то файл не будет перезаписыватся а будет дополнятся
            writer.write("this is my string1\n");
           //writer.flush(); //записать прямо сейчас, не дожидая окончания программы
            writer.write("this is my second string2\n");
            writer.write("this is my second string3\n");
            //writer.close(); //закрывает поток и сохраняет все что находится в буфере
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
