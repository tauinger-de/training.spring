package aop.c_invocationhandler;

import core.Fmt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * A no-operation handler returning 0.
 */
@SuppressWarnings("SuspiciousInvocationHandlerImplementation")
public class NoOpHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Fmt.printf("Ignoring call to method \"%s\"", method.toString());
        return 0; // we need to return some Integer when using this Handler on our MathService
    }

}
