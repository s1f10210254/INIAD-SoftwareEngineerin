package write.figures;

public class Rectangle extends Figure{
    public final int width;
    public Rectangle(int height, int width){
        super(height);
        this.width = width;
    }

    @Override
    public void draw(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
