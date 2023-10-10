public class Student {


    String name;
    int grade;
    // constructor
    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
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