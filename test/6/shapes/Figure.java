package shapes;

public abstract class Figure {
    final int height;
    Figure(int height){
        this.height = height;
    }

    // public void draw(){
    //     for(int i=0; i < height; i++){
    //         System.out.println();
    //     }
    // }
    public abstract void draw();
}
