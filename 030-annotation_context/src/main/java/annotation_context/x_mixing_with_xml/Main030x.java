package annotation_context.x_mixing_with_xml;

import core.Fmt;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main030x {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(Main030x.class, "context.xml");

        // write data
        Fmt.printf("The context contains %d bean(s):", applicationContext.getBeanDefinitionCount());
        for (String name : applicationContext.getBeanDefinitionNames()) {
            Fmt.printf("  - %s", name);
        }
    }

}
