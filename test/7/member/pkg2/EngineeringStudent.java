package member.pkg2;
import member.pkg1.Programmer;

public class EngineeringStudent extends Student implements Programmer{
    public EngineeringStudent(String id, String name, int grade){
        super(id, name, grade);
    }
    @Override
    public boolean canWritePython(){
        return true;
    }
    @Override
    public boolean canWriteC(){
        return (grade >= 2);
    }
    @Override
    public boolean canWriteJava(){
        return (grade >= 3);
    }

}
