public class Fact {
    public static int fact(int n){
        if(n == 1){
            return 1;
        }else{
            return n * fact(n - 1);
        }
    }
   public static void main(String[] args){
    int n = 5;
    int f = fact(n);
    System.out.printf("fact(%d) = %d\n", n,f);
   }
}  
