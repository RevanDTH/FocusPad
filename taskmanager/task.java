package taskmanager;

public class task {
    String title;
    String uuid;
    String description;
    boolean isDone;

    public task(String title, String uuid, String description, boolean isDone){
        this.title = title;
        this.uuid = uuid;
        this.description = description;
        this.isDone = isDone;
    }

    public String getTitle(){
        return title;
    }

    public String getUuid(){
        return uuid;
    }

    public String getDescription(){
        return description;
    }

    public boolean isDone(){
        return isDone;
    }
}