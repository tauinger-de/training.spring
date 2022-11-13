package infrastructure.m_events;

public class ErrorEvent extends MathEvent {

    public ErrorEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " []";
    }
}
