package mypackage;


import generator.IntGenerator;
import generator.RandomIntGenerator;
import generator.TimeDependentIntGenerator;
import generator.SerialIntGenerator;

public class App {

    public static void main(String[] args) {
        demoIntGenerator();
    }

    public static void demoIntGenerator() {
        IntGenerator[] generators = new IntGenerator[3];
        generators[0] = new RandomIntGenerator();
        generators[1] = new TimeDependentIntGenerator();
        generators[2] = new SerialIntGenerator();

        for (IntGenerator generator : generators) {
            System.out.println("Generator: " + generator.getName());
            for (int i = 0; i < 15; i++) {
                System.out.println("Positive: " + generator.nextPositive());
                System.out.println("Negative: " + generator.nextNegative());
            }
            System.out.println("----------------------");
        }
    }
}
