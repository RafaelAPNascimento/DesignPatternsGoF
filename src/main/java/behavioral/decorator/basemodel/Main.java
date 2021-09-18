package behavioral.decorator.basemodel;

public class Main {

    public static void main(String[] args) {

        Component a = new ConcreteComponent();
        BaseDecorator b = new ConcreteDecorator1(a);
        BaseDecorator c = new ConcreteDecorator2(b);

        b.execute();
        System.out.println("\n============\n");
        c.execute();
    }

}
