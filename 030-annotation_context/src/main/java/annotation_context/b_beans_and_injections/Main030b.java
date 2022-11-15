package annotation_context.b_beans_and_injections;

import core.Ctx;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main030b {

    public static void main(String[] args) {
        // create context
        var applicationContext = new AnnotationConfigApplicationContext(Main030b.class.getPackageName());

        // write data
        Ctx.printDetails(applicationContext);

        // get Runnables -- those implement our tests
        applicationContext.getBeansOfType(Runnable.class).values()
                .forEach(Runnable::run);
    }
}
