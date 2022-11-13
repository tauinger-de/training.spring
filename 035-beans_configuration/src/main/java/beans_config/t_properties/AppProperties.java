package beans_config.t_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/beans_config/t_properties/app.properties")
public class AppProperties {

    @Autowired
    private Environment env;

    public String getGreeting() {
        return env.getProperty("app.greeting");
    }
}
