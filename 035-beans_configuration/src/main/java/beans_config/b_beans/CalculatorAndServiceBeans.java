package beans_config.b_beans;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import core.math.service.ConstructorInjectedMathService;
import core.math.service.MathService;
import core.math.service.ParameterizedMathService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorAndServiceBeans {

    @Bean
    public SumCalculator sumCalculator() {
        return new SumCalculator();
    }

    @Bean
    public PowerOfCalculator powerOfCalculator() {
        return new PowerOfCalculator();
    }

    @Bean
    public MathService mathService(SumCalculator sumCalculator) {
        return new ConstructorInjectedMathService(
                sumCalculator, // uses parameter from this method
                powerOfCalculator() // performs call to @Bean method
        );
    }

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Bean
    public ParameterizedMathService mathService(SumCalculator sumCalculator, PowerOfCalculator powerOfCalculator,
                                                @Qualifier("term1") Integer term1, @Qualifier("term2") int term2,
                                                @Qualifier("the-power") int power) {
        var parameterizedMathService = new ParameterizedMathService(term1, term2, power);
        parameterizedMathService.setSumCalculator(sumCalculator);
        parameterizedMathService.setPowerOfCalculator(powerOfCalculator);
        return parameterizedMathService;
    }
}