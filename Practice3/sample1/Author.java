public class Author {
    String name;
    String email;

    Author(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return "Author [name=" + name + ", email=" + email + "]";
    }
    
    public static void main(String[] args){
        Author author = new Author("alice", "alice@example.com");
        System.out.println(author.toString());
    }
    
    
    
}
