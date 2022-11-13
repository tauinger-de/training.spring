package beans_config.d_methods;

import core.Ctx;
import core.math.calculator.PowerOfCalculator;
import core.math.service.ConstructorInjectedMathService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main035d {

    public static void main(String[] args) {
        // create context
        var applicationContext = new AnnotationConfigApplicationContext(Main035d.class.getPackageName());

        // write data
        Ctx.printDetails(applicationContext);

        // show that PowerOfCalculator is same instance
        var powCalc = applicationContext.getBean(PowerOfCalculator.class);
        var mathService = applicationContext.getBean(ConstructorInjectedMathService.class);
        boolean isSame = (powCalc == mathService.getPowerOfCalculator());
        System.out.println(isSame);
    }
}
