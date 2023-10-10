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

    public Author geAuthor(){
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
