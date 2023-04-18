package core.math.service;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;

public class SetterInjectedMathService implements MathService {

    protected SumCalculator sumCalculator;

    protected PowerOfCalculator powerOfCalculator;

    public SetterInjectedMathService() {
        System.out.printf("Instantiating a %s instance", getClass().getSimpleName());
    }

    @Override
    public int calculateOnePlusTwoToThePowerOfThree() {
        return powerOfCalculator.powerOf(
                sumCalculator.sumOf(1, 2),
                3
        );
    }

    public void setSumCalculator(SumCalculator sumCalculator) {
        this.sumCalculator = sumCalculator;
    }

    public void setPowerOfCalculator(PowerOfCalculator powerOfCalculator) {
        this.powerOfCalculator = powerOfCalculator;
    }
}
