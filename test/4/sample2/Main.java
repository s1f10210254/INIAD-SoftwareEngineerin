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

        System.out.printf(st.getStudentProfile());

        Teacher t = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(t.getTeacherProfile());

        printMember(st);
        printMember1(st);
        printMember2(st);
    }

    private static void printMember(Member m){
        System.out.println("スーパークラスのインスタンス");
        System.out.printf("%s %s\n", m.id, m.name);
        System.out.println(m.getEmail());
    }
    private static void printMember1(Member m){
        System.out.println("サブクラスのインスタンスとして扱う");
        Student st = (Student)m;
        System.out.printf("%s %s\n", st.id, st.name);
        System.out.println(m.getEmail());
    }
    private static void printMember2(Member m){
        System.out.println("特定のクラスのインスタンスであるかを判定");
        if(m instanceof Student){
            Student st = (Student)m;
            System.out.printf("%s %s\n", st.id, st.name);
        }else{
            System.out.printf("%s %s\n", m.id, m.name);
        }
        System.out.println(m.getEmail());
    }
}
