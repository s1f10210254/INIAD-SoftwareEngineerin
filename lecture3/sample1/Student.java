public class Student {
    String name;
    int grade;
    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    Student(String name){
        this(name, 1);
    }

    boolean belongsToCourse() {
        return this.grade >= 2;
    }
}