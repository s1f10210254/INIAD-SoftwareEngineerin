public class TestBook {
    public static void main(String[] args) {
        // 1. Authorクラスのインスタンスを作成する
        Author author = new Author("Alice", "alice@example.com");
        // System.out.println(author.toString());
        
        //2. Bookクラスのインスタンスを作成する
        Book book = new Book("Dummybook", author, 5000);
        // System.out.println(book.toString()); 

        // 3. 2で作成したBookインスタンスの情報を出力する
        System.out.println(book.getName() + ", " + book.getAuthor().toString() + ", " + book.getPrice());

        // 4. 2で作成したBookインスタンスに対して、以下の操作を行う
        author.setEmail("alice2@example.com"); // Authorのメールアドレスを変更
        book.setPrice(5500); // 価格を変更
        // System.out.println(book.toString()); 

        // 5. 2で作成したBookインスタンスの情報を出力する
        System.out.println(book.getName() + ", " + book.getAuthor().toString() + ", " + book.getPrice());
    }
}
