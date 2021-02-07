package behavioral.mediator.realworld_analogy;

public interface ControlTower {

    public void requestPermissionToLand(Flight flight);

    public String getName();

    boolean isRunwayFree();
}
