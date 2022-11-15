package annotation_context.s_scope_dependson;

import core.Fmt;
import org.springframework.stereotype.Component;

@Component("other")
public class OtherBean {

    public OtherBean() {
        Fmt.printf("Instantiating a %s instance", getClass().getSimpleName());
    }
}
