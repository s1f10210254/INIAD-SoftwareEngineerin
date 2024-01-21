package member.pkg1;

public class Member {
    protected static final String DOMAIN = "@iniad.org";
    private String id;
    protected String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }
    protected String getEmail(){
        return this.id + DOMAIN;
    }

    public String getProfile(){
        StringBuffer sb = new StringBuffer();
        sb.append("Id: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");
        return sb.toString();
    }
}
