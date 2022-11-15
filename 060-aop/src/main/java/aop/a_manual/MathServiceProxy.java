package aop.a_manual;

import core.math.service.MathService;

public class MathServiceProxy implements MathService {

    private final MathService realMathService;

    public MathServiceProxy(MathService realMathService) {
        this.realMathService = realMathService;
    }

    @Override
    public int calculateOnePlusTwoToThePowerOfThree() {
        // before
        System.out.println("Before calculateOnePlusTwoToThePowerOfThree()");

        // actual call
        var result = realMathService.calculateOnePlusTwoToThePowerOfThree();

        // after
        System.out.println("After calculateOnePlusTwoToThePowerOfThree()");
        return result;
    }
}
