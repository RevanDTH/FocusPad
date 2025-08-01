// imports
import taskmanager.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("FocusPad started . . .");
        taskManager taskManager = new taskManager();

        // tests

        System.out.println("[DEBUG] Creating Task1");
        task task1 = new task("Task1", "99999SD", "Testbeschreibung 1", false);
        taskManager.saveTask(task1);

        System.out.println("[DEBUG] Creating Task2");
        task task2 = new task("Task2", "88888SD", "Testbeschreibung 2", false);
        taskManager.saveTask(task2);


        System.out.println("[DEBUG] All Tasks: ");
        System.out.println(taskManager.getAllTasks()); 

         System.out.println("[DEBUG] Showing properties of Task1");
         System.out.println(task1.getTitle());
         System.out.println(task1.getDescription());
         System.out.println(task1.getUuid());
         System.out.println(task1.getIsDone());


         System.out.println("[DEBUG] Task with certain uuid: ");
         System.out.println(taskManager.getTaskByUuid("88888SD"));
    }
}
