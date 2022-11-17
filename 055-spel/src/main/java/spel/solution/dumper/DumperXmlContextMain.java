package spel.solution.dumper;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DumperXmlContextMain {

    public static void main(String[] args) {
        // create context
        var applicationContext = new GenericXmlApplicationContext(DumperXmlContextMain.class, "context.xml");
    }

}
