package xmlcontext.a_context;

import core.Fmt;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020a {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(Main020a.class, "context.xml");

        // write data
        Fmt.printf("The context contains %d bean(s):", applicationContext.getBeanDefinitionCount());
        for (String name : applicationContext.getBeanDefinitionNames()) {
            Fmt.printf("  - %s", name);
        }
    }

}
