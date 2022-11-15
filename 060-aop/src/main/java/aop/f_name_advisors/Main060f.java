package aop.f_name_advisors;

import core.aop.TracingBeforeAdvice;
import core.math.calculator.PowerOfCalculator;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

public class Main060f {

    public static void main(String[] args) {
        var advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setAdvice(new TracingBeforeAdvice());
        advisor.addMethodName("power*");

        ProxyFactoryBean proxyFactory = new ProxyFactoryBean();
        proxyFactory.addAdvisor(advisor);
        proxyFactory.setTarget(new PowerOfCalculator());
        var powCalc = (PowerOfCalculator) proxyFactory.getObject();

        powCalc.powerOf(3, 4);
    }

}
