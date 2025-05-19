package oops.abstraction;

public abstract class Car {
    abstract void start(); // abstract method

    void Car(){ // constructor
        System.out.println("Car is created");
    }
    
    // non-abstract method
    void stop(){
        System.out.println("Car is stopping");
    }
}

class Audi extends Car {

    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class BMW extends Car {
    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}

class Main{
    public static void main(String[] args){
        Car audi = new Audi();
        audi.start(); // Audi is starting
        audi.stop(); // Car is stopping

        Car bmw = new BMW();
        bmw.start(); // BMW is starting
        bmw.stop(); // Car is stopping
        // Car car = new Car(); // Cannot instantiate the type Car
    }

}