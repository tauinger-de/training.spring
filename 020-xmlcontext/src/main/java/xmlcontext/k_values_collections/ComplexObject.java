package xmlcontext.k_values_collections;

import core.Fmt;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {

    public void setSomeProperties(Properties someProperties) {
        Fmt.printf(
                "Received properties via setter:\n  %s",
                someProperties
        );
    }

    public void setIntegerList(List<Integer> integerList) {
        Fmt.printf(
                "Received a list of integer via setter:\n  %s",
                integerList
        );
    }

    public void setMixedList(List<?> someList) {
        Fmt.printf(
                "Received a mixed list via setter:\n  %s",
                someList
        );
    }

    public void setSomeMap(Map<String, Object> someMap) {
        Fmt.printf(
                "Received a mixed map via setter:\n  %s",
                someMap
        );
    }

    public void setSomeSet(Set<Boolean> booleanSet) {
        Fmt.printf(
                "Received a set of booleans via setter:\n  %s",
                booleanSet
        );
    }
}
