package member.pkg2;
import member.pkg1.Member;;
public class Student extends Member{
    int grade;

    //サブクラスからコンストラクタの継承
    public Student(String id, String name, int grade){
        super(id, name);
        this.grade = grade;
    }
    public Student(){
        super(null, null);
    }

    @Override
    public String getProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append("Grade: ").append(grade).append("\n");
        return sb.toString();
    }
}
