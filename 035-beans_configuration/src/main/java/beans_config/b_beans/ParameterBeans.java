package beans_config.b_beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParameterBeans {

    @Bean
    public Integer term1() {
        return 0;
    }

    @Bean
    public Integer term2() {
        return 2;
    }

    @Bean("the-power")
    public Integer power() {
        return 10;
    }

}
