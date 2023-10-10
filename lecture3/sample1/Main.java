public class Main {
    public static void main(String[] args) {
        Student student = new Student("Taro", 3);
        // student.name = "Taro";
        // student.grade = 4;
        System.out.printf("%s %d\n", student.name, student.grade);
    }
}