package core.math.misc;

import core.Fmt;
import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;

public class CalculatorHolder {

    public CalculatorHolder() {
        System.out.println("Instantiating a CalculatorHolder");
    }

    public void setCalculators(SumCalculator s, PowerOfCalculator p) {
        Fmt.printf("Received %s and %s", s.toString(), p.toString());
    }

}
