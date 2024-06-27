import javax.print.attribute.standard.PrinterInfo;

public class Principle {

    private String name;
    private String age;

    private static Principle principle;

    // constructor
    private Principle(String name, String age) {
        this.name = name;
        this.age = age;
    }

    // lazy way of creating object
    public static Principle getPrinciple(String name, String age) {

        if (principle == null) {
            principle = new Principle(name, age);
        }

        return principle;
    }

    // lazy way of creating object for thread safe access
    public static Principle getPrincipleThreadSafe(String name, String age) {

        if (principle == null) {

            synchronized (Principle.class) {
                
                if (principle == null) {
                    principle = new Principle(name, age);
                }
            }
        }

        return principle;
    }

    @Override
    public String toString() {

        return "Name " + name + " age " + age;
    }
}

/*
 * How to make singleton class in Java
 * 
 * 1. Make constructor as private
 * 2. Create static method that get constructor
 * 3. Create static variable that store object
 */