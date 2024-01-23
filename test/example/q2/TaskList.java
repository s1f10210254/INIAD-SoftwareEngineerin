package q2;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks = new ArrayList<Task>();
    public TaskList(){
    }
    public void addTask(Task st){
        tasks.add(st);
    }

    public void print(){
        for(Task t: tasks){
            System.out.println(t.describe());
        }
    }
}
