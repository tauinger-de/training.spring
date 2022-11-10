package xmlcontext.q_properties;

import core.math.service.ParameterizedMathService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

public class Main020q {

    public static void main(String[] args) throws IOException {
        var context = new GenericXmlApplicationContext(Main020q.class, "context.xml");

        context.getBeansOfType(ParameterizedMathService.class)
                .values()
                .forEach(m -> m.calculate());
    }

}
