package shapes;

public class Figure {
    final int height;
    Figure(int height){
        this.height = height;
    }

    public void draw(){
        for(int i=0; i < height; i++){
            System.out.println();
        }
    }
}
