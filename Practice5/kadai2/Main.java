package kadai2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Dog dog = new Dog();
        Cat cat = new Cat();

        human.eat();
        human.run();
        human.talk();

        dog.eat();
        dog.run();
        dog.bark();

        cat.eat();
        cat.run();
        cat.bark();
    }
}

