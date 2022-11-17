package aop.c_dynamicproxy;

import core.math.service.MathService;
import core.math.service.StandaloneMathService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main060c {

    public static void main(String[] args) {
        MathService mathService = createProxy(
                MathService.class,
                new TraceHandler(new StandaloneMathService())
        );
        mathService.calculateOnePlusTwoToThePowerOfThree();

        mathService = createProxy(
                MathService.class,
                new NoOpHandler()
        );
        mathService.calculateOnePlusTwoToThePowerOfThree();
    }

    @SuppressWarnings("unchecked")
    private static <T> T createProxy(Class<T> iface, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class<?>[]{iface},
                handler);
    }

}
