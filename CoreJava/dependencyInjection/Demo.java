package dependencyInjection;

import dependencyInjection.tightCoupling.Bike;
import dependencyInjection.tightCoupling.Car;
import dependencyInjection.tightCoupling.Journey;

public class Demo {
    public static void main(String[] args) {

        Journey journey = new Journey();
        journey.SetV(new Bike());
        journey.stardJOurney();
    }
}
