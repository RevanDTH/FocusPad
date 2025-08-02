package taskmanager;

//imports
import java.util.Scanner;

public class Ui { 
    public static void main(String[] args) {
        System.out.println("ui started . . .");
    }


    public String printMainStartUI(){
        String MainUI = """
        == FocusPad ==
        1. Neue Aufgabe erstellen
        2. Alle Aufgaben anzeigen
        3. Aufgabe bearbeiten
        4. Aufgabe löschen
        5. Beenden        
                """;
        System.out.println(MainUI);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }

    public void printTaskUI(){
    }


}
