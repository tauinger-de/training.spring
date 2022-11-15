package aop.p_pointcut_advisor;

import core.Ctx;
import core.aop.TracingBeforeAdvice;
import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main060p {

    public static void main(String[] args) {
        // create context
        var context = new AnnotationConfigApplicationContext(Main060p.class.getPackageName());
        Ctx.printDetails(context);

        // do calls to see AOP advice triggering
        var c = context.getBean(SumCalculator.class);
        c.sumOf(1, 2);
    }

    @Bean
    public DefaultAdvisorAutoProxyCreator proxyCreator() {
        return new DefaultAdvisorAutoProxyCreator();
    }

    @Bean
    public RegexpMethodPointcutAdvisor pointcutAdvisor() {
        var advisor = new RegexpMethodPointcutAdvisor();
        advisor.setPattern(".*Calculator.*Of");
        advisor.setAdvice(new TracingBeforeAdvice());
        return advisor;
    }

    @Bean
    public SumCalculator sumCalculator() {
        return new SumCalculator();
    }

    @Bean
    public PowerOfCalculator powerOfCalculator() {
        return new PowerOfCalculator();
    }

}
