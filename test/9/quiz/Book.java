package quiz;
public class Book extends Item{
    Book(String name, int price){
        super(name, price);
    }

    @Override
    public int getTaxPrice() {
        int result = (int)(price * 1.1);
        return result;
    }
}
