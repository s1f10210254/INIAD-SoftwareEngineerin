package q2;

public class Task {
    protected final int id;
    protected final String title;
    protected final String description;
    private static int cnt = 1;
    public Task(String title, String description){
        this.id  = cnt++;
        this.title = title;
        this.description = description;
    }
    public String describe(){
        StringBuffer p = new StringBuffer();
        
        p.append("[").append(id).append("] ").append(title).append(" :").append(description);
        

        String result = p.toString();
        return result;
    }


}
