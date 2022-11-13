package beans_config.o_scope_lazy_dependson;

import core.Ctx;
import core.h2.H2Server;
import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
public class Main035o {

    public static void main(String[] args) {
        // using try syntax performs auto-close on context, which again calls destroy-method of H2 server
        try (final var ctx = new AnnotationConfigApplicationContext(Main035o.class.getPackageName())) {
            Ctx.printDetails(ctx);
            ctx.getBean(SumCalculator.class);
        }
    }

    @Bean
    @Lazy
    public PowerOfCalculator powerOfCalc() {
        return new PowerOfCalculator();
    }

    @Bean
    @DependsOn("powerOfCalc")
    @Lazy
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    // returning "Object" here would break the code since Spring doesn't know about the type due to @Lazy
    public SumCalculator sumCalc() {
        return new SumCalculator();
    }
}
