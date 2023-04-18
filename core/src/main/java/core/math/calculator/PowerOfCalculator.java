package core.math.calculator;

public class PowerOfCalculator {

    public PowerOfCalculator() {
        System.out.printf("Instantiating a %s instance", getClass().getSimpleName());
    }

    public int powerOf(int exponent, int power) {
        return (int) Math.pow(exponent, power);
    }

}
