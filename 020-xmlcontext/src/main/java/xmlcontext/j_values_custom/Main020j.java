package xmlcontext.j_values_custom;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.awt.*;

public class Main020j {

    public static void main(String[] args) {
        var applicationContext = new GenericXmlApplicationContext(Main020j.class, "context.xml");

        Rectangle rectangle = applicationContext.getBean(Rectangle.class);
        System.out.println(rectangle);
    }

}
