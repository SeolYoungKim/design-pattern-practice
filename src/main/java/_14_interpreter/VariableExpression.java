package _14_interpreter;

import java.util.Map;

public class VariableExpression implements PostfixExpression {
    private final Character character;

    public VariableExpression(final Character character) {
        this.character = character;
    }

    @Override
    public int interpret(final Map<Character, Integer> context) {
        return context.get(character);
    }
}
