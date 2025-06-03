package solidPrinciple;


interface Birds{
    void fly();
}

class Ostrich implements Birds{

    @Override
    public void fly() {
        throw new UnsupportedOperationException(); // Ostrich is bird but can't fly
    }
}

interface Bird{

}

interface Flyable{
    void fly();
}

class Parrot implements Birds, Flyable{
    @Override
    public void fly() {
        System.out.println("Parrot is flying...");
    }
}


public class LSP {
}
// Liskov substitution principle
// Subtypes must be replaceable by their parent type without breaking behavior.

