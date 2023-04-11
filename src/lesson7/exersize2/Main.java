package lesson7.exersize2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Информация:");
        Entity[] entities = setInArray();
        for (Entity entity : entities) {
            entity.post();
        }
    }

    public static Entity[] setInArray() {
        Entity[] entities = new Entity[3];
        entities[0] = new Director();
        entities[1] = new Accountant();
        entities[2] = new Worker();
        return entities;
    }
}