package sample2;

//Memberクラスを継承
public class Student extends Member{
    int grade;

    //サブクラスからコンストラクタの継承
    Student(String id, String name, int grade){
        super(id, name);
        this.grade = grade;
    }
    Student(){
        super(null, null);
    }

    String getStudentProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Grade: ").append(grade).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
    }
}
