package solidPrinciple.SOLID;

interface Birds{
    void fly();
}

//LSP violation
class Ostrich implements Birds{

    @Override
    public void fly() {
        throw new UnsupportedOperationException(); // Ostrich can't fly
    }
}

interface Bird{
}

interface Flyable extends Birds{
    void fly();
}

class Ostrich1 implements Bird {

}
class Parrot implements Flyable{

    @Override
    public void fly() {
        System.out.println("Parrot is flying...");
    }
}
public class LiskovSubstitution {
    public static void main(String[] args) {

    }
}
// Child class should be replaceable without breaking.