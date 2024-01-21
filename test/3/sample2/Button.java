public class Button {
    //インスタンスフィールド
    String label;
    boolean pressed;
    //スタティックフィールド
    static int numPressed = 0;
    //コンストラクタ
    Button(String label){
        this.label = label;
        this.pressed = false;
    }
    Button(){
        this.label = "Untitled";
        this.pressed = false;
    }
    //メソッド
    void press(){
        pressed = true;
        numPressed ++;
        System.out.printf("presd: %d\n",numPressed );
    }
    //メソッド
    void release(){
        pressed = false;
        numPressed --;
        System.out.printf("release: %d\n",numPressed );
    }
}
