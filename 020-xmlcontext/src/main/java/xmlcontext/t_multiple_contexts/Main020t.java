package xmlcontext.t_multiple_contexts;

import core.Fmt;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;
import java.sql.SQLException;

public class Main020t {

    public static void main(String[] args) throws IOException, SQLException {
        // construct context by naming each individual context file
        var multiLocationsContext = new GenericXmlApplicationContext(
                Main020t.class,
                "calculators.xml", "services.xml");
        Fmt.printf("Context created, counting %d beans", multiLocationsContext.getBeanDefinitionCount());

        // separator line
        System.out.println();

        // construct context by loading context file, which imports the others
        var importingContext = new GenericXmlApplicationContext(
                Main020t.class,
                "context.xml");
        Fmt.printf("Context created, counting %d beans", importingContext.getBeanDefinitionCount());
    }

}
