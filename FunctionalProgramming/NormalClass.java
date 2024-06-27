package functionalProgramming;

abstract class Greet1{
    public abstract void greet();
}

class Indians extends Greet1{
    @Override
    public void greet(){
        System.out.println("Namaste!!");
    }
    public void ownMethod(){
        System.out.println("Indian style");
    }

}
public class NormalClass {
    public static void main(String[] args) {

        Greet1 greet1 = new Indians();
        greet1.greet();
        // greet1.ownMethod();

        Indians indians = new Indians();
        indians.greet();
        indians.ownMethod();
    }
}
