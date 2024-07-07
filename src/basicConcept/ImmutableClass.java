package basicConcept;

final public class ImmutableClass {
    private final Long id;
    private final String name;

    ImmutableClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    Long getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        ImmutableClass immutableObj = new ImmutableClass(1l, "Brajesh Lovanshi");
        long id = immutableObj.getId();
        String name = immutableObj.getName();
        System.out.println("Id " + id + " \nName: " + name);

        ImmutableClass immutableObj1 = new ImmutableClass(2l, "Vicky");
        System.out.println("========\nId " + immutableObj1.getId() + "\nName: " + immutableObj1.getName());
    }
}

/**
 * Immutable Class:
 * <p>
 * An immutable class is one whose state cannot be modified after it is created.
 * Every instance of an immutable class is inherently thread-safe, as its state cannot change after construction.
 * Common use cases include value objects like String, Integer, and custom data types representing entities such as Money, Date, etc.
 * <p>
 * How to Create an Immutable Class
 * <p>
 * Declare the class as final to prevent subclassing.
 * Make all fields private and final to ensure they cannot be modified.
 * Do not provide setters for fields.
 * Initialize all fields via a constructor.
 * Ensure any mutable fields are deeply copied or made immutable.
 */