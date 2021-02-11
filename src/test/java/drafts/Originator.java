package drafts;

public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Originator: setting state to " + state);
        this.state = state;
    }

    public Memento save() {
        System.out.println("Originator: saving to Mememnto");
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state = memento.getState();
        System.out.println("Originator: state after restoring form Memento: "+ state);
    }

    public class Memento {

        private String state;

        Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
