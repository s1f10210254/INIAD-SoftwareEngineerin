package quiz;

abstract public class Fruit {
    private double weight;
    public Fruit(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    abstract String getColor();
}
