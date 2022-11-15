package aop.a_manual;

import core.math.service.MathService;
import core.math.service.StandaloneMathService;

public class Main060a {

    public static void main(String[] args) {
        MathService traceProxy = createProxy(
                new StandaloneMathService()
        );
        traceProxy.calculateOnePlusTwoToThePowerOfThree();
    }

    // helper function to represent the act of creating a proxy
    private static MathService createProxy(MathService realMathService) {
        return new MathServiceProxy(realMathService);
    }

}
