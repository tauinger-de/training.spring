package beans_config.t_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.net.URL;
import java.util.Arrays;

// !!!
// Run this class with the following system args:
// -Dtest-prop=Servus,Welcome,Ciao -Dapp.config.base-url=https://www.example.com
// !!!
@Configuration
public class Main035t {

    @Value("${test-prop}")
    private String[] testValues;

    @Value("${app.config.base-url}")
    URL baseUrl;

    public static void main(String[] args) {
        // using try syntax performs auto-close on context, which again calls destroy-method of H2 server
        var ctx = new AnnotationConfigApplicationContext(Main035t.class.getPackageName());

        // get and use property instance
        var appProperties = ctx.getBean(AppProperties.class);
        System.out.println(appProperties.getGreeting());
    }

    @PostConstruct
    public void printStuff() {
        System.out.println(Arrays.toString(this.testValues));
    }
}
