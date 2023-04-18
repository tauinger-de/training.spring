package xmlcontext.m_parent_bean;

import core.Fmt;
import core.math.service.ParameterizedMathService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020m {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020m.class, "context.xml");

        ParameterizedMathService mathService = applicationContext.getBean(ParameterizedMathService.class);
        System.out.printf(
                "Result is %d",
                mathService.calculate()
        );
    }

}
