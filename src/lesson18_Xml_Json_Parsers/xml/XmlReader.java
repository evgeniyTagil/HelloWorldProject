package lesson18_Xml_Json_Parsers.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlReader {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Student student = (Student) unmarshaller.unmarshal(new File("student.xml"));
        System.out.println(student);
    }
}