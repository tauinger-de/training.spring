package annotation_context.d_lifecycle;

import core.Fmt;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleBean {

    private long startMillis;

    @PostConstruct
    public void starting() {
        Fmt.printf("Starting up!");
        startMillis = System.currentTimeMillis();
    }

    @PreDestroy
    public void shutdown() {
        Fmt.printf("Shutting down... I was alive for %d millis", System.currentTimeMillis() - startMillis);
    }
}