package core.math.service;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;

public class DelegatingMathService implements MathService {

    private final SumCalculator sumCalculator;

    private final PowerOfCalculator powerOfCalculator;

    public DelegatingMathService(SumCalculator sumCalculator, PowerOfCalculator powerOfCalculator) {
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

}
