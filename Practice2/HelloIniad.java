import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloIniad {
    public static void main(String[] args){
        // String filePath  = "./Practice2-1/sample.txt";
        

        try{
            File File = new File("./Practice2-1/sample.txt");
            FileWriter fileWriter = new FileWriter(File);
            fileWriter.write("Hello Iniad");
            fileWriter.close();

            System.out.println("テキストファイルの作成に成功しました");

        } catch(IOException ex){
            System.out.println(ex);
        }
    }
}
