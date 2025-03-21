package im.andychu.learn.jdk10;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * <a href="https://openjdk.org/jeps/286">
 *  JEP 286: Local-Variable Type Inference
 * </a>
 * @author andy.chu 2024/4/6
 */
public class JEP286 {
    public static void main(String[] args) {
        var str = "abc";
        var integer = 1;
        var decimal = 1.2;
        var obj = BigInteger.ONE;
        var array = new ArrayList<String>();
    }
}
