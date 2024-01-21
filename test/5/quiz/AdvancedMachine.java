package quiz;

public class AdvancedMachine extends Machine{
    private static int sum = 0;
    public AdvancedMachine(String model, int price){
        super(model, price);
        sum += price;
    }
    public static int getTotalPrice(){
        return sum;
    }
    
    @Override
    public int getPrice() {
        return (int)(super.getPrice() * 1.1);
    }
}
