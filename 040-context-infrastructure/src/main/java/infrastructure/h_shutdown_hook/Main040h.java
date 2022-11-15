package infrastructure.h_shutdown_hook;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main040h {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(Main040h.class.getPackageName());
        ctx.registerShutdownHook();
    }

}
