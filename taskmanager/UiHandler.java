package taskmanager;

//imports
import taskmanager.Ui;

public class UiHandler {
    public static void main(String[] args) {
        Ui UI = new Ui();
        UI.printMainStartUI();
        Boolean answered = false;

        while (!answered) {
            String userInput = UI.ReadInput();

            switch (userInput) {
                case "1":
                    //Open create menu for Tasks
                    answered = true;
                    break;
                case "2":
                    //Open show all tasks menu
                    
                    answered = true;
                    break;
                case "3":
                    //Open edit task menu
                    answered = true;
                    break;
                
                case "4":
                    //Open delete task menu
                    answered = true;
                    break;
                
                case "5":
                    answered = true;
                    System.exit(0);
                    break; //I think thats not needed but I leave it there (need to refactor the whole class)
                default:
                    break;
            }            
        }
        

    }
    
}
