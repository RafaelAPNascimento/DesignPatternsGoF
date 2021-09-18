package behavioral.decorator.basemodel;

public abstract class BaseDecorator implements Component {

    private Component wrappee;

    public BaseDecorator(Component component) {
        this.wrappee = component;
    }

    @Override
    public void execute() {
        this.wrappee.execute();
    }
}
