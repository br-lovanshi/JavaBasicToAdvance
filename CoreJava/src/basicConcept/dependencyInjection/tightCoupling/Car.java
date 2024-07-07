package basicConcept.dependencyInjection.tightCoupling;

import basicConcept.dependencyInjection.looseCoupling.Vehicle;

public class Car implements Vehicle {

    public void trip(){
        System.out.println("Car trip started.");
    }
    @Override
    public void start(){
    trip();
    }
}
