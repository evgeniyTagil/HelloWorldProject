package ToDoList;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Methods {

    public static void createNewTask() {
        Scanner scanner = new Scanner(System.in);
        int taskCountNumber = Methods.counter(); // taskNumber

        String dateNowForTask = String.valueOf(LocalDate.now()); //taskDate

        System.out.println("Введите название задачи: ");
        String taskName = scanner.nextLine(); //taskName

        System.out.println("Выберите важность для установки задачи: "); //taskPriority
        System.out.println("1 - если важность ВЫСОКАЯ;");
        System.out.println("2 - если важность ОБЫЧНАЯ.");
        String taskPriority;
        if (scanner.nextInt() == 1) {
            taskPriority = "High";
        } else {
            taskPriority = "Normal";
        }
        scanner.close();

        ToDo task = new ToDo(taskCountNumber, dateNowForTask, taskName, taskPriority,true);
        ToDoData toDoData = new ToDoData();
        toDoData.saveToList(task);
    }

    public static int counter() {
        int i = 0;
        i++;
        return i;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Добрый день, веберете интересующий вас вариант: ");
        System.out.println("1 - что-бы перейти к текущим задачам;");
        System.out.println("2 - добавить новую задачу;");
        System.out.println("3 - что-бы завершить работу.");
        System.out.println("------------------------------------------------");
        switch (scanner.nextInt()) {
            case 1:
                //Methods.readTask();
                break;
            case 2:
                Methods.createNewTask();
                break;
            case 3:
                System.out.println("Всего хорошего!");
                break;
            default:
                System.out.println("Что-то пошло не так :( , попробуйте еще раз!");
                menu();
        }
    }
}


//
//    File file = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\src\\ToDoList\\ToDo.json");
//
//    Scanner scanner = new Scanner(System.in);
//    int taskCountNumber = Methods.counter(); // taskNumber
//
//    String dateNowForTask = String.valueOf(LocalDate.now()); //taskDate
//
//        System.out.println("Введите название задачи: ");
//                String taskName = scanner.nextLine(); //taskName
//
//                System.out.println("Выберите важность для установки задачи: "); //taskPriority
//                System.out.println("1 - если важность ВЫСОКАЯ;");
//                System.out.println("2 - если важность ОБЫЧНАЯ.");
//                String taskPriority;
//                if (scanner.nextInt() == 1) {
//                taskPriority = "High";
//                } else {
//                taskPriority = "Normal";
//                }
//                scanner.close();
//
//                ToDo task = new ToDo(taskCountNumber, dateNowForTask, taskName, taskPriority,true);
//                List<ToDo> toDoList = List.of(task);
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//        mapper.writerWithDefaultPrettyPrinter().writeValue(file, toDoList);
//        } catch (IOException e) {
//        e.printStackTrace();
//        }
//        }