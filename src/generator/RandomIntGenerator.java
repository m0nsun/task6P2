package generator;

import java.util.Random;

public class RandomIntGenerator implements IntGenerator {
    private Random random = new Random();

    @Override
    public int nextPositive() {
        return random.nextInt(Integer.MAX_VALUE);
    }
    @Override
    public int nextNegative() {
        return random.nextInt(Integer.MIN_VALUE);
    }

    @Override
    public String getName() {
        return "RandomIntGenerator";
    }
}
