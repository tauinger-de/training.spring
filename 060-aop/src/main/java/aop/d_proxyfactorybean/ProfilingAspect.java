package aop.d_proxyfactorybean;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

import static java.lang.System.out;

public class ProfilingAspect implements MethodBeforeAdvice, AfterReturningAdvice {

    private long beforeMillis;

    public ProfilingAspect() {
        out.printf("Instantiating %s\n", getClass().getSimpleName());
    }

    @Override
    public void before(Method method, Object[] args, Object target) {
        this.beforeMillis = System.currentTimeMillis();
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        long duration = System.currentTimeMillis() - beforeMillis;
        out.printf("Execution of method %s() took %d ms\n", method.getName(), duration);
    }

}
