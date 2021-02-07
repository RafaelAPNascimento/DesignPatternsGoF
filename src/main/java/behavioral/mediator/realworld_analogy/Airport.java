package behavioral.mediator.realworld_analogy;

public class Airport implements ControlTower {

    private Object lock;
    private String name;
    private boolean runwayFree;


    public Airport(String name) {
        this.name = name;
        lock = new Object();
    }

    @Override
    public void requestPermissionToLand(Flight flight) {

        synchronized (lock) {
            flight.setAuthorized(true);
        }
    }

    public boolean isRunwayFree() {
        return runwayFree;
    }

    @Override
    public String getName() {
        return name;
    }
}
