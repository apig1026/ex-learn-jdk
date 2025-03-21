package im.andychu.learn.jdk14;

import java.util.Random;

/**
 * <a href="https://openjdk.org/jeps/361">
 *  JEP 361: Switch Expressions
 * </a>
 * @author andy.chu 2024/4/6
 */
public class JEP361 {
    public static void main(String[] args) {
        int input = new Random().nextInt();
        Type type = switch (input) {
            case 1 -> Type.A;
            case 2 -> Type.B;
            case 3, 4, 5 -> Type.C;
            default -> Type.D; // must cover all possible values, so needs 'default' here.
        };

        // type can't be null
        int output = switch (type) {
            case A -> 7;
            case B -> 8;
            case C, D -> 9;
        };

        System.out.println(output);
    }

    public enum Type {
        A, B, C, D
    }
}
