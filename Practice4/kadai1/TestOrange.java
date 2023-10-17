package kadai1;

public class TestOrange {
    public static void main(String... args){
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        orange1.peel();
        System.out.println("Orange 1: " + orange1.getState());
        System.out.println("Orange 2: " + orange2.getState());
    }

    // public static void main(String... args){
    //     Durian durian1 = new Durian();
    //     Durian durian2 = new Durian();

    //     durian1.peel();
    //     System.out.println("Durian 1: " + durian1.getState());
    //     System.out.println("Durian 2: " + durian2.getState());
    // }
}
