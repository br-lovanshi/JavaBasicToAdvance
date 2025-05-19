package oops.abstraction;

public interface Shape {
    void draw(); // abstract method
    void area(); // abstract method
    default void color() { // default method
        System.out.println("Default color");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
    @Override
    public void area() {
        System.out.println("Calculating area of Rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw(); // Drawing a Circle
        circle.area(); // Calculating area of Circle
        circle.color(); // Default color

        Shape rectangle = new Rectangle();
        rectangle.draw(); // Drawing a Rectangle
        rectangle.area(); // Calculating area of Rectangle
        rectangle.color(); // Default color
    }
}