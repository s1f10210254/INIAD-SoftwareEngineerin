package quiz;

public class DeliciousFood extends Item implements Eatable {

    public DeliciousFood(String name, int price) {
        super(name, price);
    }

    @Override
    public int getTaxPrice() {
        return (int)(price * 1.08);
    }

    @Override
    public String getTaste() {
        return "Delicious";
    }
}
