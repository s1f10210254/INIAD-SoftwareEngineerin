public class Circle {
    int pointX;
    int pointY;
    
    double radius;
    String color;


    //コンストラクタ
    public Circle(double r, String c, int X, int Y){
        radius  = r;
        color = c;
        pointX = X;
        pointY = Y;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public double getDistance(){
        
    }
}
