package four;

public class Member {
    protected String title;
    protected String name;
    private String introduction; 

    public Member(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return introduction;
    }
}