package exceptionHandling;

import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
    InvalidAgeException() {
        super();
    }

    InvalidAgeException(String msg) {
        super(msg);
    }
}


public class CustomExceptionExample {
    public static void main(String[] args) {
        System.out.println("Welcome to RTO portal");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        try{
            if (isEligible(age)) {
                System.out.println("You are eligible for a license.");
            }

            System.out.println("Continue further process...");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Other code");

    }


    public static boolean isEligible(int age) throws InvalidAgeException {
        if (age > 18) {
            return true;
        } else {
            throw new InvalidAgeException("You are not eligible for a license.");
        }
    }
}