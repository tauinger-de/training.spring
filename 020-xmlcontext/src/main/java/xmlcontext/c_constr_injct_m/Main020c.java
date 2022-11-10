package xmlcontext.c_constr_injct_m;

import core.Fmt;
import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020c {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020c.class, "context.xml");

        MathService mathService = applicationContext.getBean(MathService.class);
        Fmt.printf(
                "(1 + 2) ^ 3 = %d",
                mathService.calculateOnePlusTwoToThePowerOfThree()
        );
    }

}
