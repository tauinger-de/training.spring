package core.math.calculator;

import core.Fmt;

public class SumCalculator {

    public SumCalculator() {
        Fmt.printf("Instantiating a %s instance", getClass().getSimpleName());
    }

    public int sumOf(int term1, int term2) {
        return term1 + term2;
    }

}
