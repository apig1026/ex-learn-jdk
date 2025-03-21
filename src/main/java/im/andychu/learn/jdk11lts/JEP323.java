package im.andychu.learn.jdk11lts;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * <a href="https://openjdk.org/jeps/323">
 *  JEP 323: Local-Variable Syntax for Lambda Parameters
 * </a>
 * @author andy.chu 2024/4/6
 */
public class JEP323 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> add = (var x, var y) -> String.valueOf(x + y);
    }
}
