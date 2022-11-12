package annotation_context.b_beans_and_injections;

import org.springframework.stereotype.Component;

@Component // or @Service
public class ProductCalculator {

    public int productOf(int factor1, int factor2) {
        return factor1 * factor2;
    }

}
