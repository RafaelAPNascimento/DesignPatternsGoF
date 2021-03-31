package behavioral.state.structure;

public class StateTwo extends State {

    private Context context;

    public StateTwo(Context context) {
        this.context = context;
    }

    @Override
    public void goNext(Context context) {
        context.setState(new StateThree(context));
    }

    @Override
    public String toString() {
        return "StateTwo{}";
    }
}
