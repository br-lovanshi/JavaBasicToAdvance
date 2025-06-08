package solidPrinciple;

interface Worker{
    void work();
    void eat();
}

class Human implements Worker{

    @Override
    public void work() {
        System.out.println("Working..");
    }

    @Override
    public void eat() {
        System.out.println("Eating..");
    }
}

class Robot implements Worker{

    @Override
    public void work() {
        System.out.println("Working..");
    }

    @Override
    public void eat() {
        System.out.println("Can't eat"); // robot can't eat
    }
}


interface Work{
    void work();
}
interface Eat{
    void eat();
}
class Robot1 implements Work{

    @Override
    public void work() {

    }
}
public class ISP {

}

/*** SOLID -
 *  Single Entity Principle:- Single unit of work is required to change class.
 *  Open/closed Principle:- Class is open of modification but closed for extension.
 *  Liskov Substitution:-
 *  Dependency Inversion:-
***/
// No client should be forced to depend on methods it doesn’t use.