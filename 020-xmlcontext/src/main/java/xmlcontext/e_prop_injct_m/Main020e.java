package xmlcontext.e_prop_injct_m;

import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020e {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020e.class, "context.xml");

        MathService mathService = applicationContext.getBean(MathService.class);
        System.out.printf(
                "(1 + 2) ^ 3 = %d",
                mathService.calculateOnePlusTwoToThePowerOfThree()
        );
    }

}
