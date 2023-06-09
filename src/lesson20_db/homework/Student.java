package lesson20_db.homework;

public class Student {
    public int id;
    public String name;
    public int age;
    public String location;

    public Student(int id, String name, int age, String location) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString(){
        return "Students{" + "\n" +
                " id = " + id + ";" + "\n" +
                " Name = " + name + ";" + "\n" +
                " Age = " + age + ";" + "\n" +
                " City = " + location + "." + "\n";
    }
}
