package xmlcontext.p_named_lookup;

import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020p {

    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext(Main020p.class, "context.xml");

        var mathService1 = context.getBean("mathService1", MathService.class);
        var mathService2 = context.getBean("mathService2", MathService.class);
    }

}
