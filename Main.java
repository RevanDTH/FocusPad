// imports
import taskmanager.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("FocusPad started . . .");


        // tests
        System.out.println("[DEBUG] Creating Task1");
        task task1 = new task("Task1", "99999SD", "Testbeschreibung 1", false);

        System.out.println("[DEBUG] Creating Task2");
        task task2 = new task("Task2", "88888SD", "Testbeschreibung 2", false);


        /*  
        System.out.println("[DEBUG] All Tasks: ");
        System.out.println(taskManager.getAllTasks()); 
         */

         System.out.println("[DEBUG] Showing properties of Task1");
         System.out.println(task1.getTitle());
         System.out.println(task1.getDescription());
         System.out.println(task1.getUuid());
         System.out.println(task1.getIsDone());

    }
}
