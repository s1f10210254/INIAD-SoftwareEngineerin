package member;
import member.pkg1.Member;
import member.pkg1.Programmer;
import member.pkg2.EngineeringStudent;
import member.pkg2.EngineeringTeacher;
import member.pkg2.Student;
import member.pkg2.Teacher;

public class Main {
    public static void main(String[] args){
        Member st = new Student("2000", "Hiroki", 2);
        System.out.printf(st.getProfile());
        Member t = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(t.getProfile());

        EngineeringStudent eg = new EngineeringStudent("3000", "ho", 1);
        System.out.printf(eg.getProfile());
        checkSkill(eg);

        EngineeringTeacher et = new EngineeringTeacher("10000", "Mr bred", "Professor");
        System.out.printf(eg.getProfile());
        checkSkill(et);
    }


    private static void checkSkill(Programmer p){
        if(p.canWritePython()){
            System.out.println("I can write Python.");
        }
        if(p.canWriteC()){
            System.out.println("I can write C.");
        }
        if(p.canWriteJava()){
            System.out.println("I can write Java.");
        }
    }

}
