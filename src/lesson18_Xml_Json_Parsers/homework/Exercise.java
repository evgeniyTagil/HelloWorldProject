package lesson18_Xml_Json_Parsers.homework;

import lesson12.homework.DocumentReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        //стандартное начало работы с парсером dom
        File file = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\src\\lesson18_Xml_Json_Parsers\\homework\\data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element element = document.getDocumentElement();
        NodeList nodeList = element.getElementsByTagName("line");
        File newFile = new File("18lesson.txt");
        newFile.createNewFile();
        FileWriter fileWriter = new FileWriter(newFile);
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node current = nodeList.item(i);
            String content = current.getTextContent() + "\n";
            fileWriter.write(content);
        }
        fileWriter.close();
        try (FileReader reader = new FileReader(newFile)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
