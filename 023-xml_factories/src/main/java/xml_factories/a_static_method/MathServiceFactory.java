package xml_factories.a_static_method;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import core.math.service.ConstructorInjectedMathService;
import core.math.service.MathService;

public class MathServiceFactory {

    public static MathService create() {
        System.out.println("Constructing a MathService in MathServiceFactory");
        return new ConstructorInjectedMathService(
                new SumCalculator(),
                new PowerOfCalculator()
        );
    }
}
