package kadai2;

public class Dog extends Animal implements Barkable {
    @Override
    public void bark() {
        System.out.println("Bowwow");
    }
}

