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

    public double getDistance(Circle other){
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2) + Math.pow(this.pointY - other.pointY,2));
    }
}
