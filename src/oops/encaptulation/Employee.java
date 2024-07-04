package oops.encaptulation;

class Employee {
    private Long id;
    private String name;
    private int age;
    double salary;

    public Employee() {

    }

    Employee(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
   public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee(000145l, "Brajesh Lovanshi", 23);
        Employee employee1 = new Employee();
        employee1.setId(0001456l);
        employee1.setName("Vicky Lovanshi");
        employee1.setAge(23);

        System.out.println(employee);
        System.out.println(employee1);

    }
}

/**
 * Important Interview Questions on Encapsulation
 * Q1. What is encapsulation in OOP?
 *
 * Answer: Encapsulation is the technique of bundling the data (variables) and the methods (functions) that operate on the data into a single unit, or class. It restricts direct access to some of the object's components and can prevent the accidental modification of data.
 * Q2. How does encapsulation improve software design?
 *
 * Answer: Encapsulation improves software design by:
 * Protecting the internal state of an object from unintended or harmful changes.
 * Providing a clear and controlled interface for interacting with an object's data.
 * Reducing complexity and increasing maintainability by hiding implementation details.
 * Facilitating easier debugging and testing by isolating changes to specific parts of the code.
 * Q3. How is encapsulation implemented in Java?
 *
 * Answer: Encapsulation in Java is implemented by:
 * Declaring the instance variables of a class as private.
 * Providing public getter and setter methods to access and update the value of private variables.
 * Q4. What are the benefits of using getter and setter methods?
 *
 * Answer: Getter and setter methods provide several benefits:
 * Controlled Access: Control over how a variable is accessed or modified.
 * Validation: Validate the value before assigning it to the variable.
 * Encapsulation: Hide the internal representation of the object.
 * Consistency: Maintain consistency and integrity of the object's state.
 * Q5. Can you give an example where encapsulation is violated and explain how to fix it?
 *
 * Answer: Encapsulation is violated when class fields are made public, exposing them to direct modification from outside the class.
 *
 * Q6. What is the difference between encapsulation and abstraction?
 *
 * Answer: Encapsulation is the technique of hiding the internal state and requiring all interaction to be performed through an object's methods. Abstraction, on the other hand, is the concept of hiding the complex implementation details and showing only the essential features of an object. Encapsulation focuses on restricting access to data, while abstraction focuses on exposing relevant data and operations.
 * Q7. How can encapsulation be used to achieve data hiding?
 *
 * Answer: Encapsulation achieves data hiding by declaring class variables as private and providing public getter and setter methods. This ensures that the data cannot be accessed or modified directly from outside the class, and can only be modified through methods that can enforce rules and validation.*/