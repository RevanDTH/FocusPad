package taskmanager;

import java.util.UUID;

public class Task {
    String title;
    String uuid;
    String description;
    boolean isDone;

    public Task(String title, String description, boolean isDone){
        this.title = title;
        this.uuid = UUID.randomUUID().toString();
        this.description = description;
        this.isDone = isDone;
    }

    //setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void markAsDone(){
        this.isDone = true;
    }

    public void markAsUnDone(){
        this.isDone = false;
    }

    //getter
    public String getTitle(){
        return title;
    }

    public String getUuid(){
        return uuid;
    }

    public String getDescription(){
        return description;
    }

    public boolean getIsDone(){
        return isDone;
    }
}