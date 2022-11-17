package aop.c_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class NoOpHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        out.printf("Ignoring call on method: %s", method.getName());

        Class<?> returnType = method.getReturnType();
        if (returnType.isPrimitive()) {
            if (returnType.equals(boolean.class)) {
                return false;
            } else if (returnType.equals(void.class)) {
                return null;
            } else if (returnType.equals(byte.class)) {
                return (byte) 0;
            } else if (returnType.equals(short.class)) {
                return (short) 0;
            } else if (returnType.equals(int.class)) {
                return 0;
            } else if (returnType.equals(long.class)) {
                return 0l;
            } else if (returnType.equals(float.class)) {
                return 0f;
            } else if (returnType.equals(double.class)) {
                return 0d;
            } else if (returnType.equals(char.class)) {
                return '\u0000';
            }
        }
        return null;
    }

}
