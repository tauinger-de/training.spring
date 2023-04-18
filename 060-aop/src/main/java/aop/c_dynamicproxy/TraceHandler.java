package aop.c_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TraceHandler implements InvocationHandler {

    private final Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // trace before
        System.out.printf("Before method \"%s\"", method.toString());

        // try/catch for exceptions from `method.invoke()`
        try {
            // execute method
            final Object result = method.invoke(this.target, args);

            // trace after
            System.out.printf("After method \"%s\"", method.toString());
            return result;
        } catch (InvocationTargetException e) {
            // trace after with exception
            final Throwable te = e.getTargetException();
            System.out.printf("Exception of type \"%s\" thrown in method \"%s\"",
                    te.getClass().getSimpleName(), method.toString());
            throw te;
        }
    }
}
