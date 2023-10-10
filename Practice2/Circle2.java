public class Circle2 {
    
        int pointX;
        int pointY;
        double radius;
        String color;
    
        // コンストラクタ
        public Circle2(double r, String c, int X, int Y){
            radius = r;
            color = c;
            pointX = X;
            pointY = Y;
        }
    
        // 円周を計算
        public double getCircumference(){
            return Math.PI * 2 * radius;
        }
    
        // 2つのCircleオブジェクト間の中心点の距離を計算
        public double getDistance(Circle other){
            return Math.sqrt(Math.pow(this.pointX - other.pointX, 2) + Math.pow(this.pointY - other.pointY, 2));
        }
    
        // オブジェクトの情報を文字列として返す
        public String toString() {
            return "Circle2 [radius: " + radius + ", color: " + color + ", position: (" + pointX + ", " + pointY + ")]";
        }
    
        public static void main(String[] args) {
            Circle circle_1 = new Circle(5.0, "green", 5, 10);
            Circle circle_2 = new Circle(3.0, "yellow", -3, 5);
    
            System.out.println("Circle 1: " + circle_1);
            System.out.println("Circle 2: " + circle_2);
    
            System.out.println("Distance between Circle 1 and Circle 2: " + circle_1.getDistance(circle_2) + " units");
        }
    
    
}
