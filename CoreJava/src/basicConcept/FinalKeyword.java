package basicConcept;

public class FinalKeyword {

    private final String COUNTRY_NAME;

    FinalKeyword(String countryName) {
        this.COUNTRY_NAME = countryName;
    }

    private static final String name = "Brajesh Lovanshi";

    public final void greet() {
        System.out.println("Hello" + name);
    }

    public static void main(String[] args) {
//        name = "Vicky"; // we cannot re-initialized final variable
//        System.out.println(name);

        FinalKeyword object = new FinalKeyword("BHARAT");
//        System.out.println(object.COUNTRY_NAME);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is runnable class method");
            }
        };

        runnable.run();
    }
}

class SupportClass1 extends FinalKeyword { // Final class cannot be inherit

    SupportClass1(String countryName) {
        super(countryName);
    }

// final method cannot be override by sub class
//    @Override
//    public final void greet(){
//        System.out.println("Namaste");
//    }

}

/**
 * 1. What is the final keyword in Java?
 * Final Keyword in Java is the modifier that can be apply on class, method and variable for restriction.
 * Final class cannot be inherited
 * Final method cannot be override
 * Final variable cannot be reassigned
 * <p>
 * 2. Can you declare a constructor as final?
 * No because constructor can not be override and inherited.
 * <p>
 * 3. What is the difference between finally and finalize?
 * <p>
 * Finally:- Finally is the block used in try-catch it will always execute regardless of exception occur or not it is used to close the session.
 * <p>
 * Finalize:- Finalize is the method called by garbage collection before destroy the object to clean the memory.
 * <p>
 * 4. Can you change the value of a final variable?
 * No, once a final variable is initialized, its value cannot be changed.
 * <p>
 * 5. What is a blank final variable?
 * Blank final variable is the variable that is not initialized while declaration we initialized this using constructor.
 * <p>
 * 6. Can a class be both abstract and final?
 * No, abstract class be created for inheritance but final class cannot be extends by another class.
 * <p>
 * 7.Can you declare an interface method as final?
 * No, methods in an interface are implicitly abstract and cannot be declared as final.
 */
