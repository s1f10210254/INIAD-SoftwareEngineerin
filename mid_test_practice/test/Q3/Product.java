package test.Q3;

public class Product {
    private final int id;
    private static int cnt;
    private final String name;
    private final double weight;

    public Product(String name, double weight){
        this.name = name;
        this.weight = weight;
        cnt++;
        this.id = cnt;
    }

    public void print(){
        System.out.printf("No. %d: %s (weight: %f)", id, name, weight);
        System.out.println("");
    }

    public static int count(){
        return cnt;
    }
}
