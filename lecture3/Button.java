public class Button {
    // ボタンの名称を表すString型のインスタンス・フィールド
    public String label;
    // ボタンが押されているか否かを表すboolean型のインスタンス・フィールド
    public boolean pressed;

    // 生成された全てのボタンのうち、pressedの値がtrueであるものの個数を表すint型のスタティック・フィールド
    public static int numPressed = 0;

    // String型の値を引数に取るコンストラクタ
    public Button(String label) {
        this.label = label;
        this.pressed = false; // 初期値はfalse
    }

    // 引数を取らないコンストラクタ
    public Button() {
        this.label = "Untitled"; // labelの値は"Untitled"になる
        this.pressed = false; // 初期値はfalse
    }

    // 引数も返り値もないメソッドpress
    public void press() {
        this.pressed = true; // pressedの値をtrueにする
        numPressed++;
    }

    // 引数も返り値もないメソッドrelease
    public void release() {
        if (this.pressed) {  // すでに解放されている場合はカウントダウンしない
            this.pressed = false;
            numPressed--; // スタティック・フィールドをデクリメント
        }
    }
}
