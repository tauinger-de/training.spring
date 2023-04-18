package xmlcontext.p_named_lookup;

import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020p {

    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext(Main020p.class, "context.xml");

        var mathService = context.getBean("mathService1", MathService.class);
        System.out.printf("Got MathService with concrete type `%s`", mathService.getClass().getSimpleName());

        mathService = context.getBean("mathService2", MathService.class);
        System.out.printf("Got MathService with concrete type `%s`", mathService.getClass().getSimpleName());
    }

}
