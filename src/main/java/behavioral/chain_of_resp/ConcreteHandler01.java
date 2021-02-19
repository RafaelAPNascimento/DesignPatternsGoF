package behavioral.chain_of_resp;

public class ConcreteHandler01 extends Handler {

    public ConcreteHandler01(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("Concrete Handler 1 handling request");

        if (hasNext())
            next().handle(request);
        else
            System.out.println("Chain ended at Handler 01");
    }
}
