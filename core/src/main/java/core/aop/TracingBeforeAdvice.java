package core.aop;

import core.Fmt;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TracingBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        Fmt.printf("Before %s", method.getName());
    }
}
