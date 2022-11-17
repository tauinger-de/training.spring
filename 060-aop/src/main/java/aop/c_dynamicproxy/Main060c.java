package aop.c_dynamicproxy;

import core.math.service.MathService;
import core.math.service.SetterInjectedMathService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main060c {

    public static void main(String[] args) {
        MathService traceProxy = createProxy(
                MathService.class,
                new TraceHandler(new SetterInjectedMathService())
        );
        traceProxy.calculateOnePlusTwoToThePowerOfThree();
    }

    @SuppressWarnings("unchecked")
    private static <T> T createProxy(Class<T> iface, InvocationHandler handler) {
        return (T) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class<?>[]{iface},
                handler);
    }

}
