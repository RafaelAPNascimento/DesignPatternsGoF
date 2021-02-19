package behavioral.chain_of_resp;

public class Main {

    public static void main(String[] args) {

        Request request = new Request();

        Handler h3 = new ConcreteHandlerN(null);
        Handler h2 = new ConcreteHandler02(h3);
        Handler h1 = new ConcreteHandler01(h2);

        h1.handle(request);
    }
}
