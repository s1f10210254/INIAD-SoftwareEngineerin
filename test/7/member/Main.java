package member;


import member.pkg1.Member;


import member.pkg2.MemberList;
import member.pkg2.Student;
import member.pkg2.Teacher;

public class Main {
    public static void main(String[] args){
        // Member st = new Student("2000", "Hiroki", 2);
        // System.out.printf(st.getProfile());
        // Member t = new Teacher("1000", "Inoue", "Professor");
        // System.out.printf(t.getProfile());

        // EngineeringStudent eg = new EngineeringStudent("3000", "ho", 1);
        // System.out.printf(eg.getProfile());
        // checkSkill(eg);

        // EngineeringTeacher et = new EngineeringTeacher("10000", "Mr bred", "Professor");
        // System.out.printf(eg.getProfile());
        // checkSkill(et);

        // List<Member> lst = new ArrayList<Member>();
        // lst.add(new Student("1234", "Taro", 1));
        // lst.add(new Student("4231", "Jiro", 2));
        // lst.add(new Teacher("1000", "Inoue", "Professor"));
        // Collections.sort(lst);
        // for(Member m:lst){
        //     System.out.println(m.getProfile());
        // }

        // MemberList ml = new MemberList();
        // ml.add(new Student("1234", "Taro", 1));
        // ml.add(new Student("4231", "Jiro", 2));
        // System.out.println(ml.count());

        // Member m1 = ml.get(0);
        // System.out.println(m1.getProfile());

        // ml.remove(m1);
        // ml.add(new Teacher("1000", "Inoue", "Professor"));
        // System.out.println(ml.count());

        // Member m2 = ml.get(1);
        // System.out.println(m2.getProfile());

        MemberList ml = new MemberList();
        ml.add(new Student("1234", "Taro", 1));
        ml.add(new Student("4231", "Jiro", 2));
        System.out.println(ml.count());

        Member m1 = ml.get("1234");
        System.out.println(m1.getProfile());

        ml.remove("1234");
        ml.add(new Teacher("1000", "Inoue", "Professor"));
        System.out.println(ml.count());

        Member m2 = ml.get("1000");
        System.out.println(m2.getProfile());
    }


    // private static void checkSkill(Programmer p){
    //     if(p.canWritePython()){
    //         System.out.println("I can write Python.");
    //     }
    //     if(p.canWriteC()){
    //         System.out.println("I can write C.");
    //     }
    //     if(p.canWriteJava()){
    //         System.out.println("I can write Java.");
    //     }
    // }

}
