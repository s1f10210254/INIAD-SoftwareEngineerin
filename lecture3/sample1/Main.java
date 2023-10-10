public class Main {
    public static void main(String[] args) {
        Student student = new Student("Taro", 3);
        System.out.printf("%s %d\n", student.name, student.grade);

        Student student2 = new Student("Jiro");
        System.out.printf("%s %d\n", student2.name, student2.grade);

        if(student.belongsToCourse()){
            System.out.println("Belongs to a couse");
        }
    }
}