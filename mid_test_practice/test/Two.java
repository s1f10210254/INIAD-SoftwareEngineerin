package test;

import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        
        try(Scanner scanner = new Scanner(System.in)){
            // String result = "";

            // String input = myScanner.nextLine();
            // result += input;
            // while(input == "END"){
            //     System.out.println(result);
            //     return;
            // }
            String result = "END";
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);

            }
        }
        catch(java.lang.NumberFormatException ex){
            System.out.println("Please input integer");
        }
    }
}
