package annotation_context.d_lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleBean {

    private long startMillis;

    @PostConstruct
    public void starting() {
        System.out.printf("Starting up!");
        startMillis = System.currentTimeMillis();
    }

    @PreDestroy
    public void shutdown() {
        System.out.printf("Shutting down... I was alive for %d millis", System.currentTimeMillis() - startMillis);
    }
}
