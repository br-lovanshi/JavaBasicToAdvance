package solidPrinciple.SOLID;

interface Worker{
    void eat();
    void work1();
}

class Robot implements Worker{

    @Override
    public void eat() {// Robot can't eat

    }

    @Override
    public void work1() {

    }
}

interface Workable{
    void work();
}
interface Eatable{
    void eat();
}
class Robots implements Workable{

    @Override
    public void work(){
        System.out.println("Working...");
    }
}
public class InterfaceSegregation {
    public static void main(String[] args) {

    }
}

// Don't force a class to implement methods that it does not use.