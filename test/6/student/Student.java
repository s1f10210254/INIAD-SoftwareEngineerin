package student;

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

    @Override
    String getProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append("Grade: ").append(grade).append("\n");
        return sb.toString();
    }

    @Override
    public boolean canReserveRoom(){
        return false;
    }

    @Override
    public String getEmail(){
        return id + DOMAIN;
    }

}
