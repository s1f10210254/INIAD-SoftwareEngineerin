package sample1.pkg2;

public class Student {

    // constants
    public final static int MIN_COURSE_GRADE = 2;
    public final static int MIN_COURSE_CREDIT = 22;

    // Instance field
    private final String name;
    private int grade;

    // Static field
    private static int cnt = 0;

    // constructor
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        cnt ++;
    }
    public Student(String name){
        this(name, 1);
    }

    // instance methods
    public boolean belongsToCourse() {
        return this.grade >= MIN_COURSE_CREDIT;
    }

    public boolean belongsToCourse(int credit) {
        return (this.grade >= MIN_COURSE_GRADE) && (credit >= MIN_COURSE_CREDIT);
    }

    //static method.
    public static boolean older(Student a, Student b) {
        return a.grade > b.grade;
    }

    //Add following methods
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void promoteGrade() {
        grade++;
    }
    public static int getCnt() {
        return cnt;
    }
}