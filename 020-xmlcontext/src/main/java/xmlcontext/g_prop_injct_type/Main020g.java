package xmlcontext.g_prop_injct_type;

import core.Fmt;
import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020g {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020g.class, "context.xml");

        MathService mathService = applicationContext.getBean(MathService.class);
        System.out.printf(
                "(1 + 2) ^ 3 = %d",
                mathService.calculateOnePlusTwoToThePowerOfThree()
        );
    }

}
