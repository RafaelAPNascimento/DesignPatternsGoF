package behavioral.memento.structure;

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public Memento save() {
        Memento memento = new Memento(state);
        return memento;
    }

    public void restore(Memento memento) {
        this.state = memento.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    class Memento {

        private String state;

        private Memento(String state) {
            this.state = state;
        }
    }
}
