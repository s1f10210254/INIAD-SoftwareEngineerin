public class TestFruits {

    public static void main(String... args) {
        Durian durian = new Durian();
        Orange orange = new Orange();
        Apple apple = new Apple();

        durian.peel();
        orange.peel();
        apple.peel();

        System.out.println("Durian state: " + durian.getState());
        System.out.println("Orange state: " + orange.getState());
        System.out.println("Apple state: " + apple.getState());
    }
}
