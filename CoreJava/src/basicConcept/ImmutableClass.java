package basicConcept;

import java.util.*;

final public class ImmutableClass {
    private final Long id;
    private final String name;
    private final List<List<String>> groups;

    ImmutableClass(Long id, String name, List<List<String>> groups) {
        this.id = id;
        this.name = name;
        this.groups = deepCopy(groups);
    }

    private List<List<String>> deepCopy(List<List<String>> groups){
        List<List<String>> copy = new ArrayList<>();
        for(List<String> group: groups){
            copy.add(new ArrayList<>(group));
        }
        return Collections.unmodifiableList(copy);
    }
    Long getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    List<List<String>> getGroups(){
        List<List<String>> copy = new ArrayList<>();
        for(List<String> group : this.groups){
            copy.add(new ArrayList<>(group));
        }
        return Collections.unmodifiableList(copy);
    }

    public static void main(String[] args) {

        List<List<String>> groups = new ArrayList<>();
        List<String> group = Arrays.asList("Ram", "Shyam");
        groups.add(group);
//        ImmutableClass immutableObj = new ImmutableClass(1l, "Brajesh Lovanshi", groups);
//        long id = immutableObj.getId();
//        String name = immutableObj.getName();
//        System.out.println("Id " + id + " \nName: " + name);

        ImmutableClass immutableObj1 = new ImmutableClass(2l, "Vicky", groups);
        System.out.println("========\nId " + immutableObj1.getId() + "\nName: " + immutableObj1.getName() + "\nGroups: "+ immutableObj1.groups);
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