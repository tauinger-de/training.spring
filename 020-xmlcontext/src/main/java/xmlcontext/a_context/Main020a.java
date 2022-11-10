package xmlcontext.a_context;

import core.Fmt;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020a {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020a.class, "context.xml");
        Fmt.printf(
                "The context contains %d beans",
                applicationContext.getBeanDefinitionCount()
        );
    }

}
