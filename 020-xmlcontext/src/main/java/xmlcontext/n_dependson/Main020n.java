package xmlcontext.n_dependson;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main020n {

    public static void main(String[] args) {
        new GenericXmlApplicationContext(Main020n.class, "context.xml");
    }

}
