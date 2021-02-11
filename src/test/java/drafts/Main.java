package drafts;

public class Main {

    public static void main(String[] args) {
        mementoDemo();
    }

    static void mementoDemo() {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        System.out.println(">>>>> current state: "+originator.getState());
        originator.setState("state 2");
        System.out.println(">>>>> current state: "+originator.getState());
        caretaker.addMemento(originator.save());
        originator.setState("state 3");
        System.out.println(">>>>> current state: "+originator.getState());
        caretaker.addMemento(originator.save());
        originator.setState("sate 4");
        System.out.println(">>>>> current state: "+originator.getState());
        originator.restore(caretaker.getMemento());
        System.out.println(">>>>> current state: "+originator.getState());
    }
}
