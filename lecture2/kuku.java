import java.util.Scanner;

public class kuku {
    public static void main(String [] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input number");
            String input = scanner.nextLine();
            int inputNumber = Integer.valueOf(input);
            for(int i = 1; i<10; i++){
                System.out.printf("%d * %d = %d \n", inputNumber, i, inputNumber * i);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
