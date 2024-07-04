package functionalProgramming;

@FunctionalInterface
public interface FunctionalInterFace {
    // abstract method
    void greet(String name);

    // object class method 
    boolean equals(Object object);

    // default method
    default void ownMethod(){
        System.out.println("This is my method.");
    }

    // static method
    static void ownStaticMethod(){
        System.out.println("Own static method.");
    }
}

class FunctionalInterFaceImpl implements FunctionalInterFace {
    
    @Override
    public void greet(String name){
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        FunctionalInterFace functionalInterFace = new FunctionalInterFaceImpl();
        functionalInterFace.greet("Brajesh Lovanshi");
        boolean isEquals = functionalInterFace.equals(new FunctionalInterFaceImpl());
        System.out.println(isEquals);
        functionalInterFace.ownMethod();
        FunctionalInterFace.ownStaticMethod();
    }
}

// Function interface is interface is Java which have atleast one abstract methd
// and annotated with @FunctionalInterface annotation