package basicConcept;

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name " + this.name + " Age " + this.age);
    }
}

class Employee extends Person {
    private Long id;

    Employee(String name, int age, Long id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID:  " + this.id);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Employee employee = new Employee("Brajesh Lovanshi", 23, 145l);
        employee.display();
    }
}


/**
 * The super keyword in Java is used to refer to the immediate parent class object. It can be used to call parent class methods and access parent class properties. One important use of super is in invoking the parent class constructor.
 * <p>
 * Using super to Call the Parent Class Constructor
 * When creating a subclass, the subclass's constructor can call the parent class's constructor using the super() keyword. This ensures that the parent class is properly initialized before the subclass's initialization logic is executed.
 * <p>
 * Key Points
 * The super() call must be the first statement in the subclass constructor.
 * If a constructor doesn't explicitly call super(), the Java compiler inserts a default super() call to the no-argument constructor of the parent class. If the parent class doesn't have a no-argument constructor, the compiler will throw an error unless an explicit call to a parent constructor is made.
 */