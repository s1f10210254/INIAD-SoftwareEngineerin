package three;

public class Circle extends Shape{
    public Circle(double size){
        super(size);
    }

    @Override
    public double area(){
        return size * size * Math.PI;
    }
}
