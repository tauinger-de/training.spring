package xmlcontext.j_values_custom;

import java.awt.*;
import java.beans.PropertyEditorSupport;

public class PointPropertyEditor extends PropertyEditorSupport {

    private Point point;

    @Override
    public Object getValue() {
        return this.point;
    }

    @Override
    public void setValue(Object value) {
        this.point = (Point) value;
    }

    @Override
    public void setAsText(String text) {
        try {
            String[] tokens = text.split(":");
            this.point = new Point(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
