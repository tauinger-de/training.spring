package annotation_context.s_scope_dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main030s {

    public static void main(String[] args) {
        // create context
        var ctx = new AnnotationConfigApplicationContext(Main030s.class.getPackageName());

        //
        for (int n = 0; n < 10; n++) {
            System.out.println(
                    ctx.getBean(IndexedBean.class).getIndex()
            );
        }

    }
}
