package behavioral.memento.structure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {

    private Deque<Originator.Memento> mementos;

    public Caretaker() {
        mementos = new ArrayDeque<>();
    }

    public void addMemento(Originator.Memento memento) {
        mementos.push(memento);
    }

    public Originator.Memento getMemento() {
        return mementos.pop();
    }

}
