public class ReferenceSample {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = x;
        y[0] = 100;
        System.out.printf("%d %d %d\n", x[0], x[1], x[2]);
    }
}