package lesson18_Xml_Json_Parsers.homework;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Exercise {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        //стандартное начало работы с парсером dom
        File file = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\src\\lesson18_Xml_Json_Parsers\\homework\\data.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element element = document.getDocumentElement();
//        System.out.println(element.getTagName());
        NodeList nodeList = element.getChildNodes();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nodeList.getLength() + nodeList.getLength(); i++) {
//            Node current = nodeList.item(i);
//            System.out.println("Element: " + current.getNodeName());
//            System.out.println(element.getAttribute("lines"));
            System.out.println(element.getElementsByTagName("line").item(i).getTextContent());
            stringBuilder.append(element.getElementsByTagName("line").item(i).getTextContent());
        }
        File newXmlFile = new File("newFile.xml");

        System.out.println("--------");
        System.out.println(stringBuilder);

    }
}
