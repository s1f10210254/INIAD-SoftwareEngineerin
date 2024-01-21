package sample2;

public class Teacher extends Member{
    String title;

    Teacher(String id, String name, String title){
        super(id, name);
        this.title = title;
    }

    String getTeacherProfile(){
        StringBuffer t = new StringBuffer();
        t.append("---- Teacher -----\n");
        t.append("Id: ").append(id).append("\n");
        t.append("Name: ").append(name).append("\n");
        t.append("Title: ").append(title).append("\n");
        String email = getEmail();
        t.append("email: ").append(email).append("\n");
        return t.toString();
    }
}
