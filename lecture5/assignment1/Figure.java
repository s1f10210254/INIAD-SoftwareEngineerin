package assignment1;

public class Figure {
    public final int height;

    public Figure(int height) {
        this.height = height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            System.out.println();
        }
    }
}