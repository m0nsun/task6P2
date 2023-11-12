package generator;

public class TimeDependentIntGenerator implements IntGenerator {
    private static final int p = 10007; // Простое число больше 10000
    private static final int imax = Integer.MAX_VALUE;

    @Override
    public int nextPositive() {
        long currentTime = System.currentTimeMillis();
        return calculateValue(currentTime, imax);
    }

    @Override
    public int nextNegative() {
        long currentTime = System.currentTimeMillis();
        int positiveValue = calculateValue(currentTime, imax);
        return -positiveValue;
    }

    @Override
    public String getName() {
        return "TimeDependentIntGenerator";
    }

    private int calculateValue(long currentTime, int imax) {
        return (int) ((currentTime % p) / (double) p * imax);
    }
}
