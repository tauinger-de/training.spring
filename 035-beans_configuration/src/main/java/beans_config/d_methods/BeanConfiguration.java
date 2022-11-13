package beans_config.d_methods;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import core.math.service.ConstructorInjectedMathService;
import core.math.service.MathService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean("sumCalc1")
    public SumCalculator sumCalculator1() {
        return new SumCalculator();
    }

    @Bean("sumCalc2")
    public SumCalculator sumCalculator2() {
        return new SumCalculator();
    }

    @Bean
    public PowerOfCalculator powerOfCalculator() {
        return new PowerOfCalculator();
    }

    @Bean
    public MathService mathService(@Qualifier("sumCalc1") SumCalculator sumCalculator) {
        return new ConstructorInjectedMathService(
                sumCalculator,
                powerOfCalculator() // call to @Bean method!
        );
    }

}
