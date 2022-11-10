package xmlcontext.q_properties;

import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class Main020q {

    public static void main(String[] args) throws IOException {
        var resource = new ClassPathResource("/xmlcontext/q_properties/app.properties");
        System.out.println(resource.getPath());
        resource.getInputStream();

        var context = new GenericXmlApplicationContext(Main020q.class, "context.xml");
    }

}
