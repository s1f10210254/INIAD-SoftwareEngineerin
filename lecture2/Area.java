import java.util.Random;

public class Area {
    public static int random(){
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        return num;    
    }

    public static double math(int a){
        double result = a * a * Math.PI;
        return result;
    }

    public static void main (String[] args){
        int num = random();
        double a = math(num);
        System.out.printf("The area of a circle with a radius of %d is %f \n", num, a);
    }
}
