package four;

public class MemberPage extends Member implements Page{
    public MemberPage(String title, String name) {
        super(title, name);
    }

    public String getHeading() {
        return String.format("Title: %s, Name: %s", title, name);
    }

    public String getContent() {
        return getIntroduction();
    }
} 
    

