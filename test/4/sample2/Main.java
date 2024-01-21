package sample2;

public class Main {
    public static void main(String[] args){
        Student st = new Student();
        st.id = "1234";
        st.name = "Taro";
        st.grade = 1;
        System.out.printf("%s %s %d\n", st.id, st.name,st.grade);
        System.out.println(st.getEmail());

        //サブクラスコンストラクタからの継承
        Student st1 = new Student("2000", "Hiroki", 2);
        System.out.printf("%s %s %d\n", st1.id, st1.name,st1.grade);
        System.out.println(st1.getEmail());

    }
}
