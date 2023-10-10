public class Student {

    // constants
    final static int MIN_COURSE_GRADE = 2;
    final static int MIN_COURSE_CREDIT = 22;

    // Instance field
    final String name;
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
        return this.grade >= MIN_COURSE_CREDIT;
    }

    boolean belongsToCourse(int credit) {
        return (this.grade >= MIN_COURSE_GRADE) && (credit >= MIN_COURSE_CREDIT);
    }

    //static method.
    static boolean older(Student a, Student b) {
        return a.grade > b.grade;
    }
}