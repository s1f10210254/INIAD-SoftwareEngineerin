package sample2.pkg1;

public abstract class Member {
    // サブクラスから参照される DOMAIN / nameは protected
    protected static final String DOMAIN = "@iniad.org";
    protected String id;
    protected String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // 抽象メソッドに変更
    abstract protected String getEmail();
    public String getProfile() {
        StringBuffer sb = new StringBuffer(); 
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        String email = getEmail();
        sb.append("email: ").append(email).append("\n");

        if(canReserveRoom()) {
            sb.append("Room: OK").append("\n");
        } else {
            sb.append("Room: NG").append("\n");
        }

        return sb.toString();
    }

    public String getId(){
        return this.id;
    }

    abstract public boolean canReserveRoom();

}