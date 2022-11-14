package core.math.service;

/**
 * Simple implementation that doesn't require other beans.
 */
public class StandaloneMathService implements MathService {

    @Override
    public int calculateOnePlusTwoToThePowerOfThree() {
        return (int) Math.pow((1 + 2), 3);
    }

}
