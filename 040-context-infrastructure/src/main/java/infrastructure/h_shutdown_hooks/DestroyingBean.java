package infrastructure.h_shutdown_hooks;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class DestroyingBean {

    @PreDestroy
    public void destroy() {
        System.out.println("Context is shutting down, bean is being destroyed");
    }
}
