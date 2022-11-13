package beans_config.r_import2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:beans_config/r_import2/beans.xml")
public class AdditionalConfiguration {

    @Bean
    public String greeting() {
        return "Hello World!";
    }

}
