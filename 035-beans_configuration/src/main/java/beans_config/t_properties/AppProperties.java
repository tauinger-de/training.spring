package beans_config.t_properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/beans_config/t_properties/app.properties") // must use fully-qualified (absolute) path
public class AppProperties {

    private final Environment env;

    public AppProperties(Environment env) {
        this.env = env;
    }

    public String getGreeting() {
        return env.getProperty("app.greeting");
    }
}
