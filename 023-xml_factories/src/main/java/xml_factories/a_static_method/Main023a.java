package xml_factories.a_static_method;

import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.time.LocalDateTime;

public class Main023a {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(Main023a.class, "context.xml");

        // get some randoms
        for (int n = 0; n < 3; n++) {
            System.out.printf(
                    "Got random number: %d",
                    applicationContext.getBean(Integer.class)
            );
        }

        // get current date-time
        System.out.printf(
                "Current date and time is: %s",
                applicationContext.getBean(LocalDateTime.class)
        );

        // get constructed MathService
        applicationContext.getBean(MathService.class);
    }

}
