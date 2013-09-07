package work;

import java.util.ArrayList;
import java.util.List;

public class FactorNumber {
    private final Long number;
    private final Long delay;

    public FactorNumber(Long number){
        this(number, 0L);
    }
    public FactorNumber(Long number, Long delay) {
        this.number = number;
        this.delay = delay;
    }

    public List<Long> perform(){
        sleep(delay);
        return factor(number);
    }

    private static List<Long> factor(Long n) {
        List<Long> factors = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }

    private static void sleep(Long duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
