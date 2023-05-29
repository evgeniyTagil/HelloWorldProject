package lesson18_Xml_Json_Parsers.parser.sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxExample {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        ArticleHandler handler = new ArticleHandler();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("article.xml"),handler);
        System.out.println(handler.getWebsite());
    }
}
