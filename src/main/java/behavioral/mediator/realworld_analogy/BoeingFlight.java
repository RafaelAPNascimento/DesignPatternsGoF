package behavioral.mediator.realworld_analogy;

import java.util.concurrent.ThreadLocalRandom;

public class BoeingFlight extends Flight {

    public BoeingFlight(String flightName, ControlTower tower) {
        super(flightName, tower);
    }

    @Override
    public void startLanding() {

        System.out.println(String.format("> %s starts landing at %s...", flightName, controlTower.getName()));

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(100, 500));    // landing takes some time...
            setLanded(true);
            System.out.println(String.format(">>> %s has just landed at %s!", flightName, controlTower.getName()));
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

        System.out.println(String.format("%s is approaching the %s...", flightName, controlTower.getName()));

        try {
            while (!controlTower.isLandingAuthorized()) {
                System.out.println(this.flightName +" is waiting authorization to land...");
                Thread.sleep(500);
            }
            controlTower.requestPermissionToLand(this);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
