package opps.polymorphism;
class Vehicle{

    public void start(){
        System.out.println("Vehicle is starting...");
    }

    public void end(){
        System.out.println("Vehicle is ending...");
    }
}

class Bike extends Vehicle{

    @Override
    public void start(){
        System.out.println("Bike is starting...");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.end();
    }
}
