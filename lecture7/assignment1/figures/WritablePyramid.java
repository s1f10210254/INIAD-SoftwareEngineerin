package assignment1.figures;


import assignment1.base.Writable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritablePyramid extends Pyramid implements Writable {

    public WritablePyramid(int height) {
        super(height);
    }

    @Override
    public void write(String filename) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height - i; j++) {
                    out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    out.print("*");
                }
                out.println();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
