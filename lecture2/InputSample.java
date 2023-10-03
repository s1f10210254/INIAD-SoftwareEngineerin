import java.util.Scanner;

public class InputSample {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNextLine()){
                String i = scanner.nextLine();
                System.out.println(i);
            }
        }
    }
}
