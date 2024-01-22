package list;

import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;

public class Main {
    //LinkedList

    // public static void main(String[] args){
    //     List<String> lst = new LinkedList<String>();
    //     lst.add("This");
    //     lst.add("is");
    //     lst.add("INIAD");
    //     for(String s: lst){
    //         System.out.println(s);
    //     }
    // }
    
    //ArrayList
    public static void main(String[] args){
        List<String> lst = new ArrayList<String>();
        lst.add("This");
        lst.add("is");
        lst.add("INIAD");
        for(String s: lst){
            System.out.println(s);
        }
    }

}
