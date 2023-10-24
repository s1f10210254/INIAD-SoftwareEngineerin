package kadai2;

public class Cat extends Animal implements Barkable {
    @Override
    public void bark() {
        System.out.println("Meow meow");
    }
}

