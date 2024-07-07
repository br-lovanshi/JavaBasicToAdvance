package basicConcept.dependencyInjection.tightCoupling;

import basicConcept.dependencyInjection.looseCoupling.Vehicle;

public class Journey {

    Vehicle vehicle;

    public void SetV(Vehicle v){
        this.vehicle = v;
    }

    public void stardJOurney(){
        System.out.println("Journey started.");
        vehicle.start();
    }
    
}
