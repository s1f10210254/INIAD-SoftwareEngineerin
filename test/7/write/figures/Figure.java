package write.figures;

public abstract class Figure {
    public final int height;
    Figure(int height){
        this.height = height;
    }
    public abstract void draw();
}
