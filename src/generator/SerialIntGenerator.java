package generator;

public class SerialIntGenerator implements IntGenerator {
    private static int counter = 0;

    @Override
    public int nextPositive() {
        return ++counter;
    }

    @Override
    public int nextNegative() {
        return --counter;
    }

    @Override
    public String getName() {
        return "SerialIntGenerator";
    }
}
