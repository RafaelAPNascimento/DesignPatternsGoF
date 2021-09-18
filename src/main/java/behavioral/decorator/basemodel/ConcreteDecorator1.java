package behavioral.decorator.basemodel;

public class ConcreteDecorator1 extends BaseDecorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    private void extra() {
        System.out.println("CD 1");
    }
}
