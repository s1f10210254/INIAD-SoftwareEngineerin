package quiz;

public final class AdvancedMachine extends Machine {
    // すべてのAdvancedMachineインスタンスの値段の合計を保持するスタティックフィールド
    private static int total_price = 0;

    // コンストラクタ
    public AdvancedMachine(String model, int price) {
        super(model, price);
        total_price += price;
    }

    // スタティックメソッド getTotalPrice
    public static int getTotalPrice() {
        return total_price;
    }

    // インスタンスメソッド getPrice (消費税込み)
    @Override
    public int getPrice() {
        return (int)(price * 1.1);
    }
}
