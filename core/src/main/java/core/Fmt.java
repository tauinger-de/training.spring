package core;

public class Fmt {

    public static void printf(String pattern, Object... args) {
        var output = String.format(pattern, args);
        System.out.println(output);
    }
}
