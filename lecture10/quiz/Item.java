package quiz;
public class Item {
    private String name;
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getTaxPrice() {
        // This method should be overridden by subclasses to include the appropriate tax.
        throw new UnsupportedOperationException("This method should be overridden by subclasses.");
    }
}
