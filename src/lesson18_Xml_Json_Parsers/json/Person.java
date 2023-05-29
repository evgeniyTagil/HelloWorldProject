package lesson18_Xml_Json_Parsers.json;

import com.fasterxml.jackson.annotation.JsonProperty;
//@JsonIgnoreProperties() можно использовать для того что-бы при считывании игнорировать поля которые он не знает
import java.util.List;

public class Person {
    private int age;
    @JsonProperty(value = "nick")
    private String name;
    private List<String> hobbies;
    private boolean isRich;


    public Person() {
    }

    public Person(int age, String name, List<String> hobbies, boolean isRich) {
        this.age = age;
        this.name = name;
        this.hobbies = hobbies;
        this.isRich = isRich;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isRich() {
        return isRich;
    }

    public void setRich(boolean rich) {
        isRich = rich;
    }

    @Override
    public String toString() {
        return "Peson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                ", isRich=" + isRich +
                '}';
    }
}
