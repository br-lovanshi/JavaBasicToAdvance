package opps.inheritance;

class Animal {
    public String color;
    public boolean cute;

    public void eat(){
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal{

    public void barking(){
        System.out.println("Dog is barking.");
    }
}

public class SingleLevelInheritance {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.barking();

    }
}
