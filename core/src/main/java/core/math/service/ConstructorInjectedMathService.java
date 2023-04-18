package core.math.service;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;

public class ConstructorInjectedMathService implements MathService {

    private final SumCalculator sumCalculator;

    private final PowerOfCalculator powerOfCalculator;

    public ConstructorInjectedMathService(SumCalculator sumCalculator, PowerOfCalculator powerOfCalculator) {
        System.out.printf("Instantiating a %s instance", getClass().getSimpleName());
        this.sumCalculator = sumCalculator;
        this.powerOfCalculator = powerOfCalculator;
    }

    @Override
    public int calculateOnePlusTwoToThePowerOfThree() {
        return powerOfCalculator.powerOf(
                sumCalculator.sumOf(1, 2),
                3
        );
    }

    public SumCalculator getSumCalculator() {
        return sumCalculator;
    }

    public PowerOfCalculator getPowerOfCalculator() {
        return powerOfCalculator;
    }
}
