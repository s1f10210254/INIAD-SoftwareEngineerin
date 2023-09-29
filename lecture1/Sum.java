import java.util.Scanner;

public class Sum {
    public static void main(String... args){
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Input two numbers");
            String input1 = myScanner.nextLine();
            String input2 = myScanner.nextLine();
            int result = Integer.valueOf(input1) + Integer.valueOf(input2);
            System.out.println(input1 + "puls" + input2 + "="+ result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
