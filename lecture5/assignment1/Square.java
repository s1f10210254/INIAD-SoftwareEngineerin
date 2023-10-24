package assignment1;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    // Square クラスは Rectangle クラスを継承しているため、
    // draw メソッドは Rectangle クラスのものをそのまま使用します。
}