package generic;

public class Main {
    public static void main(String[] args) {
        GenericsSample<String> g1 = new GenericsSample<String>("INIAD", "Toyo");
        System.out.printf("%s %s\n", g1.getFirst(), g1.getSecond());
        GenericsSample<Integer> g2 = new GenericsSample<Integer>(Integer.valueOf(10), Integer.valueOf(20));
        System.out.printf("%d %d\n", g2.getFirst().intValue(), g2.getSecond().intValue());
    } 
}