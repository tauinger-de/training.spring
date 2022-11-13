package beans_config.l_lifecycle;

import core.h2.H2Server;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main035l {

    public static void main(String[] args) {
        // using try syntax performs auto-close on context, which again calls destroy-method of H2 server
        try (final var ctx = new AnnotationConfigApplicationContext(Main035l.class.getPackageName())) {
        }
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public H2Server h2Server() {
        return new H2Server().setPort(9092);
    }
}
