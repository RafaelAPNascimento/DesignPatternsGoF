package behavioral.chain_of_resp;

public class ConcreteHandlerN extends Handler {

    public ConcreteHandlerN(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("Concrete Handler N handling request");

        if (hasNext())
            next().handle(request);
        else
            System.out.println("Chain ended at Handler N");
    }
}
