package annotation_context.x_mixing_with_xml;

import core.Ctx;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main030x {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(Main030x.class, "context.xml");

        // write data
        Ctx.printDetails(applicationContext);
    }

}
