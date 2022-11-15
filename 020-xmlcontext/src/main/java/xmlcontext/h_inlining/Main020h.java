package xmlcontext.h_inlining;

import core.Ctx;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020h {

    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext(Main020h.class, "context.xml");
        Ctx.printDetails(context);
    }

}
