package quiz;

public class Machine {
    // 型番を表す String 型のインスタンス・フィールド
    protected final String model;
    // 値段を表す int 型のインスタンス・フィールド
    protected final int price;

    // コンストラクタ
    public Machine(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // インスタンス・メソッド getModel
    public String getModel() {
        return model;
    }

    // インスタンス・メソッド getPrice
    public int getPrice() {
        return price;
    }
}
