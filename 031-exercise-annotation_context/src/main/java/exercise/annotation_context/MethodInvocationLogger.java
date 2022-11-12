package exercise.annotation_context;

import java.util.ArrayList;
import java.util.List;

public class MethodInvocationLogger {

    private List<String> invocations = new ArrayList<>();

    public void trackInvocation(String methodName) {
        invocations.add(methodName);
    }

    public void printInvocations() {
        System.out.println("This logger tracked the following invocations:");
        invocations.forEach(i -> System.out.println("  - " + i));
    }
}
