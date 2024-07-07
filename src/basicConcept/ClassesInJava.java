package basicConcept;

import static basicConcept.ClassesInJava.innerClass.innerClassMethod;

//Inner class :- A class inside another class is called inner class, it is used to hide class from outside, encaptulation and used properties with the same class by inner class
public class ClassesInJava {


    class innerClass{
        static  public void innerClassMethod(){
            System.out.println("This is inner class method.");
        }

    }

    public static void main(String[] args) {
        System.out.println("Inside outer class");
        innerClassMethod();
    }
}
