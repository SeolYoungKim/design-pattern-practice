package _14_interpreter;

import java.util.Map;

public interface PostfixExpression {
    int interpret(Map<Character, Integer> context);
}
