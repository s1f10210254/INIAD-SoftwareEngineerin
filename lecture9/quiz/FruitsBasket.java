package quiz;

import java.util.ArrayList;
import java.util.List;

// フルーツバスケットを表すクラス
public class FruitsBasket {
    private List<Fruit> fruits;

    public FruitsBasket() {
        fruits = new ArrayList<>();
    }

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public void print() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getColor());
        }
    }
}
