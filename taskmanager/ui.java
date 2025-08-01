package taskmanager;

//imports
import java.util.Scanner;

public class ui { 
    public static void main(String[] args) {
        System.out.println("ui started . . .");
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

    public void printTaskUI(){
    }


}
