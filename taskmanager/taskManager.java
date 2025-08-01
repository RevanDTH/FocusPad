package taskmanager;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;
//import java.util.stream.Collectors;

public class taskManager {

    List<task> taskList = new ArrayList<task>();

    public static void main(String[] args) {
        System.out.println("TaskEditor package started . . .");
    }

    public void saveTask(task taskObject){
        taskList.add(taskObject);
    }

    public void removeTask(task taskObject){
        taskList.remove(taskObject);
    }

    public List<task> getAllTasks(){ 
        return taskList;
    }

    public task getTaskByTitle(String taskTitle){

        return taskList.stream()
            .filter(t -> t.getTitle().equals(taskTitle))
            .findFirst()
            .orElse(null);
    }

    public task getTaskByUuid(String uuid){

        return taskList.stream()
            .filter(t -> t.getUuid().equals(uuid))
            .findFirst()
            .orElse(null);
    }
}
