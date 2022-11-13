package spel;

import java.awt.*;
import java.beans.PropertyEditorSupport;

public class ColorPropertyEditor extends PropertyEditorSupport {

    private Color color;

    @Override
    public Object getValue() {
        return this.color;
    }

    @Override
    public void setValue(Object value) {
        this.color = (Color) value;
    }

    @Override
    public void setAsText(String text) {
        try {
            final String[] tokens = text.split(",");
            this.color = new Color(
                    Integer.parseInt(tokens[0]),
                    Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]));
        } catch (final Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
