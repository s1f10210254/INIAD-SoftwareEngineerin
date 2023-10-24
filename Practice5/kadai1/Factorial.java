package kadai1;

import java.util.function.Function;

public class Factorial implements Function<Integer, Integer> {
    
    @Override
    public Integer apply(Integer n) {
        if (n <= 1) return 1;
        return n * apply(n - 1);
    }
}

