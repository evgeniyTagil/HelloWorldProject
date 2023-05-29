package lesson18_Xml_Json_Parsers.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class JsonExample {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person(21,"Anton", Arrays.asList("write","dance"),false);

        //запись
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
        System.out.println(result);

        //чтение
        Person currentPerson = mapper.readValue(result,Person.class);
        System.out.println(currentPerson);
    }
}
