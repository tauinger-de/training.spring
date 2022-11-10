package xmlcontext.b_beans;

import core.Fmt;
import core.math.calculator.SumCalculator;
import org.springframework.context.support.GenericXmlApplicationContext;
import xmlcontext.a_context.Main020a;

public class Main020b {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020a.class, "context.xml");

        SumCalculator sumCalculator = applicationContext.getBean(SumCalculator.class);
        Fmt.printf(
                "1 + 2 = %d",
                sumCalculator.sumOf(1, 2)
        );
    }

}
