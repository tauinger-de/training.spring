package core.math.calculator;

import core.Fmt;

public class PowerOfCalculator {

    public PowerOfCalculator() {
        Fmt.printf("Instantiating a %s instance", getClass().getSimpleName());
    }

    public int powerOf(int exponent, int power) {
        return (int) Math.pow(exponent, power);
    }

}
