package _14_interpreter;

import java.util.Map;

public class MinusExpression implements PostfixExpression {
    private final PostfixExpression left;
    private final PostfixExpression right;

    public MinusExpression(final PostfixExpression left, final PostfixExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(final Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
