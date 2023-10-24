package kadai3;

public class Add extends Calc {

    public Add(int value) {
        super(value);
    }

    @Override
    public void add(int addition) {
        if(addition > 0) {
            super.add(addition);
        }
    }
}
