package xml_factories.a_static_method;

import java.util.Random;

public class RandomNumberFactory {

    private static Random random = new Random();

    // private constructor prevents instantiation of this class
    private RandomNumberFactory() {
    }

    public static Integer getNextRandom() {
        return random.nextInt();
    }
}
