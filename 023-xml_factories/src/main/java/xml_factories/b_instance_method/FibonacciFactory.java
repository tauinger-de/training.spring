package xml_factories.b_instance_method;

public class FibonacciFactory {

    private Integer lastLastResult = null;
    private Integer lastResult = null;

    public int getNextFibonacci() {
        if (lastResult == null) {
            lastResult = 0;
        } else if (lastLastResult == null) {
            lastLastResult = 0;
            lastResult = 1;
        } else {
            int result = lastLastResult + lastResult;
            lastLastResult = lastResult;
            lastResult = result;
        }
        return lastResult;
    }
}
