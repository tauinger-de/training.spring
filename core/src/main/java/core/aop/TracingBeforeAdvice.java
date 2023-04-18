package core.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TracingBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.printf("Before %s", method.getName());
    }
}
