import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println(i);
        }
        scanner.close();
    }
}
