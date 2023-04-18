package xmlcontext.b_beans;

import core.math.calculator.SumCalculator;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020b {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(Main020b.class, "context.xml");

        // write data
        System.out.printf("The context contains %d bean(s):", applicationContext.getBeanDefinitionCount());
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.printf("  - %s", name);
        }

        // access bean
        SumCalculator sumCalculator = applicationContext.getBean(SumCalculator.class);
        System.out.printf(
                "1 + 2 = %d",
                sumCalculator.sumOf(1, 2)
        );
    }

}
