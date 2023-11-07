package sample2;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<String>();
        lst.add("This");
        lst.add("is");
        lst.add("INIAD");
        System.out.println(lst.get(0));
        lst.remove(0);
        System.out.println(lst.get(0));
   }
}





