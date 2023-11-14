package quiz7;

//publicな抽象クラス
public abstract class Fruit {
    private double weight;

    //publicなコンストラクタ
    public Fruit(double weight){
        this.weight = weight;
    }

    //publicなメソッド
    public double getWeight(){
        return weight;
    }
    //publicな抽象メソッド
    public abstract String getColor();
}
