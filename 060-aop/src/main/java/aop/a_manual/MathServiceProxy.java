package aop.a_manual;

import core.math.service.MathService;

public class MathServiceProxy implements MathService {

    private final MathService realMathService;

    public MathServiceProxy(MathService realMathService) {
        this.realMathService = realMathService;
    }

    @Override
    public int calculateOnePlusTwoToThePowerOfThree() {
        System.out.println("Before calculateOnePlusTwoToThePowerOfThree()");
        var result = realMathService.calculateOnePlusTwoToThePowerOfThree();
        System.out.println("After calculateOnePlusTwoToThePowerOfThree()");
        return result;
    }
}
