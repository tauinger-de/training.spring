package xmlcontext.o_scopes;

import core.math.calculator.PowerOfCalculator;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020o {

    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext(Main020o.class, "context.xml");

        System.out.println("");

        var powCalc1 = context.getBean(PowerOfCalculator.class);
        var powCalc2 = context.getBean(PowerOfCalculator.class);
        System.out.printf(
                "Calculator 1 instance = %s, Calculator 2 instance = %s",
                powCalc1.hashCode(), powCalc2.hashCode()
        );
    }

}
