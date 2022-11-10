package xmlcontext.s_lazy;

import core.Fmt;
import core.math.calculator.PowerOfCalculator;
import core.math.calculator.SumCalculator;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;
import java.sql.SQLException;

public class Main020s {

    public static void main(String[] args) throws IOException, SQLException {
        var context = new GenericXmlApplicationContext(Main020s.class, "context.xml");
        Fmt.printf("Context created, counting %d beans", context.getBeanDefinitionCount());

        context.getBean(SumCalculator.class);
        context.getBean(PowerOfCalculator.class);
    }

}
