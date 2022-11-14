package spel.a_expressions;

import core.math.calculator.PowerOfCalculator;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main055a {

    public static void main(String[] args) {
        methodExpression();
    }

    private static void methodExpression() {
        var powerOfCalculator = new PowerOfCalculator();

        var expressionParser = new SpelExpressionParser();
        var context = new StandardEvaluationContext(powerOfCalculator);

        var result = expressionParser
                .parseExpression("powerOf(2,8)")
                .getValue(context, Integer.class);
        System.out.println(result);
    }
}
