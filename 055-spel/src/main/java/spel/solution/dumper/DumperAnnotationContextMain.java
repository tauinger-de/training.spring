package spel.solution.dumper;

import core.log.Dumper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.core.io.ClassPathResource;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.List;

@Configuration
public class DumperAnnotationContextMain {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(DumperAnnotationContextMain.class.getPackageName());
    }

    @Bean(initMethod = "dump")
    Dumper createDumper(BeanFactory beanFactory) {
        var parser = new SpelExpressionParser();

        var beanFactoryEvalCtx = new StandardEvaluationContext();
        beanFactoryEvalCtx.setBeanResolver(new BeanFactoryResolver(beanFactory));

        var singleObjectEvalCtx = new StandardEvaluationContext(new ClassPathResource("context.xml", DumperAnnotationContextMain.class));

        var dumper = new Dumper();
        dumper.setLines(
                List.of(
                        parser.parseExpression("100+200").getValue(String.class),
                        parser.parseExpression("@someList.size()").getValue(beanFactoryEvalCtx, String.class),
                        parser.parseExpression("getDescription()").getValue(singleObjectEvalCtx, String.class),
                        parser.parseExpression("getURI()").getValue(singleObjectEvalCtx, String.class)
                )
        );
        return dumper;
    }

    @Bean("someList")
    List<Integer> createSomeList() {
        return List.of(1, 2, 3, 4, 5, 6, 7);
    }
}
