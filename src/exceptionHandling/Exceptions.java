package exceptionHandling;


/**
 * Exception in java is unexpected occurances that  occure in program and disrupts the normal flow of execution.
 * Check exception - Compiletime exceptions
 * Unchecked exceptions - Runtime exceptions
 * Null pointer exception
 * Arithmetic exception
 * ArrayOutOfBound exception
 *
 */
public class Exceptions {

    public static void main(String[] args) {
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
