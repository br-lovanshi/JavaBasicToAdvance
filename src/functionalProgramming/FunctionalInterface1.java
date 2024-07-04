package functionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface
public interface FunctionalInterface1 {

    // Abstract method
    public abstract void greet(String name);

    // Default method
    default void defaultMethod() {
        System.out.println("Default method");
    }

    // Static method
    public static void subtract(int a, int b) {
        System.out.println("Static method: " + Math.abs(a - b));
    }

    // Object class method
    @Override
    boolean equals(Object o);
}

class FunctionalInterImpl implements FunctionalInterface1 {
    public static void main(String[] args) {
//        Without lambda expression
        FunctionalInterface1 fun = new FunctionalInterImpl();
//        fun.greet("Brajesh Lovanshi");

//        Using lambda expression
        FunctionalInterface1 fun1 = (String name) -> System.out.println("Hello " + name);
//        fun1.greet("Vicky Lovanshi");

//        fun1.defaultMethod();
//        FunctionalInterface1.subtract(10,30);


//        Predicate
        Predicate<Integer> predicate = p -> p > 10;
//        System.out.println(predicate.test(10));

//        removeIf method
        List<Integer> list = Arrays.asList(1, 10, 3, 5, 9, 2, 5);
        list.removeIf(num -> num > 10);
//        System.out.println(list);

//        Consumer
        Consumer<String> consumer = c -> System.out.println("Hello " + c);
//        consumer.accept("Brajesh Lovanshi");

//        forEach consumer
//        list.forEach(num -> System.out.println(num));
//        list.forEach(System.out::println);

//        Supplier
        Supplier<String> supplier = () -> "Brajesh Lovanshi";
        String name = supplier.get();
//        System.out.println(name);

        Function<String, Integer> function = num -> {
            try {
                return Integer.parseInt(num);
            } catch (NumberFormatException nfe) {
                throw new NumberFormatException("Invalid number!");
            }
        };

        try {
//            int number = function.apply("10ab");
//            System.out.println(number);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        list.stream().forEach(System.out::println);
        List<Integer> list1 = list.stream().filter(num -> num > 2).map(num -> num + 2).collect(Collectors.toList());

//        Convert list of num into list of str
        List<String> list2 = list.stream().map(num -> num.toString()).collect(Collectors.toList());
//        list2.stream().forEach(System.out::println);

//        find max
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        Optional<Integer> min = list.stream().min(Integer::compareTo);
//        System.out.println(max.get() + " " + min.get());
//        max.ifPresent(System.out::println);
//        min.ifPresent(System.out::println);

//        Sorting using stream api
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
//        sortedList.forEach(System.out::println);

//        Sorting custom object
        List<Person> people = Arrays.asList(
                new Person("John", 30),
                new Person("Jane", 25),
                new Person("Jack", 35),
                new Person("Ane", 35)
        );

//        sort people list by age
//        people.stream().sorted((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge())).forEach(System.out::println);

        people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).forEach(System.out::println);
//        sort by age then sort by name
        people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName)).forEach(System.out::println);

//        count
        long count = people.stream().count();
        System.out.println(count);
    }

    @Override
    public void greet(String name) {
        System.out.println("Hello " + name);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/**
 * Functional Programming
 * What is functional programming?
 *
 * Functional programming is a programming paradigm where functions are treated as first-class citizens. It emphasizes immutability and pure functions, which are functions that always produce the same output for the same input and have no side effects.
 * What is a pure function?
 *
 * A pure function is a function that always returns the same result given the same input and has no observable side effects.
 * What is immutability in functional programming?
 *
 * Immutability means that once a data structure is created, it cannot be changed. This helps avoid side effects and makes the program easier to understand and reason about.
 * Lambda Expressions
 * What is a lambda expression in Java?
 *
 * A lambda expression is a concise way to represent an anonymous function. It provides a clear and concise way to implement a single-method interface (functional interface) using an expression.
 * What is the syntax of a lambda expression?
 *
 * The syntax of a lambda expression is (parameters) -> expression or (parameters) -> { statements; }.
 * What is a functional interface?
 *
 * A functional interface is an interface with a single abstract method, which can be implemented by a lambda expression. It may contain multiple default or static methods.
 *
 * -------------------------------------
 * Stream API
 * What is the Stream API?
 *
 * The Stream API is a new abstraction introduced in Java 8 that allows processing sequences of elements in a functional style. It supports operations such as filtering, mapping, and reducing.
 * What is the difference between a Stream and a Collection?
 *
 * A Stream represents a sequence of elements and supports functional-style operations to process the elements. It does not store elements; instead, it conveys data from a source (like a collection) through a pipeline of operations. Collections are in-memory data structures that store elements.
 *
 * How do you create a Stream in Java?
 * List<String> list = Arrays.asList("a", "b", "c");
 * Stream<String> stream = list.stream();
 *
 * What is the difference between intermediate and terminal operations in a Stream?
 *
 * Intermediate operations return a new Stream and are lazy (e.g., filter, collectionFramework.map). Terminal operations trigger the processing and produce a result or a side effect (e.g., collect, forEach).
 *
 * What is the purpose of the collectionFramework.map operation in a Stream?
 *
 * The collectionFramework.map operation applies a function to each element of the stream, transforming them into a new stream of elements. It is used to perform transformations on the data.
 *
 * Advanced Questions
 *
 * How does method reference work in Java?
 * Method references are a shorthand notation of a lambda expression to call a method. For example, Integer::compareTo is a method reference for (a, b) -> Integer.compare(a, b).
 *
 * What is the difference between collectionFramework.map and flatMap in Java Streams?
 * collectionFramework.map applies a function to each element and returns a stream of the resulting elements. flatMap applies a function to each element, which itself returns a stream, and then flattens these resulting streams into a single stream.
 *
 * Explain the concept of lazy evaluation in Streams.
  * Streams use lazy evaluation, meaning that intermediate operations are not executed until a terminal operation is invoked. This allows for optimization and efficiency in processing.
 *
 *  */