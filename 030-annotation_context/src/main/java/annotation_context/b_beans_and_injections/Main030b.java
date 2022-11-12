package annotation_context.b_beans_and_injections;

import core.Fmt;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main030b {

    public static void main(String[] args) {
        // create context
        var applicationContext = new AnnotationConfigApplicationContext(Main030b.class.getPackageName());

        // write data
        Fmt.printf("The context contains %d bean(s):", applicationContext.getBeanDefinitionCount());
        for (String name : applicationContext.getBeanDefinitionNames()) {
            Fmt.printf("  - %s", name);
        }

        // get Runnables -- those implement our tests
        applicationContext.getBeansOfType(Runnable.class).values()
                .forEach(Runnable::run);
    }
}
