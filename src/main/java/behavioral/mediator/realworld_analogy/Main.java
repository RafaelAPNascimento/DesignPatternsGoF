package behavioral.mediator.realworld_analogy;

public class Main {

    public static void main(String[] args) {

        Airport miamiAirport = new Airport("Miami International Airport");
        Thread boeingFlyEmirates = new Thread(new BoeingFlight("Fly Emirates ", miamiAirport));
        Thread boeingLufthansa = new Thread(new BoeingFlight("Lufhtansa", miamiAirport));
        Thread boeingAmericanAirlines = new Thread(new BoeingFlight("American Airlines", miamiAirport));
        Thread boeingBritishAirways = new Thread(new BoeingFlight("Britsh Airways", miamiAirport));
        Thread boeingVirginAtlantic = new Thread(new  BoeingFlight("Virgin Atlantic ", miamiAirport));

        boeingFlyEmirates.start();
        boeingLufthansa.start();
        boeingAmericanAirlines.start();
        boeingBritishAirways.start();
        boeingVirginAtlantic.start();
    }
}
