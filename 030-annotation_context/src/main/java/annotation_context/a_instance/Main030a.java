package annotation_context.a_instance;

import core.Fmt;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main030a {

    public static void main(String[] args) {
        // create context
        var applicationContext = new AnnotationConfigApplicationContext(Main030a.class.getPackageName());

        // write data
        Fmt.printf("The context contains %d bean(s):", applicationContext.getBeanDefinitionCount());
        for (String name : applicationContext.getBeanDefinitionNames()) {
            Fmt.printf("  - %s", name);
        }
    }
}
