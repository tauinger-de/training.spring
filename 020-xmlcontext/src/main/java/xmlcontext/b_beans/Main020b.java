package xmlcontext.b_beans;

import core.Fmt;
import core.math.SumCalculator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main020b {

    public static void main(String[] args) {
        var applicationContext = new ClassPathXmlApplicationContext("context.xml", Main020b.class);

        var someString = applicationContext.getBean("someString", String.class);
        Fmt.printf("Content of `someString` bean: \"%s\"", someString);

        SumCalculator sumCalculator = applicationContext.getBean(SumCalculator.class);
        Fmt.printf("1 + 2 = %d", sumCalculator.sumOf(1, 2));
    }

}
