package annotation_context.b_beans_and_injections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MultiplicationServiceTest implements Runnable {

    private MultiplicationService multiplicationService;

    @Autowired
    public void setMultiplicationService(MultiplicationService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }

    @Override
    public void run() {
        // test #1 - no factors
        int result = this.multiplicationService.multiply();
        if (result != 0) {
            throw new IllegalStateException("Product is " + result + ", expected 0");
        }

        // test #2 - just one factor
        result = this.multiplicationService.multiply(33);
        if (result != 33) {
            throw new IllegalStateException("Product is " + result + ", expected 33");
        }

        // test #3 - many factors
        result = this.multiplicationService.multiply(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        if (result != 3_628_800) {
            throw new IllegalStateException("Product is " + result + ", expected 3,628,800");
        }
    }

}
