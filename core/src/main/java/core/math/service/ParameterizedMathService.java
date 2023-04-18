package core.math.service;

public class ParameterizedMathService extends SetterInjectedMathService {

    private final int term1;
    private final int term2;
    private final int power;

    public ParameterizedMathService(int term1, int term2, int power) {
        System.out.printf("Instantiating a %s instance", getClass().getSimpleName());
        this.term1 = term1;
        this.term2 = term2;
        this.power = power;
    }

    public int calculate() {
        System.out.printf("Calculating (%d + %d) ^ %d", this.term1, this.term2, this.power);
        return powerOfCalculator.powerOf(
                sumCalculator.sumOf(term1, term2),
                power
        );
    }
}
