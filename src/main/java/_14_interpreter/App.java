package _14_interpreter;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        final PostfixExpression postfixExpression = PostfixParser.parse("xyz+-a*");
        final int result = postfixExpression.interpret(Map.of(
                'x', 1,
                'y', 2,
                'z', 3,
                'a', 4
        ));

        System.out.println("result = " + result);
    }
}
