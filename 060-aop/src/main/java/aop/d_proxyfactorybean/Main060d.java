package aop.d_proxyfactorybean;

import core.Fmt;
import core.aop.TracingBeforeAdvice;
import core.math.calculator.SumCalculator;
import core.math.service.MathService;
import core.math.service.StandaloneMathService;
import org.springframework.aop.framework.ProxyFactoryBean;

public class Main060d {

    public static void main(String[] args) throws ClassNotFoundException {
        createProxyForInterface();
        System.out.println();
        createProxyForClass();
    }

    private static void createProxyForInterface() throws ClassNotFoundException {
        // construct proxy using Spring's ProxyFactoryBean
        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        proxyFactory.addAdvice(new TracingBeforeAdvice());
        proxyFactory.setProxyInterfaces(new Class<?>[]{MathService.class});
        proxyFactory.setTarget(new StandaloneMathService());
        var mathService = (MathService) proxyFactory.getObject();

        // call
        var result = mathService.calculateOnePlusTwoToThePowerOfThree();
        Fmt.printf("%d", result);
    }

    private static void createProxyForClass() {
        // construct proxy using Spring's ProxyFactoryBean
        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        proxyFactory.addAdvice(new TracingBeforeAdvice());
        proxyFactory.setTarget(new SumCalculator());
        var sumCalculator = (SumCalculator) proxyFactory.getObject();

        // call
        var result = sumCalculator.sumOf(4, 8);
        Fmt.printf("%d", result);
    }

}
