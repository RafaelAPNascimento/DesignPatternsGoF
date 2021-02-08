package behavioral.mediator.realworld_analogy;

public interface ControlTower {

    void requestPermissionToLand(Flight flight);

    String getName();

    boolean isLandingAuthorized();
}
