package exceptionHandling;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Other code....");
//
        int a = 25;
        int b = 0;
        try {
            int output = divide(a, b);
            System.out.println(output);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int[] arr = new int[3];
        try {
            int indexValue = arrLength(arr, 5);
            System.out.println(indexValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String str = null;

        try{
            System.out.println(nullPointerException(str));
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }

        System.out.println("Other code....");
    }

    public static int arrLength(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException aob) {
            throw aob;
        }
    }

    public static int divide(int a, int b) {
        try {
            int output = a / b;
            return output;
        } catch (ArithmeticException ae) {
            throw ae;
        }
    }

    public static int nullPointerException(String str) {
        if(str == null || str.isEmpty()) throw new NullPointerException("String is empty");
        return str.length();
    }
}
