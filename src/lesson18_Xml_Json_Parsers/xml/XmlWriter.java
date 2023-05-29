package lesson18_Xml_Json_Parsers.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlWriter {
    public static void main(String[] args) throws JAXBException {
        Student student = new Student(1,"Ivan","man",new Course("first"));
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(student,new File("student.xml"));
    }
}
