import java.util.Scanner;

public class Binary {
    public static String convertToBinary(int num){
        if(num == 0){
            return "0";
        };
        String binary = "";
        while(num > 0){
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
    public static void main(String... args){
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("正の整数を入力してください");
            String input = myScanner.nextLine();
            int inputINT = Integer.valueOf(input);
            String result = convertToBinary(inputINT);
            System.out.println(result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
