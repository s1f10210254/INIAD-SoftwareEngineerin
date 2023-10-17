public class Orange extends Fruit {

    @Override
    public void peel() {
        this.state = "membraned"; // オレンジ固有のpeelメソッドの動作
    }
}
