public class Button {
    //インスタンスフィールド
    public final String label;
    private boolean pressed;
    //スタティックフィールド
    private static int numPressed = 0;

    
    //コンストラクタ
    public Button(String label){
        this.label = label;
        this.pressed = false;
    }
    public Button(){
        this.label = "Untitled";
        this.pressed = false;
    }
    //メソッド
    public void press(){
        pressed = true;
        numPressed ++;
        System.out.printf("presd: %d\n",numPressed );
    }
    //メソッド
    public void release(){
        pressed = false;
        numPressed --;
        System.out.printf("release: %d\n",numPressed );
    }

    public boolean isPressed(){
        return pressed;
    }
    public static int getNumPressed(){
        return numPressed;
    }
}
