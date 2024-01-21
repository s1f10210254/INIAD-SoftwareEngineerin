package member.pkg2;
import member.pkg1.Member;
public class Teacher extends Member{
    private String title;

    public Teacher(String id, String name, String title){
        super(id, name);
        this.title = title;
    }

    @Override
    public String getProfile(){
        StringBuffer t = new StringBuffer();
        t.append("---- Teacher -----\n");
        t.append(super.getProfile());
        t.append("Title: ").append(title).append("\n");
        return t.toString();
    }

    @Override
    protected String getEmail(){
        return name + DOMAIN;
    }
}

