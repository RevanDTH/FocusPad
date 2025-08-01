// imports
import taskmanager.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("FocusPad started . . .");
        TaskManager taskManager = new TaskManager();



        // tests
        System.out.println("[DEBUG] Creating Task1");
        Task task1 = new Task("Task1", "Testbeschreibung 1", false);
        taskManager.saveTask(task1);

        System.out.println("[DEBUG] Creating Task2");
        Task task2 = new Task("Task2", "Testbeschreibung 2", false);
        taskManager.saveTask(task2);


    }
}