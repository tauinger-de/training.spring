package annotation_context.s_scope_dependson;

import org.springframework.stereotype.Component;

@Component("other")
public class OtherBean {

    public OtherBean() {
        System.out.printf("Instantiating a %s instance", getClass().getSimpleName());
    }
}
