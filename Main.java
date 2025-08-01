// imports
import taskmanager.*;

public class Main {

    // Settings
    static Boolean DebugMode = true;

    public static void main(String[] args) {
        if(DebugMode){System.out.println("[DEBUG] FocusPad started . . .");}
        TaskManager TaskManager = new TaskManager();
        ui uiHandler = new ui();
        
        uiHandler.printMainStartUI();



        // tests

        
    }
}