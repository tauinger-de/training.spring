package infrastructure.m_events;

public class SumEvent extends MathEvent {

	public final int term1;
	public final int term2;
	
	public SumEvent(Object source, int term1, int term2) {
		super(source);
		this.term1 = term1;
		this.term2 = term2;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [" + this.term1 + ", " + this.term2 + "]";
	}
}
