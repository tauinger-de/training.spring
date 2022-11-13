package beans_config.x_mixing_with_xml;

import core.Fmt;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main035x {

    public static void main(String[] args) {
        new GenericXmlApplicationContext(Main035x.class, "context.xml");
    }

}
