public class Gcd {
    public static void main(String[] args){
        try{
            int a = Integer.parseUnsignedInt(args[0]);
            int b = Integer.parseUnsignedInt(args[1]);
            if(a < b){
                int tmp = a;
                a = b;
                b = tmp;
            }
            System.out.println("Gcd: " + gcd(a, b));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Specify two arguments. ");
        }catch(NumberFormatException e){
            System.out.println("Specify positive numbers.");
        }catch(ArithmeticException e){
            System.out.println("Specify non-zero numbers.");
        }finally{
            System.out.println("Done.");
        }
    }

    public static int gcd(int a, int b){
        if((a <= 0) || (b <= 0)){
            throw new IllegalArgumentException("Both arguments must be positive");
        }
        int r = a % b;
        if(r == 0){
            return b;
        }
        return gcd(b, r);
    }
}