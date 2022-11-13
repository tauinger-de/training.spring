package infrastructure.m_events;

import core.math.calculator.SumCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationContextEvent;

@Configuration
public class Main040m {

    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(Main040m.class.getPackageName());
        ctx.registerShutdownHook();

        ctx.addApplicationListener((MathEvent mathEvt) -> System.out.println(mathEvt));
        new MathUI(ctx).setVisible(true);
    }

    @Bean
    public SumCalculator sumCalculator() {
        return new SumCalculator();
    }
}
