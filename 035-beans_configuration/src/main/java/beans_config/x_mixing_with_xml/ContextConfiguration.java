package beans_config.x_mixing_with_xml;

import core.Ctx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("beans_config.x_mixing_with_xml")
public class ContextConfiguration {

    @Autowired
    ApplicationContext ctx;

    @Bean
    public String someBean() {
        return "foo";
    }

    @PostConstruct
    public void init() {
        Ctx.printDetails(ctx);
    }
}
