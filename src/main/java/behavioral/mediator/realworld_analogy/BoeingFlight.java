package behavioral.mediator.realworld_analogy;

import java.util.concurrent.ThreadLocalRandom;

public class BoeingFlight extends Flight {

    public BoeingFlight(String flightName, ControlTower tower) {
        super(flightName, tower);
    }

    @Override
    public void startLanding() {
        System.out.println(this.flightName +" start landing..."+ controlTower.getName());
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1500));
            setLanded(true);
            System.out.println(this.flightName +" has just landed at "+controlTower.getName());
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println(this.flightName +" is approaching "+ controlTower.getName());
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));

            controlTower.requestPermissionToLand(this);
            while (!isAuthorized()) {
                System.out.println(this.flightName +" is waiting authorization to land...");
                Thread.sleep(500);
                controlTower.requestPermissionToLand(this);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
