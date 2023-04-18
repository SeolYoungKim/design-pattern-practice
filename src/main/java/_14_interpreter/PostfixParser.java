package _14_interpreter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PostfixParser {
    private PostfixParser() {
    }

    public static PostfixExpression parse(String expression) {
        final Deque<PostfixExpression> stack = new ArrayDeque<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }

        return stack.pop();
    }

    private static PostfixExpression getExpression(final char c, final Deque<PostfixExpression> stack) {
        switch (c) {
            case '+' -> {
                return new PlusExpression(stack.pop(), stack.pop());
            }

            case '-' -> {
                final PostfixExpression right = stack.pop();
                final PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            }

            case '*' -> {
                return new MultiplyExpression(stack.pop(), stack.pop());
            }

            default -> {
                return new VariableExpression(c);
            }
        }
    }
}
