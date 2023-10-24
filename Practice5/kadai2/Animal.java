package kadai2;

public abstract class Animal {
    protected String stomach;

    public Animal() {
        this.stomach = "empty";
    }

    public void eat() {
        this.stomach = "full";
    }

    public void run() {
        this.stomach = "hungry";
    }
}
