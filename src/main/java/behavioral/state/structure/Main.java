package behavioral.state.structure;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();
        System.out.println(context.getState());
        context.goNext();
        System.out.println(context.getState());
        context.goNext();
        System.out.println(context.getState());
        context.goNext();
        System.out.println(context.getState());
        context.goNext();
        System.out.println(context.getState());
    }
}
