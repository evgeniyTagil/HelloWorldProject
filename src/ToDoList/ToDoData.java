package ToDoList;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToDoData {

    public static final File FILE = new File("C:\\Users\\user\\IdeaProjects\\HelloWorldProject\\src\\ToDoList\\ToDo.json");

    public static void saveToList(ToDo toDo) {
        List<ToDo> toDoListData = new ArrayList<>();
        toDoListData.add(toDo);
        addToJson(FILE, toDoListData);
    }

    public static void addToJson(File file, List<ToDo> toDoListData) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, toDoListData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void getAllTask(File file, List<ToDo> toDoList) {
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            System.out.println(mapper.readValue(file,));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
