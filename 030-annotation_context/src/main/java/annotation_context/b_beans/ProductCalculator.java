package annotation_context.b_beans;

import org.springframework.stereotype.Component;

@Component
public class ProductCalculator {

    public int productOf(int factor1, int factor2) {
        return factor1 * factor2;
    }

}
