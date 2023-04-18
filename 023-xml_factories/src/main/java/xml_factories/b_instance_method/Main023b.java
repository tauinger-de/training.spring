package xml_factories.b_instance_method;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main023b {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(Main023b.class, "context.xml");

        // we can get the factory bean -- but we don't use it!
        applicationContext.getBean(FibonacciFactory.class);

        // dump fibonacci numbers
        for (int n = 0; n < 12; n++) {
            System.out.printf(
                    "Got %d",
                    applicationContext.getBean(Integer.class)
            );
        }
    }

}
