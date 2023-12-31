package sample2;

public class Student extends Member{
    int grade;

    Student(String id, String name, int grade){
        super(id, name);
        this.grade = grade;
    }

    @Override
    String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile()); ////MemberクラスのgetProfileを呼び出す
        sb.append("Grade: ").append(grade).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
    }
}