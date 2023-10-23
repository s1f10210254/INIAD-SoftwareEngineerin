package assignment1;

public class Rectangle extends Figure {
    // インスタンス・フィールド width
    public final int width;

    // コンストラクタ
    public Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }
}