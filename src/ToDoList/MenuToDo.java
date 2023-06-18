package ToDoList;

import java.io.File;
import java.util.Scanner;

public class MenuToDo {
    public static final File FILE = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\ToDo.json");

    public static void menu() {
        System.out.println("------------------------------------------------");
        System.out.println("Добрый день, веберете интересующий вас вариант: ");
        System.out.println("1 - что-бы перейти к текущим задачам;");
        System.out.println("2 - добавить новую задачу;");
        System.out.println("3 - что-бы удалить задачу;");
        System.out.println("4 - что-бы завершить работу.");
        System.out.println("------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int userVarOfMethod = scanner.nextInt();
        ToDoData toDoData = new ToDoData();
        switch (userVarOfMethod) {
            case 1 -> ToDoData.goToCurrentTask(scanner, toDoData);
            case 2 -> {
                toDoData.createNewTask();
                menu();
            }
            case 3 -> {
                toDoData.deleteTask(FILE.getPath());
                menu();
            }
            case 4 -> {
                System.out.println("------------------------------------------------");
                System.out.println("Всего хорошего!");
                System.out.println("------------------------------------------------");
            }
            default -> {
                System.out.println("------------------------------------------------");
                System.out.println("Что-то пошло не так :( , попробуйте еще раз!");
                System.out.println("------------------------------------------------");
                menu();
            }
        }
    }


}