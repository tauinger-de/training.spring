package core.log;

import java.util.List;

/**
 * This class can receive a list of strings, which it will then print to the console when running dump()
 */
public class Dumper {

    private List<String> lines;

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public void dump() {
        if (this.lines != null) {
            this.lines.forEach(System.out::println);
        }
    }
}
