package member.pkg2;
import member.pkg1.Programmer;

public class EngineeringTeacher extends Teacher implements Programmer{
    public EngineeringTeacher(String id, String name, String title){
        super(id, name, title);
    }

    @Override
    public boolean canWritePython(){
        return true;
    }
    @Override
    public boolean canWriteC(){
        return true;
    }
    @Override
    public boolean canWriteJava(){
        return true;
    }
}
