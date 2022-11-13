package beans_config.q_import;

import beans_config.r_import2.AdditionalConfiguration;
import core.Ctx;
import core.Fmt;
import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@Import(AdditionalConfiguration.class)
@ComponentScan("beans_config.d_methods")
public class Main035q {

    public static void main(String[] args) {
        // create
        var ctx = new AnnotationConfigApplicationContext(Main035q.class.getPackageName());

        // say hello
        System.out.println(
            ctx.getBean("greeting", String.class)
        );

        //
        ctx.getBean(PowerOfCalculator.class);
    }
}
