package infrastructure.c_methods;

import core.Log;
import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import core.math.service.MathService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Configuration
public class Main040c {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(Main040c.class.getPackageName());

        demoBeanDefinitions(ctx);
        demoContains(ctx);
        demoScopes(ctx);
        demIsTypeMatch(ctx);
        demoGetType(ctx);
        demoBeanNamesFor(ctx);
        demoIsActiveIsRunning(ctx);
        findAnnotationOnBean(ctx);
    }

    private static <T> void printArray(T[] elements) {
        for (final T element : elements)
            System.out.println(element);
    }

    private static void demoBeanDefinitions(ConfigurableApplicationContext ctx) {
        Log.startMethod();
        System.out.println(ctx.getBeanDefinitionCount());
        printArray(ctx.getBeanDefinitionNames());
    }

    private static void demoContains(ConfigurableApplicationContext ctx) {
        Log.startMethod();
        System.out.println(ctx.containsBean("mathService"));
        System.out.println(ctx.containsBean("sumCalculator"));
        System.out.println(ctx.containsBean("sumService"));
        System.out.println(ctx.containsBean("calculatorImpl"));
        System.out.println(ctx.containsBean("fooBar"));
    }

    private static void demoScopes(ConfigurableApplicationContext ctx) {
        Log.startMethod();
        System.out.println(ctx.isPrototype("mathService"));
        System.out.println(ctx.isSingleton("mathService"));
        System.out.println(ctx.isPrototype("sumCalculator"));
        System.out.println(ctx.isSingleton("sumCalculator"));
    }

    private static void demIsTypeMatch(ConfigurableApplicationContext ctx) {
        Log.startMethod();
        System.out.println(ctx.isTypeMatch("mathService", MathService.class));
        System.out.println(ctx.isTypeMatch("mathService", SumCalculator.class));
        System.out.println(ctx.isTypeMatch("mathService", PowerOfCalculator.class));
        System.out.println(ctx.isTypeMatch("sumCalculator", SumCalculator.class));
        System.out.println(ctx.isTypeMatch("sumCalculator", MathService.class));
    }

    private static void demoGetType(ConfigurableApplicationContext ctx) {
        Log.startMethod();
        System.out.println(ctx.getType("mathService").getName());
        System.out.println(ctx.getType("sumCalculator").getName());
    }

    private static void demoBeanNamesFor(ConfigurableApplicationContext ctx) {
        Log.startMethod();
        printArray(ctx.getBeanNamesForType(MathService.class));
        System.out.println();
        printArray(ctx.getBeanNamesForType(SumCalculator.class));
        System.out.println();
        printArray(ctx.getBeanNamesForAnnotation(Service.class));
        System.out.println();
        printArray(ctx.getBeanNamesForAnnotation(Component.class));
    }

    private static void demoIsActiveIsRunning(final ConfigurableApplicationContext ctx) {
        Log.startMethod();
        System.out.println(ctx.isActive());
        System.out.println(ctx.isRunning());
    }

    private static void findAnnotationOnBean(final ConfigurableApplicationContext ctx) {
        Log.startMethod();
        final Component component = ctx.findAnnotationOnBean("my-name", Component.class);
        if (component != null)
            System.out.println("\"" + component.value() + "\"");
    }

}
