package xmlcontext.u_parent_context;

import core.Fmt;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;
import java.sql.SQLException;

public class Main020u {

    public static void main(String[] args) throws IOException, SQLException {
        // create common-context, later used as parent
        var commonContext = new GenericXmlApplicationContext(
                Main020u.class,
                "common-context.xml");
        Fmt.printf("Common-Context created, counting %d beans", commonContext.getBeanDefinitionCount());

        // separator line
        System.out.println();

        // construct regular context, this is the child context. note that we need to use ClassPathXmlApplicationContext
        // to specify the parent context at creation time (otherwise autowiring fails)
        var regularContext = new ClassPathXmlApplicationContext(
                new String[]{"context.xml"},
                Main020u.class,
                commonContext);
        Fmt.printf("Context created, counting %d beans", regularContext.getBeanDefinitionCount());
    }

}
