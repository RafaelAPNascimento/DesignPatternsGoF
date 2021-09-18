package behavioral.decorator.basemodel;

public class ConcreteDecorator2 extends BaseDecorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    private void extra() {
        System.out.println("CD 2");
    }
}
