package infrastructure.h_shutdown_hooks;

import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import core.math.service.ConstructorInjectedMathService;
import core.math.service.MathService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main040h {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(Main040h.class.getPackageName());
        ctx.registerShutdownHook();
    }

}
