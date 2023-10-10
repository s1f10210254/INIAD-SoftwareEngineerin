public class Book {
    private String name;
    private Author author;
    private double price;

    public Book(String name){
        this.name = name;
    }

    public Book(double price){
        this.price = price;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "Book [name=" + name + ", author=" + author.toString() + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        Author author = new Author("alice", "alice@example.com");
        Book book = new Book("Java Book", author, 1500);
        System.out.println(book.toString());
    }
}
