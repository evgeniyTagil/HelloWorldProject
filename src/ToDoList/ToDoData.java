package ToDoList;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoData {

    public static final File FILE = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\ToDo.json");
    public static int taskCounter;

    public void createNewTask() {
        Scanner scanner = new Scanner(System.in);
        int taskCountNumber = counter();
        String dateNowForTask = String.valueOf(LocalDate.now());
        System.out.println("Введите название задачи: ");
        String taskName = scanner.nextLine(); // taskName
        System.out.println("Выберите важность для установки задачи: ");
        System.out.println("1 - если важность ВЫСОКАЯ;");
        System.out.println("2 - если важность ОБЫЧНАЯ.");
        String taskPriority;
        if (scanner.nextInt() == 1) {
            taskPriority = "High";
        } else {
            taskPriority = "Normal";
        }
        String taskStatus = "Активная";
        ToDo task = new ToDo(taskCountNumber, dateNowForTask, taskName, taskPriority, taskStatus);
        ToDoData.saveToList(task);
    }

    private static void saveToList(ToDo toDo) {
        addToJson(toDo);
    }

    private static void addToJson(ToDo toDoListData) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<ToDo> existingTasks = new ArrayList<>();
            if (ToDoData.FILE.exists()) {
                String jsonContent = new String(Files.readAllBytes(ToDoData.FILE.toPath()));
                existingTasks = mapper.readValue(jsonContent, mapper.getTypeFactory().constructCollectionType(List.class, ToDo.class));
            }
            existingTasks.add(toDoListData);
            for (int i = 0; i < existingTasks.size(); i++) {
                existingTasks.get(i).setTaskNumber(i + 1);
            }
            mapper.writerWithDefaultPrettyPrinter().writeValue(ToDoData.FILE, existingTasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAllTasks(String filePath, List<ToDo> toDoList) {
        File file = new File(filePath);
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<ToDo> tasks = parsMethod(file, mapper);
            toDoList.addAll(tasks);
            for (ToDo task : tasks) {
                System.out.println(task.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<ToDo> parsMethod(File file, ObjectMapper mapper) throws IOException {
        String jsonContent = new String(Files.readAllBytes(Paths.get(file.getPath())));
        return mapper.readValue(jsonContent, mapper.getTypeFactory().constructCollectionType(List.class, ToDo.class));
    }

    public static void goToCurrentTask(Scanner scanner, ToDoData toDoData) {
        List<ToDo> toDoList = new ArrayList<>();
        System.out.println("------------------------------------------------");
        System.out.println("1 - что-бы просмотреть все задачи нажмите;");
        System.out.println("2 - что-бы посмотреть задачу по номеру нажмите;");
        System.out.println("3 - что-бы изменить задачу нажмите;");
        System.out.println("4 - что-бы вернутся в меню!");
        System.out.println("------------------------------------------------");
        int userVar = scanner.nextInt();
        if (userVar == 1) {
            toDoData.printAllTasks(FILE.getPath(), toDoList);
            MenuToDo.menu();
        } else if (userVar == 2) {
            toDoData.printTask(FILE.getPath());
            MenuToDo.menu();
        }else if (userVar == 3){
            toDoData.correctTask(FILE.getPath());
            MenuToDo.menu();
        }
    }
    public void correctTask(String filePath) {
        File file = new File(filePath);
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<ToDo> tasks = parsMethod(file, mapper);
            System.out.println("------------------------------------------------");
            System.out.println("Введите номер задачи для изменения:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            scanner.nextLine();
            ToDo selectedTask = null;
            for (ToDo task : tasks) {
                if (task.getTaskNumber() == num) {
                    selectedTask = task;
                    break;
                }
            }
            if (selectedTask != null) {
                System.out.println("------------------------------------------------");
                System.out.println("Выберите, что хотите изменить:");
                System.out.println("1 - Изменить статус задачи");
                System.out.println("2 - Изменить название задачи");
                System.out.println("------------------------------------------------");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> changeTaskStatus(scanner, selectedTask);
                    case 2 -> updateTaskName(scanner, selectedTask);
                    default -> {
                        System.out.println("Некорректный выбор.");
                        return;
                    }
                }
                mapper.writeValue(file, tasks);
            } else {
                System.out.println("Задача с указанным номером не найдена.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void updateTaskName(Scanner scanner, ToDo selectedTask) {
        System.out.println("------------------------------------------------");
        System.out.println("Введите новое название задачи:");
        String newTaskName = scanner.nextLine();
        selectedTask.setTaskName(newTaskName);
        System.out.println("------------------------------------------------");
        System.out.println("Название успешно изменено!");
        MenuToDo.menu();
    }

    private static void changeTaskStatus(Scanner scanner, ToDo selectedTask) {
        System.out.println("------------------------------------------------");
        System.out.println("Введите новый статус задачи:");
        String newStatus = scanner.nextLine();
        selectedTask.setStatus(newStatus);
        System.out.println("------------------------------------------------");
        System.out.println("Статус успешно изменен!");
        MenuToDo.menu();
    }

    public void printTask(String filePath) {
        File file = new File(filePath);
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<ToDo> tasks = parsMethod(file, mapper);
            System.out.println("------------------------------------------------");
            System.out.println("Введите номер задачи которую хотите получить:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            ToDo foundTask = null;
            for (ToDo task : tasks) {
                if (task.getTaskNumber() == num) {
                    foundTask = task;
                    break;
                }
            }
            if (foundTask != null) {
                System.out.println("Найденная задача:");
                System.out.println(foundTask);
            } else {
                System.out.println("Задача с номером " + num + " не найдена.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteTask(String filePath) {
        File file = new File(filePath);
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<ToDo> tasks = parsMethod(file, mapper);
            System.out.println("------------------------------------------------");
            System.out.println("Введите номер задачи которую хотите удалить:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            ToDo foundTask = null;
            for (ToDo task : tasks) {
                if (task.getTaskNumber() == num) {
                    foundTask = task;
                    break;
                }
            }
            if (foundTask != null) {
                tasks.remove(foundTask);
                System.out.println("------------------------------------------------");
                System.out.println("Задача успешно удалена.");
                mapper.writeValue(file, tasks);
            } else {
                System.out.println("Задача с указанным номером не найдена.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int counter() {
        taskCounter++;
        return taskCounter;
    }

}