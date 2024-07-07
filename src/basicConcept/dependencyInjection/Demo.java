package basicConcept.dependencyInjection;

import basicConcept.dependencyInjection.tightCoupling.Bike;
import basicConcept.dependencyInjection.tightCoupling.Journey;

public class Demo {
    public static void main(String[] args) {

        Journey journey = new Journey();
        journey.SetV(new Bike());
        journey.stardJOurney();
    }
}
