package xmlcontext.k_values_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {

    public void setSomeProperties(Properties someProperties) {
        System.out.printf(
                "Received properties via setter:\n  %s",
                someProperties
        );
    }

    public void setIntegerList(List<Integer> integerList) {
        System.out.printf(
                "Received a list of integer via setter:\n  %s",
                integerList
        );
    }

    public void setMixedList(List<?> someList) {
        System.out.printf(
                "Received a mixed list via setter:\n  %s",
                someList
        );
    }

    public void setSomeMap(Map<String, Object> someMap) {
        System.out.printf(
                "Received a mixed map via setter:\n  %s",
                someMap
        );
    }

    public void setSomeSet(Set<Boolean> booleanSet) {
        System.out.printf(
                "Received a set of booleans via setter:\n  %s",
                booleanSet
        );
    }
}
