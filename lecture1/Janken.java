import java.util.Random;
import java.util.Scanner;

public class Janken {
    public static void main(String... args){
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("あなたの手？0:グー,1:チョキ,2:パー");
            String input = myScanner.nextLine();
            int YourHand = Integer.valueOf(input);
            System.out.println("あなた:" + YourHand);
            Random r = new Random();
            int randNum = r.nextInt(3);
            System.out.println("コンピュータ:" + randNum);

            
            switch (YourHand) {
                case 0:
                    if(randNum == 0){
                        System.out.println("引き分け");
                    }else if(randNum == 1){
                        System.out.println("あなたの勝ち");
                    }else{
                        System.out.println("コンピュータの勝");
                    }
                    break;
                case 1:
                    if(randNum == 0){
                        System.out.println("コンピュータの勝");
                    }else if(randNum == 1){
                        System.out.println("引き分け");
                    }else{
                        System.out.println("あなたの勝");
                    }
                    break;
                case 2:
                    if(randNum == 0){
                        System.out.println("あなたの勝");
                    }else if(randNum == 1){
                        System.out.println("コンピュータの勝ち");
                    }else{
                        System.out.println("引き分け");
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
