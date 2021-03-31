package behavioral.state.structure;

public class StateOne extends State {

    private Context context;

    public StateOne(Context context) {
        this.context = context;
    }

    @Override
    public void goNext(Context context) {
        context.setState(new StateTwo(context));
    }

    @Override
    public String toString() {
        return "StateOne";
    }
}
