package student;

public class Teacher extends Member{
    String title;

    Teacher(String id, String name, String title){
        super(id, name);
        this.title = title;
    }

    @Override
    String getProfile(){
        StringBuffer t = new StringBuffer();
        t.append("---- Teacher -----\n");
        t.append(super.getProfile());
        t.append("Title: ").append(title).append("\n");
        return t.toString();
    }

    @Override
    public boolean canReserveRoom(){
        return true;
    }
    @Override
    public String getEmail(){
        return id + DOMAIN;
    }
}
