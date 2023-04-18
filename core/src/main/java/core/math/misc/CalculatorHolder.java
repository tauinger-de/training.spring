package core.math.misc;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;

public class CalculatorHolder {

    public CalculatorHolder() {
        System.out.println("Instantiating a CalculatorHolder");
    }

    public void setCalculators(SumCalculator s, PowerOfCalculator p) {
        System.out.printf("Received %s and %s", s.toString(), p.toString());
    }

}
