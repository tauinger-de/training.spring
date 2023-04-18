package xml_factories.f_factory_beans;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.time.ZonedDateTime;

public class Main023f {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(Main023f.class, "context.xml");

        // get local time
        System.out.printf(
                "Current time in Berlin is: %s",
                applicationContext.getBean("berlinTime", ZonedDateTime.class)
        );
        System.out.printf(
                "Current time in New York is: %s",
                applicationContext.getBean("newYorkTime", ZonedDateTime.class)
        );
    }

}
