package behavioral.chain_of_resp;

public abstract class Handler {

    private Handler next;

    public Handler(){}

    public Handler(Handler next) {
        this.next = next;
    }

    public final Handler next() {
        return next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public abstract void handle(Request request);

}
