public class Main {
    public static void main(String[] args) {
        // Constractor and instance field
        Student student = new Student("Taro", 3);
        System.out.printf("%s %d\n", student.getName(), student.getGrade() );
        Student student2 = new Student("Jiro");
        System.out.printf("%s %d\n", student2.getName(), student2.getGrade());

        
        if(student.belongsToCourse()){
            System.out.println("Belongs to a couse");
        }

        //Instance method
        if(student.belongsToCourse(23)) {
            System.out.println("Belongs to a course.");
        }

        //Static field
        System.out.printf("%d stduents in total.\n", Student.getCnt());

        //Static method
        if(Student.older(student, student2)) {
            System.out.printf("%s is older than %s.\n", student.getName(), student2.getName());
        }
    }
}