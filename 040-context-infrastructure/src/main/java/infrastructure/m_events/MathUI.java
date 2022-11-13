package infrastructure.m_events;

import core.math.calculator.SumCalculator;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;

public class MathUI extends JFrame {

    private final JTextField textFieldX = new JTextField(5);
    private final JTextField textFieldY = new JTextField(5);
    private final JButton buttonSum = new JButton("sum");
    private final JTextField textFieldResult = new JTextField(5);

    private final ApplicationContext ctx;

    public MathUI(ApplicationContext ctx) {
        this.ctx = ctx;
        this.buildUI();
        this.buttonSum.addActionListener(e -> this.onSum());
    }

    private void onSum() {
        final SumCalculator sumCalculator = this.ctx.getBean(SumCalculator.class);
        try {
            final int x = Integer.parseInt(this.textFieldX.getText());
            final int y = Integer.parseInt(this.textFieldY.getText());
            final int result = sumCalculator.sumOf(x, y);
            this.textFieldResult.setText(String.valueOf(result));
            this.ctx.publishEvent(new SumEvent(this, x, y));
        } catch (final NumberFormatException e) {
            this.textFieldResult.setText("Error");
            this.ctx.publishEvent(new ErrorEvent(this));
        }
    }

    private void buildUI() {
        this.setLayout(new FlowLayout());
        this.add(this.textFieldX);
        this.add(this.textFieldY);
        this.add(this.buttonSum);
        this.add(this.textFieldResult);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
