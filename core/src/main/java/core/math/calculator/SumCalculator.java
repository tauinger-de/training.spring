package core.math.calculator;

public class SumCalculator {

    public SumCalculator() {
        System.out.printf("Instantiating a %s instance", getClass().getSimpleName());
    }

    public int sumOf(int term1, int term2) {
        return term1 + term2;
    }

}
