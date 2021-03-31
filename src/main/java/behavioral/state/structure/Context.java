package behavioral.state.structure;

public class Context {

    private State state;

    public Context() {
        state = new StateOne(this);
    }
    public void goNext() {
        state.goNext(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
