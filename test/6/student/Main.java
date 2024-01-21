package student;

public class Main {
    public static void main(String[] args){
        Member st = new Student("2000", "Hiroki", 2);
        System.out.printf(st.getProfile());
        Member t = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(t.getProfile());
    }

}
