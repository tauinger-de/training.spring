package annotation_context.f_qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("deep-thought")
public class DeepThought implements MeaningOfLifeCalculator {

    public Object calculate() {
        return 42;
    }

}
