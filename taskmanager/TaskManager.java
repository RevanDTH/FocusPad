package taskmanager;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;
//import java.util.stream.Collectors;

public class TaskManager {

    List<Task> taskList = new ArrayList<Task>();

    public static void main(String[] args) {
        System.out.println("TaskEditor package started . . .");
    }

    public void saveTask(Task taskObject){
        taskList.add(taskObject);
    }

    public void removeTask(Task taskObject){
        taskList.remove(taskObject);
    }

    public List<Task> getAllTasks(){ 
        return taskList;
    }

    public Task getTaskByTitle(String taskTitle){

        return taskList.stream()
            .filter(t -> t.getTitle().equals(taskTitle))
            .findFirst()
            .orElse(null);
    }

    public Task getTaskByUuid(String uuid){

        return taskList.stream()
            .filter(t -> t.getUuid().equals(uuid))
            .findFirst()
            .orElse(null);
    }
}
