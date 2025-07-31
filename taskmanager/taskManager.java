package taskmanager;

import java.util.ArrayList;
import java.util.List;

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

    public List<task> getAllTasks(){ //NOTE: Not working correctly and giving back error in main, need to check docs for static / non static methods
        return taskList;
    }

    /*
    *     public void getTask(String taskID){}
    */
}
