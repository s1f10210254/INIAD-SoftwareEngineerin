public class GCD {
    public GCD() {
    }

    public int solve(int a, int b) {
        if((a == 0) || (b == 0)) {
            throw new IllegalArgumentException();
        }

        if(a < 0) {
            a = -a;
        }

        if(b < 0) {
            b = -b;
        }

        for(;;) {
            int r = a % b;
            if(r == 0) {
                return b;
            }
            a = b;
            b = r;
        }
    }
}