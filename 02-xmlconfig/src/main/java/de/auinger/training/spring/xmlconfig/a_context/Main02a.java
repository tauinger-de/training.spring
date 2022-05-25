package de.auinger.training.spring.xmlconfig.a_context;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main02a {

    public static void main(String[] args) {
        var applicationContext = new ClassPathXmlApplicationContext("context.xml", Main02a.class);
        var testString = applicationContext.getBean("test", String.class);
        System.out.println(testString);
    }

}
