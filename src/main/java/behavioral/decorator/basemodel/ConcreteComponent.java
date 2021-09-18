package behavioral.decorator.basemodel;

public class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("Execute CC");
    }
}
