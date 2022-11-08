package xmlcontext.a_context;

import core.Fmt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main02a {

    public static void main(String[] args) {
        var applicationContext = new ClassPathXmlApplicationContext("context.xml", Main02a.class);
        Fmt.printf(
                "The context contains %d beans",
                applicationContext.getBeanDefinitionCount()
        );
    }

}
