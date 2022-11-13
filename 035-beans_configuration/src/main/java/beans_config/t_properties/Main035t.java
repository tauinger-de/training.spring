package beans_config.t_properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main035t {

    public static void main(String[] args) {
        // using try syntax performs auto-close on context, which again calls destroy-method of H2 server
        var ctx = new AnnotationConfigApplicationContext(Main035t.class.getPackageName());

        // get and use property instance
        var appProperties = ctx.getBean(AppProperties.class);
        System.out.println(appProperties.getGreeting());
    }
}
