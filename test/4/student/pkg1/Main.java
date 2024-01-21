package student.pkg1;
import student.pkg2.Student;
public class Main {
    public static void main(String[] args){
        Student student = new Student("Taro", 3);
        System.out.printf("%s %d\n", student.name, student.grade);
        System.out.printf("%d students in total. \n", student.cnt);
        if(student.belongsToCourse()){
            System.out.println("Belongs to a course");
        }
        if(student.belongsToCourse(20)){
            System.out.println("Belongs to a course");
        }

        Student student2 = new Student("jiro",1);

        if(Student.older(student, student2)){
            System.out.printf("%s is older than %s.\n", student.name, student2.name);
        }

        Student student3 = new Student("hiroki");
        System.out.printf("%s %d\n", student3.name, student3.grade);

    }
    
}
