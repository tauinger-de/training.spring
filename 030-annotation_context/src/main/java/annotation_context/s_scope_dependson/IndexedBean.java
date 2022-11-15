package annotation_context.s_scope_dependson;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@DependsOn({"other"})
public class IndexedBean {

    private static int instanceCount = 0;

    private int index;

    public IndexedBean() {
        instanceCount++;
        this.index = instanceCount;
    }

    public int getIndex() {
        return index;
    }
}
