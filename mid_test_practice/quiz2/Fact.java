package quiz2;

public class Fact {
    public static int fact(int n) {
        int result = 1;
        if(n == 0){
            return result;
        }
        result = n * fact(n - 1);
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int f = fact(n);
        System.out.printf("fact(%d) = %d\n", n, f);
    }
}