package exceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception in java is unexpected occurances that  occure in program and disrupts the normal flow of execution.
 * Check exception - Compiletime exceptions
 * Unchecked exceptions - Runtime exceptions
 * Null pointer exception
 * Arithmetic exception
 * ArrayOutOfBound exception
 *
 */


class LowSalaryException extends RuntimeException{
    LowSalaryException(String msg){
        super(msg);
    }
}

class Employee{
    private double salary;
    public Employee(double salary){
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class CreditCard{
    void checkEligibility(Employee employee){
        if(employee.getSalary() < 40000){
            throw new LowSalaryException("Salary is low.");
        }
    }

}
public class Exceptions {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary");
        CreditCard creditCard = new CreditCard();
        try {
            creditCard.checkEligibility(new Employee(sc.nextDouble()));
        }catch (LowSalaryException ex){
            System.out.println(ex.getMessage());
        }catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("End of program");

//        Arithmetic exception
    int i = 10;
    int division = 0;
        try{
            division =i/0;
            System.out.println(division);

        }catch (NullPointerException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Ram Ram Ji!");
        }

        //NullPointer exception
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        }
//        IndexOutOfBoundException
        int[] arr = {1,2,4,5};
        try{
            System.out.println(arr[5]);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

// NumberFormatException
        try{
            int num = '2';
        }catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
    }
}

/***
 * 2. Types of Exceptions
 * ✅ Checked Exceptions
 *
 * Handled at compile-time.
 *
 * Examples: IOException, SQLException, FileNotFoundException
 * ✅ Unchecked Exceptions
 *
 * Handled at runtime.
 *
 * Examples: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException
 * ✅ Errors
 *
 * Not meant to be handled by your code.
 *
 * Examples: StackOverflowError, OutOfMemoryError
 * 🔹 3. Keywords in Exception Handling
 * Keyword	Use
 * try	Defines a block of code to test for errors
 * catch	Defines a block of code to handle the error
 * finally	Code that always executes (cleanup code)
 * throw	Manually throw an exception
 * throws	Declare exceptions a method can throw
 *
 * 🔹 6. Best Practices
 * ✅ Catch only specific exceptions.
 * ✅ Avoid catching Exception or Throwable directly.
 * ✅ Always clean up resources in finally or use try-with-resources.
 * ✅ Don’t suppress exceptions (empty catch block).
 * ✅ Create meaningful custom exceptions.
 *
 *
 */
