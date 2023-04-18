package beans_config.b_beans;

import core.Fmt;
import core.math.service.ParameterizedMathService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main035b {

    public static void main(String[] args) {
        // create context
        var applicationContext = new AnnotationConfigApplicationContext(Main035b.class.getPackageName());

        // write data
        System.out.printf("The context contains %d bean(s):", applicationContext.getBeanDefinitionCount());
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.printf("  - %s", name);
        }

        // get Runnables -- those implement our tests
        System.out.printf(
                "The result is %d",
                applicationContext.getBean(ParameterizedMathService.class).calculate()
        );
    }
}
