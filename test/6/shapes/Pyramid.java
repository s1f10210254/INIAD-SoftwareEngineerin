package shapes;

public class Pyramid extends Figure{
    Pyramid(int height){
        super(height);
    }

    @Override
    public void draw(){
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
