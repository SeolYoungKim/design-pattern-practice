package _17_state;

public class Human {
    private State state;

    public Human(final State state) {
        this.state = state;
    }

    public void changeStateTo(final State state) {
        this.state = state;
    }

    public void tellOfState() {
        state.tellOfState();
    }

    public boolean isSick() {
        return state.getClass() == SickState.class;
    }
}
