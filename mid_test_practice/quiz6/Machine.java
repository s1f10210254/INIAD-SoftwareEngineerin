package quiz6;

public class Machine {

    //全てのインタンス・フィールドは、コンストラクタ以外で
    //変更することはできず、
    //サブクラスからアクセスすることができる。

    //String 型のインスタンス・フィールド
    protected String model;
    //int 型のインスタンス・フィールド
    protected int price;

    //コンストラクタ（対応するインスタンスフィールドに設定）
    public Machine(String model, int price){
        this.model = model;
        this.price = price;
    }

    //インスタンスメソッド
    public String getModel(){
        return model;
    }

    public int getPrice(){
        return price;
    }
}
