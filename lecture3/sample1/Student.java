public class Student {

    // Instance field
    String name;
    int grade;

    // Static field
    static int cnt = 0;
    
    // constructor
    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        cnt ++;
    }
    Student(String name){
        this(name, 1);
    }

    // instance methods
    boolean belongsToCourse() {
        return this.grade >= 2;
    }

    boolean belongsToCourse(int credit) {
        return (this.grade >= 2) && (credit >= 22);
    }

    //static method.
    static boolean older(Student a, Student b) {
        return a.grade > b.grade;
    }
}