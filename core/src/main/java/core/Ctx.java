package core;

import org.springframework.beans.factory.ListableBeanFactory;

public class Ctx {

    public static void printDetails(ListableBeanFactory factory) {
        Fmt.printf("The context contains %d bean(s):", factory.getBeanDefinitionCount());
        for (String name : factory.getBeanDefinitionNames()) {
            Fmt.printf("  - %s", name);
        }
    }
}
