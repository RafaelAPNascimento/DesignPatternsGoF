package behavioral.state.structure;

public class StateThree extends State {

    private Context context;

    public StateThree(Context context) {
        this.context = context;
    }

    @Override
    public void goNext(Context context) {
        context.setState(new StateOne(context));
    }

    @Override
    public String toString() {
        return "StateThree{}";
    }
}
