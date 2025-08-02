package taskmanager;

//imports
import java.util.Scanner;
import taskmanager.TaskManager;
import java.util.ArrayList;
import java.util.List;

public class Ui { 
    public static void main(String[] args) {
        System.out.println("ui started . . .");
    }

    public String ReadInput(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }

    public void printMainStartUI(){
        String MainUI = """
        == FocusPad ==
        1. Neue Aufgabe erstellen
        2. Alle Aufgaben anzeigen
        3. Aufgabe bearbeiten
        4. Aufgabe löschen
        5. Beenden        
                """;
        System.out.println(MainUI);
    }

    public void printAllTasks(){
        TaskManager TM = new TaskManager();
        int index = 0;
        String AllTasksHeader = """
                == FocusPad ==
                """;
        List<Task> AllTasks = TM.getAllTasks();

        
        System.out.println(AllTasksHeader);
        for (Task task : AllTasks) {
            index++;
            System.out.println("("+String.valueOf(index)+")" + task.getTitle());
        }
    }


}
