package beans_config.b_beans;

import core.math.calculator.SumCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorBeans {

    @Bean
    public SumCalculator sumCalculator() {
        return new SumCalculator();
    }

}
