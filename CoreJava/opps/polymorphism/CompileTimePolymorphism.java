package opps.polymorphism;

/**
 * This is also called as method overloading.
 */

class Calculator{
//    number of parameter and data type
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }

}
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        // number of argument and their types
        cl.sum(2,3);
        cl.sum(4,2,4);
        cl.sum(3.3,3.5);
    }
}
