package behavioral.mediator.realworld_analogy;

public abstract class Flight implements Runnable {

    protected String flightName;
    protected boolean landed;
    protected ControlTower controlTower;
    protected boolean authorized;

    public Flight(String flightName, ControlTower tower) {
        this.flightName = flightName;
        this.controlTower = tower;
    }

    protected void requestAuthToLand() {
        controlTower.requestPermissionToLand(this);
    }

    public abstract void startLanding();

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
        if (authorized)
            startLanding();
    }

    public boolean isLanded() {
        return landed;
    }

    public void setLanded(boolean landed) {
        this.landed = landed;
    }

    public String getFlightName() {
        return flightName;
    }
}
