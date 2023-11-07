package sample1;

import sample1.pkg1.Member;
import sample1.pkg1.Programmer;
import sample1.pkg2.EngineeringStudent;
import sample1.pkg2.EngineeringTeacher;
import sample1.pkg2.Teacher;

public class Main {
    public static void main(String[] args, String id) {
        EngineeringStudent st = new EngineeringStudent("1234", "Taro", 1);
        System.out.printf(st.getProfile());
        checkSkill(st);
        System.out.println("-------------------------");
        
        EngineeringTeacher et = new EngineeringTeacher("5678", "Yamada", "Professor");
        System.out.printf(et.getProfile());
        checkSkill(et);
        Member t = new Teacher("1000", "Inoue", "Professor");
        // Member型でも、TeacherクラスのgetProfile()が呼ばれる
        System.out.println(t.getProfile());
    }

    private static void checkSkill(Programmer p) {
        if(p.canWritePython()) {
            System.out.println("I can write Python.");
        }
        if(p.canWriteC()) {
            System.out.println("I can write C.");
        }
        if(p.canWriteJava()) {
            System.out.println("I can write Java.");
        }
    }
}
