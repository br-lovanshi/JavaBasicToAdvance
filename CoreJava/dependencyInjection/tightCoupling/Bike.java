package dependencyInjection.tightCoupling;

import dependencyInjection.looseCoupling.Vehicle;

public class Bike implements Vehicle {

    public void ride(){
        System.out.println("Riding on bike");
    }
    @Override
    public void start(){
        ride();
    }
}
