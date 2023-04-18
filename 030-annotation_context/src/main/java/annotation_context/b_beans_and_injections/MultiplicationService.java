package annotation_context.b_beans_and_injections;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {

    private final ProductCalculator productCalculator;

    // This is constructor injection -- it doesn't require @Autowired if there is only one constructor
    public MultiplicationService(ProductCalculator productCalculator) {
        this.productCalculator = productCalculator;
    }

    public int multiply(int... factors) {
        if (factors.length == 0) {
            return 0;
        } else if (factors.length == 1) {
            return factors[0];
        } else {
            int result = factors[0];
            for (int n = 1; n < factors.length; n++) {
                result = this.productCalculator.productOf(result, factors[n]);
            }
            return result;
        }
    }

}
