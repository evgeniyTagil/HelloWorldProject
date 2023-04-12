package lesson7.exersize2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Информация:");
        Employee[] entities = setInArray();
        for (Employee entity : entities) {
            entity.post();
        }
    }

    public static Employee[] setInArray() {
        Employee[] employees = new Employee[3];
        employees[0] = new Director();
        employees[1] = new Accountant();
        employees[2] = new Worker();
        return employees;
    }
}