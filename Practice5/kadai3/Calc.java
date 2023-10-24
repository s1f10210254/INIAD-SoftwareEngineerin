package kadai3;

public class Calc {
    private int value;

    public Calc(int value) {
        this.value = value;
    }

    public void add(int addition) {
        this.value += addition;
    }

    public void mul(int multiplier) {
        this.value *= multiplier;
    }

    public int getValue() {
        return this.value;
    }
}

