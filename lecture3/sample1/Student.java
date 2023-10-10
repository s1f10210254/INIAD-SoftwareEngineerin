public class Student {


    String name;
    int grade;
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
}