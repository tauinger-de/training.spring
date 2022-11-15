package annotation_context.f_qualifier;

import core.Fmt;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main030f {

    public static void main(String[] args) {
        // create context
        var ctx = new AnnotationConfigApplicationContext(Main030f.class.getPackageName());

        // https://www.goodreads.com/quotes/4637-o-deep-thought-computer-he-said-the-task-we-have
        var meaningOfLifeService = ctx.getBean(MeaningOfLifeService.class);
        Fmt.printf(
                "\nThe Answer to the Great Question...\nOf Life, the Universe and Everything...\nIs...\nIs...\n%s",
                meaningOfLifeService.getMeaningOfLife()
        );

    }
}
