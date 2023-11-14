package quiz6;

public final class AdvancedMachine extends Machine{
    //staticフィールド
    private static int total_price = 0;


    //コンストラクタ
    public AdvancedMachine(String model, int Price){
        super(model, Price);
        total_price += price;
    }

    //スタティックメソッド
    public static int getTotalPrice(){
        return total_price;
    }

    //インスタンスメソッド
    @Override
    public int getPrice(){
        return (int)(price * 1.1);
    }
}
