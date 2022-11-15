package beans_config.q_import;

import beans_config.r_import2.AdditionalConfiguration;
import core.Ctx;
import core.math.calculator.PowerOfCalculator;
import core.math.service.MathService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AdditionalConfiguration.class)
@ComponentScan("beans_config.d_methods")
public class Main035q {

    public static void main(String[] args) {
        // create and print details
        var ctx = new AnnotationConfigApplicationContext(Main035q.class.getPackageName());
        Ctx.printDetails(ctx);

        // say hello
        System.out.println(
                ctx.getBean("greeting", String.class)
        );

        // get a calculator
        ctx.getBean(PowerOfCalculator.class);

        // get a math-service
        ctx.getBean("setterInjectedMathService", MathService.class);
    }
}
