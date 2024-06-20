import java.util.Arrays;

public class MethodsInJava {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(args));
        // varArgs("one", "two", "three", "four", "five");
        sum(3, 2);
        sum(4, 2, 25);
        System.out.println(Math.pow(3,3));
        // find armstrong number in the range of 0 to 200.
        for (int i = 0; i <= 500; i++) {
            boolean isArmstrong = armStrongNumber(i);
            if (isArmstrong) {
                // System.out.println(i + " Armstrong number");
            }
        }
    }

    // var args:- pass dynamic parameters in java
    public static void varArgs(String... varArgs) {
        System.out.println(Arrays.toString(varArgs));
    }

    // method overloading
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static boolean armStrongNumber(int n) {
        int originalNum = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            // System.out.println(rem + " rem \n");
            n /= 10;
            // System.out.println(n + " n ka division \n");

        }

        return originalNum == sum;
    }
}
