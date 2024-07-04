package basicConcept;

public class ImmutableStringExample {

    public static void main(String[] args) {

        String fName = "Brajesh"; // store in heap memory string pool area
        String fName1 = fName.toUpperCase();
        System.out.println(fName == fName1); // false

        String fname2 = new String("Brajesh"); // store in heap memory
        System.out.println(fName == fname2); //false because it is checking the memory reference which is different of both
        System.out.println(fName.equals(fname2)); //true because it is checking the value equality only

        String fname3 = "Brajesh";
        System.out.println(fName == fname3); // true

        fName = fName.concat(" Lovanshi");
        System.out.println(fName);

//        Make  object eligible for gc
        String greet = "Hello";
        greet = "Hello world";

        String greet1 = "Hello world1";
        greet = greet1;

        System.out.println("Greet 1 " + greet1);
        System.out.println("Greet " + greet);

        Object obj = new ImmutableStringExample();
        Object obj1 = new ImmutableStringExample();
        obj1 = obj;

        System.out.println(obj);
        System.out.println(obj1);

    }
}
