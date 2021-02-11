package drafts;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Originator.Memento> mementos = new ArrayList<>();

    public void addMemento(Originator.Memento memento) {
        mementos.add(memento);
    }

    public Originator.Memento getMemento() {
        return mementos.get(1);
    }

}
