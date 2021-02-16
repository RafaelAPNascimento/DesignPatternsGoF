package behavioral.memento.structure;

public class Main {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("state A");
        caretaker.addMemento(originator.save());

        System.out.println(originator.getState());
        originator.setState("state B");
        System.out.println(originator.getState());
        caretaker.addMemento(originator.save());
        System.out.println(originator.getState());
        originator.setState("state C");
        System.out.println(originator.getState());

        originator.restore(caretaker.getMemento());
        System.out.println("\n========= after restores");
        System.out.println(originator.getState());
        originator.restore(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
