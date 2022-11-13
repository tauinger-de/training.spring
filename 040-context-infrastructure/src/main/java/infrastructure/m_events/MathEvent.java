package infrastructure.m_events;

import org.springframework.context.ApplicationEvent;

public abstract class MathEvent extends ApplicationEvent {

    public MathEvent(Object source) {
        super(source);
    }
}
