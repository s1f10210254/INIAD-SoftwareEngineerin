package q2;

public class Bug extends Task{
    private boolean open = true;
    public Bug(String title, String description){
        super(title, description);
    }

    public void close(){
        this.open = false;
    }

    @Override
    public String describe(){
        if(open == false){
            return String.format("[%s] (Closed) %s: %s", id, title, description);
        }
        return String.format("[%s] %s: %s", id, title, description);
    }
}
