package annotation_context.f_qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("special-service")
public class MeaningOfLifeService {

    private final MeaningOfLifeCalculator meaningOfLifeCalculator;

    public MeaningOfLifeService(@Qualifier("deep-thought") MeaningOfLifeCalculator meaningOfLifeCalculator) {
        this.meaningOfLifeCalculator = meaningOfLifeCalculator;
    }

    public Object getMeaningOfLife() {
        return this.meaningOfLifeCalculator.calculate();
    }
}
