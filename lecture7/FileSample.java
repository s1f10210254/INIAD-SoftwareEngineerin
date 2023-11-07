import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileSample {
    public static void main(String[] args) {
        write(args[0]);
    }
    public static void write(String str) {
        try {
            File file = new File("test.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(str);
            writer.close();
        } catch(IOException e) {
            System.out.println("An error occurs.");
        }
    }
}