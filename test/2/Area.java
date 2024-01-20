import java.util.Random;
public class Area {
    public static void main(String[] args){
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        float area = (float)(num * num * Math.PI);
        System.out.printf("The area of a circle with a radius of %d is %f\n", num, area);
    }
}
