package three;

abstract public class Shape {
    protected final double size;

    public Shape(double size){
        this.size = size;
    }

    abstract public double area();
}
