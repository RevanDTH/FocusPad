// imports
import taskmanager.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("FocusPad started . . .");
        TaskManager TaskManager = new TaskManager();



        // tests
        System.out.println("[DEBUG] Creating Task1");
        Task task1 = new Task("Task1", "Testbeschreibung 1", false);
        TaskManager.saveTask(task1);

        System.out.println("[DEBUG] Creating Task2");
        Task task2 = new Task("Task2", "Testbeschreibung 2", false);
        TaskManager.saveTask(task2);

        System.out.println("[DEBUG] Creating Task3");
        Task task3 = new Task("Task3", "Testbeschreibung 3", false);
        TaskManager.saveTask(task3);

        TaskManager.removeTask(task3);

        System.out.println("All remaining tasks: " + TaskManager.getAllTasks().toString());
        
    }
}