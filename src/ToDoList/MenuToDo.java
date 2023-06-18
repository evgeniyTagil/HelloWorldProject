package ToDoList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuToDo {
    public static final File FILE = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\src\\ToDoList\\ToDo.json");

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
            case 1:
                List<ToDo> toDoList = new ArrayList<>();
                System.out.println("------------------------------------------------");
                System.out.println("1 - что-бы просмотреть все задачи нажмите;");
                System.out.println("2 - что-бы посмотреть задачу по номеру нажмите;");
                System.out.println("3 - что-бы изменить задачу нажмите;");
                System.out.println("4 - что-бы вернутся в меню!");
                System.out.println("------------------------------------------------");
                int userVar = scanner.nextInt();
                if (userVar == 1) {
                    toDoData.getAllTask(FILE.getPath(), toDoList);
                    menu();
                } else if (userVar == 2) {
                    toDoData.getOneTask(FILE.getPath());
                    menu();
                }else if (userVar == 3){
                    toDoData.correctTask(FILE.getPath());
                    menu();
                }
                break;
            case 2:
                toDoData.createNewTask();
                menu();
                break;
            case 3:
                toDoData.deleteTask(FILE.getPath());
                menu();
                break;
            case 4:
                System.out.println("------------------------------------------------");
                System.out.println("Всего хорошего!");
                System.out.println("------------------------------------------------");
                break;
            default:
                System.out.println("------------------------------------------------");
                System.out.println("Что-то пошло не так :( , попробуйте еще раз!");
                System.out.println("------------------------------------------------");
                menu();
                break;
        }
    }
}