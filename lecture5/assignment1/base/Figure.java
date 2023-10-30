package assignment1.base;

public class Figure {
    // サブクラスのみからアクセス可能なフィールドにするために、protectedを使用
    protected final int height;

    // コンストラクタおよびインスタンスメソッドは外部からアクセス可能にするために、publicを使用
    public Figure(int height) {
        this.height = height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            System.out.println();
        }
    }
}
