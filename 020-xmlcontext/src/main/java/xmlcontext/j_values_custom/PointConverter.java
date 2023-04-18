package xmlcontext.j_values_custom;

import org.springframework.core.convert.converter.Converter;

import java.awt.*;

public class PointConverter implements Converter<String, Point> {
    @Override
    public Point convert(String source) {
        return new Point(1,2);
    }
}
