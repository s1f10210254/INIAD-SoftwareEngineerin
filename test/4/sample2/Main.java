package sample2;

public class Main {
    public static void main(String[] args){
        Student st = new Student();
        st.id = "1234";
        st.name = "Taro";
        st.grade = 1;
        System.out.printf("%s %s %d\n", st.id, st.name,st.grade);
    }
}
