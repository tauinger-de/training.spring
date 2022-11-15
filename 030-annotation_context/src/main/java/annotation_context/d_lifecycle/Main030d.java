package annotation_context.d_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("EmptyTryBlock")
public class Main030d {

    public static void main(String[] args) {
        // create context with try() to make it auto-close
        try (var ctx = new AnnotationConfigApplicationContext(Main030d.class.getPackageName())) {
        }
    }
}
