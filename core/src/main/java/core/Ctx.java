package core;

import org.springframework.beans.factory.ListableBeanFactory;

import static java.lang.System.out;

public class Ctx {

    public static void printDetails(ListableBeanFactory factory) {
        out.printf("The context contains %d bean(s):", factory.getBeanDefinitionCount());
        for (String name : factory.getBeanDefinitionNames()) {
            out.printf("  - %s : %s\n", name, factory.getType(name).getName());
        }
    }
}
