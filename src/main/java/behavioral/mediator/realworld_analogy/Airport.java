package behavioral.mediator.realworld_analogy;

public class Airport implements ControlTower {

    private Object permissionLock;
    private String name;
    private boolean landAuthorized = true;      // runway starts free


    public Airport(String name) {
        this.name = name;
        permissionLock = new Object();
    }

    @Override
    public void requestPermissionToLand(Flight flight) {

        synchronized (permissionLock) {
            landAuthorized = false;
            flight.setAuthorized(true);
            landAuthorized = true;
        }
    }

    public boolean isLandingAuthorized() {
        return landAuthorized;
    }

    @Override
    public String getName() {
        return name;
    }
}
