package assignment1.base;

public abstract class Figure {
    // サブクラスのみからアクセス可能なフィールドにするために、protectedを使用
    protected final int height;

    // コンストラクタおよびインスタンスメソッドは外部からアクセス可能にするために、publicを使用
    public Figure(int height) {
        this.height = height;
    }

    // 抽象メソッド draw
    public abstract void draw();
}
