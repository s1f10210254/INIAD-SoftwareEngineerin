package kadai3;

public class Mul extends Add {

    public Mul(int value) {
        super(value);
    }

    @Override
    public void mul(int multiplier) {
        if(multiplier > 0) {
            super.mul(multiplier);
        }
    }
}
