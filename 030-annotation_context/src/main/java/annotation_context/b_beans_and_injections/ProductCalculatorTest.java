package annotation_context.b_beans_and_injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductCalculatorTest implements Runnable {

    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private ProductCalculator productCalculator;

    @Override
    public void run() {
        int result = productCalculator.productOf(3, 7);
        if (result != 21) {
            throw new IllegalStateException("Product is " + result + ", expected 21");
        }
    }
}
