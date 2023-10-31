package kadai1;

public class Student {
    private String name;
    private int age;
    private String studentID;

    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", StudentID: " + studentID;
    }
}


