package xmlcontext.i_values_primitive;

import core.Fmt;
import core.math.service.ParameterizedMathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020i {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020i.class, "context.xml");

        ParameterizedMathService mathService = applicationContext.getBean(ParameterizedMathService.class);
        Fmt.printf(
                "Result is %d",
                mathService.calculate()
        );
    }

}
