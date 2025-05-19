package oops.abstraction;

public abstract class Vehicle {
    abstract void move();
    void fuelType(){
        System.out.println("Petrol");
    }
}

class Bike extends Vehicle {
    private String speed;

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }
    @Override
    void move() {
        System.out.println("Bike is moving");
    }

}

class MainClass1{
    public static void main(String[] args){
        Vehicle bike = new Bike();
        bike.move();
        bike.fuelType();
        Bike b = (Bike)bike; // downcasting
        b.setSpeed("100km/h");
        System.out.println("Bike speed: " + b.getSpeed());
    }
}