package xmlcontext.f_prop_injct_name;

import core.math.service.MathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020f {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020f.class, "context.xml");

        MathService mathService = applicationContext.getBean(MathService.class);
        System.out.printf(
                "(1 + 2) ^ 3 = %d",
                mathService.calculateOnePlusTwoToThePowerOfThree()
        );
    }

}
