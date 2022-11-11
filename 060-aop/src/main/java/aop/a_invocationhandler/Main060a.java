package aop.a_invocationhandler;

import core.math.service.MathService;
import core.math.service.SetterInjectedMathService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main060a {

    public static void main(String[] args) {
        MathService noOpProxy = createProxy(
                MathService.class,
                new NoOpHandler()
        );
        noOpProxy.calculateOnePlusTwoToThePowerOfThree();

        System.out.println();

        MathService traceProxy = createProxy(
                MathService.class,
                new TraceHandler(new SetterInjectedMathService())
        );
        traceProxy.calculateOnePlusTwoToThePowerOfThree();
    }

    private static <T> T createProxy(Class<T> iface, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class<?>[]{iface},
                handler);
    }

}
